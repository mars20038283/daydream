package com.marswork.investment.futures.policy.tradeopenvariable;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.exceptions.object.datetime.NotDateTimeException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.policy.tradeopenvariable.printer.ErrorSheetCreator;
import com.marswork.investment.futures.policy.tradeopenvariable.printer.SummarySheetCreator;
import com.marswork.investment.futures.policy.tradeopenvariable.printer.TradeListSheetCreator;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TradeGeYe extends AbstractPolicy {

	/**
	 * 昨日成交量必须大于
	 */
	private int yesterdayTradeCondition = 50000;
	/**
	 * 上午结束前相比昨日收盘涨幅或跌幅必须大于
	 */
	private double zhangDieFu = 0.01;
	/**
	 * 今日上午最高价不得高于上午结束前最后价格的 或上午最低价不得高于上午结束前最后价格的
	 */
	private double higtShoupan = 1.005;
	/**
	 * 止损止盈指标
	 */
	private double dieFu = 1.005;

	/**
	 * 获利平仓指标
	 */
	private double huoli = 1.025;

	/**
	 * 隔夜开盘几分钟后平仓
	 */
	private int pingcangshijan = 2;

	/**
	 * 开仓时间--时
	 */
	private int kaicangshi = 14;

	/**
	 * 开仓时间--分
	 */
	private int kaicangfen = 55;

	public TradeGeYe() {

		Calendar c = Calendar.getInstance();

		// 设置参与的商品
		try {
			for (String flag : DbSysInfo.getAllUserTable()) {
				if (!flag.endsWith("mi") && !flag.contains("trade")) {
					try {
						this.addGoods(new Goods(flag));
					} catch (Exception e) {
						continue;
					}
				}
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}

		// 设置参与的商品
//		this.addGoods(new Goods("sqru05"));
//
//		// 设置开始时间
//		c.set(Calendar.YEAR, 2013);
//		c.set(Calendar.MONTH, Calendar.JANUARY);
//		c.set(Calendar.DATE, 4);
//		c.set(Calendar.HOUR_OF_DAY, 9);
//		c.set(Calendar.MINUTE, 1);
//		c.set(Calendar.SECOND, 0);
//		this.setFromDate(c.getTime());

		// 设置结束时间
		// c.set(Calendar.YEAR, 2013);
		// c.set(Calendar.MONTH, Calendar.MAY);
		// c.set(Calendar.DATE, 15);
		// c.set(Calendar.HOUR_OF_DAY, 15);
		// c.set(Calendar.MINUTE, 0);
		// c.set(Calendar.SECOND, 0);
		// this.setToDate(c.getTime());

	}

	@Override
	public Trade kaiCang(VirtureAccount account, Goods goods, Date date) {
		try {
			if (isTheLastDay(date)) {
				return null;
			}
			if (!DateUtils.isMorning(date)
					|| !date.after(DateUtils.addMinute(goods,
							DateUtils.getFirstMinuteOfDay(date), pingcangshijan))) {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (ChengjiaoHistory.getChengjiao(goods, date) < yesterdayTradeCondition) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 前一天的交易量小于 " + yesterdayTradeCondition + "，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}
			double yesterdayShoupan = IndicatorsManager.getYesterdayShoupan(
					goods, date);
			double zf = SqlUtils.getDataInMinite(goods,
					this.getLastMunite(date, goods)).getShoupan()
					/ yesterdayShoupan;
			if (zf > 1 - zhangDieFu && zf < 1 + zhangDieFu) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 上午比昨日收盘涨幅为 " + zf + " 小于 " + zhangDieFu + "，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}
			if (zf > 1.04 || zf < 0.96) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 上午比昨日收盘涨跌幅超过4%，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}
			if ((zf > 1.03 || zf < 0.97)
					&& IndicatorsManager.isTingBanBoforeKaicang(goods, date)) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 上午已停板，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}
			AtomicData moring29m = SqlUtils.getDataInMinite(goods,
					this.getLastMunite(date, goods));
			boolean isZhang = yesterdayShoupan < moring29m.getShoupan();
			if (isZhang) {
				// 当前为涨
				if (IndicatorsManager.getDateRangeHigh(goods,
						DateUtils.getFirstMinuteOfDay(date),
						moring29m.getDate())
						/ moring29m.getShoupan() > higtShoupan) {
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 上午最高价比上午结束价大于 "
							+ higtShoupan + "，不进行交易");
					this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return null;
				}
			} else {
				// 当前为跌
				if (moring29m.getShoupan()
						/ IndicatorsManager.getDateRangeLow(goods,
								DateUtils.getFirstMinuteOfDay(date),
								moring29m.getDate()) > higtShoupan) {
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 上午结束价比上午最低价大于 "
							+ higtShoupan + "，不进行交易");
					this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return null;
				}
			}

			BasicUtils.out(goods.getFlag() + " 开仓了："
					+ (isZhang ? "是买进" : "是卖出"));
			date = this.getThisMunite(date);
			Trade trade;
			if (isZhang) {
				double price = SqlUtils.getAvgPriceInMinite(goods, date)
						+ goods.getFutures().getChaJia();
				trade = new Trade(account, date, true, true, goods, price, 1);
				trade.setSignal("开仓--涨");
				trade.setSemaphore((zf - 1) * 100);
			} else {
				double price = SqlUtils.getAvgPriceInMinite(goods, date)
						- goods.getFutures().getChaJia();
				trade = new Trade(account, date, true, false, goods, price, 1);
				trade.setSignal("开仓--跌");
				trade.setSemaphore((1 - zf) * 100);
			}
			this.setSkipToTime(DateUtils.addMinute(goods, date));
			return trade;
		} catch (NullPointerException e) {
		} catch (IndexOutOfBoundsException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
		} catch (DateOutOfRangeException e) {
		} catch (NotDateTimeException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Trade pingCang(VirtureAccount account, Goods goods, Date date) {
		// 隔夜平仓
		try {
			if (date.equals(DateUtils.addMinute(goods,
					DateUtils.getFirstMinuteOfDay(date), pingcangshijan))
					&& account.getChiCang(goods) != 0) {
				if (account.getLastTrade().isIn()) {// 上一次开仓是买进
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 隔夜卖出");
					Trade trade = new Trade(account, date, false, false, goods,
							SqlUtils.getAvgPriceInMinite(goods, date)
									- goods.getFutures().getChaJia(), 1);
					trade.setSignal("隔夜平");
					// this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return trade;
				} else {
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 隔夜买进");
					Trade trade = new Trade(account, date, false, true, goods,
							SqlUtils.getAvgPriceInMinite(goods, date)
									+ goods.getFutures().getChaJia(), 1);
					trade.setSignal("隔夜平");
					// this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return trade;
				}
			}
		} catch (MarsException e1) {
		}
		// 下午平仓
		try {
			Trade lastTrade = account.getLastTrade();
			if (lastTrade == null || !lastTrade.isOpen()) {
				return null;
			}
			double lastExtremeHigt = IndicatorsManager.getDateRangeHigh(goods,
					lastTrade.getDate(), DateUtils.minusMinute(goods, date));
			double lastExtremeLow = IndicatorsManager.getDateRangeLow(goods,
					lastTrade.getDate(), DateUtils.minusMinute(goods, date));
			if (DateUtils.isAfterNoon(date)) {
				if (account.getLastTrade().isIn()) {// 上一次开仓是买进
					if (lastExtremeHigt
							/ SqlUtils.getDataInMinite(goods, date)
									.getShoupan() >= dieFu) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 低于止盈点，止盈卖出");
						Trade trade = new Trade(account, date, false, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("止盈--卖");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (account.getLastTrade().getPrice()
							/ SqlUtils.getDataInMinite(goods, date)
									.getShoupan() >= dieFu) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 低于止损点，止损卖出");
						Trade trade = new Trade(account, date, false, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("止损--卖");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (!IndicatorsManager.isNiuShi(goods, account
							.getLastTrade().getDate())
							&& SqlUtils.getDataInMinite(goods, date)
									.getShoupan()
									/ account.getLastTrade().getPrice() >= huoli) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 获利卖出");
						Trade trade = new Trade(account, date, false, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("获利--卖");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (DateUtils.isLastMiniteOfDay(date)) {
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return null;
					}
				} else {// 上一次开仓是卖出
					if (SqlUtils.getDataInMinite(goods, date).getShoupan()
							/ lastExtremeLow >= dieFu) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 高于止盈点，止盈买进");
						Trade trade = new Trade(account, date, false, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										+ goods.getFutures().getChaJia(), 1);
						trade.setSignal("止盈--买");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (SqlUtils.getDataInMinite(goods, date).getShoupan()
							/ account.getLastTrade().getPrice() >= dieFu) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 高于止损点，止损买进");
						Trade trade = new Trade(account, date, false, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										+ goods.getFutures().getChaJia(), 1);
						trade.setSignal("止损--买");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (IndicatorsManager.isNiuShi(goods, account
							.getLastTrade().getDate())
							&& account.getLastTrade().getPrice()
									/ SqlUtils.getDataInMinite(goods, date)
											.getShoupan() >= huoli) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 获利买进");
						Trade trade = new Trade(account, date, false, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										+ goods.getFutures().getChaJia(), 1);
						trade.setSignal("获利--买");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
					}
					if (DateUtils.isLastMiniteOfDay(date)) {
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return null;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void createResultExcel(VirtureAccount account,
			List<Trade> tradeRecoreds) {
		try {
			Workbook wb = new HSSFWorkbook(); // or new XSSFWorkbook();

			// 处理数据
			Map<Trade, String> errors = new HashMap<Trade, String>();
			tradeRecoreds = removeInvalidTrade(tradeRecoreds, errors);

			Sheet sheet1 = wb.createSheet("交易概况");
			Sheet sheet2 = wb.createSheet("交易记录");
			Sheet sheet3 = wb.createSheet("数据异常");
			SummarySheetCreator.createSummarySheet(this, account, sheet1,
					tradeRecoreds);
			TradeListSheetCreator.createTradeListSheet(account, sheet2,
					tradeRecoreds, this);
			ErrorSheetCreator.createErrorSheet(sheet3, errors);

			// FacetedSheetCreator.createFacetedSheet(policy, account, wb,
			// tradeRecoreds);
			FileOutputStream fileOut = new FileOutputStream("c:/workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Date getThisMunite(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, kaicangshi);
		c.set(Calendar.MINUTE, kaicangfen);
		return c.getTime();
	}

	public Date getLastMunite(Date date, Goods goods) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, kaicangshi);
		c.set(Calendar.MINUTE, kaicangfen);
		Date d = c.getTime();
		try {
			return DateUtils.minusMinute(goods, d);
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public String getName() {
		return "可变开仓时间的隔日交易";
	}

	@Override
	public boolean printTrend() {
		// TODO Auto-generated method stub
		return false;
	}

}
