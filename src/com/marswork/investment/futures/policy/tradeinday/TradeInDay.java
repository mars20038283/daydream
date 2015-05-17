package com.marswork.investment.futures.policy.tradeinday;

import java.io.FileOutputStream;
import java.util.ArrayList;
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
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.policy.tradeinday.printer.ErrorSheetCreator;
import com.marswork.investment.futures.policy.tradeinday.printer.SummarySheetCreator;
import com.marswork.investment.futures.policy.tradeinday.printer.TingbanSheetCreator;
import com.marswork.investment.futures.policy.tradeinday.printer.TradeListSheetCreator;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TradeInDay extends AbstractPolicy {

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
	 * 开仓时间--时
	 */
	private int kaicangshi = 11;

	/**
	 * 开仓时间--分
	 */
	private int kaicangfen = 29;

	/**
	 * 控制开仓开始时间
	 */
	private int kongzhikaicangkaishi_shi = 11;

	/**
	 * 控制开仓开始时间
	 */
	private int kongzhikaicangkaishi_fen = 00;

	/**
	 * 控制开仓结束时间
	 */
	private int kongzhikaicangjieshu_shi = 11;

	/**
	 * 控制开仓结束时间
	 */
	private int kongzhikaicangjieshu_fen = 28;

	/**
	 * 控制开仓波动阈值
	 */
	private double bodongyuzhi = 0.01;

	private boolean printTrend = false;

	private List<String> tingbanList = new ArrayList<String>();

	public TradeInDay() {

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
//		this.addGoods(new Goods("dlax01"));
//		 this.addGoods(new Goods("sqru05"));
//		
//		 // 设置开始时间
		 c.set(Calendar.YEAR, 2013);
		 c.set(Calendar.MONTH, Calendar.AUGUST);
		 c.set(Calendar.DATE, 1);
		 c.set(Calendar.HOUR_OF_DAY, 9);
		 c.set(Calendar.MINUTE, 1);
		 c.set(Calendar.SECOND, 0);
		 this.setFromDate(c.getTime());
//		
//		 // 设置结束时间
//		 c.set(Calendar.YEAR, 2008);
//		 c.set(Calendar.MONTH, Calendar.DECEMBER);
//		 c.set(Calendar.DATE, 26);
//		 c.set(Calendar.HOUR_OF_DAY, 15);
//		 c.set(Calendar.MINUTE, 0);
//		 c.set(Calendar.SECOND, 0);
//		 this.setToDate(c.getTime());

	}

	@Override
	public Trade kaiCang(VirtureAccount account, Goods goods, Date date) {
		BasicUtils.out(BaseDate.formatDateToMinites(date));
		try {
			if (date.after(this.getThisMunite(date))) {
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
						+ " 上午比昨日收盘涨幅为 " + Math.abs(1 - zf) + " 小于 "
						+ zhangDieFu + "，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}
			AtomicData moring29m = SqlUtils.getDataInMinite(goods,
					this.getLastMunite(date, goods));
			boolean isZhang = yesterdayShoupan < moring29m.getShoupan();
			double huiluo;
			if (isZhang) {
				// 当前为涨
				huiluo = IndicatorsManager.getDateRangeHigh(goods,
						DateUtils.getFirstMinuteOfDay(date),
						moring29m.getDate())
						/ moring29m.getShoupan();
				if (huiluo > higtShoupan) {
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 上午最高价比上午结束价 " + huiluo
							+ " 大于 " + higtShoupan + "，不进行交易");
					this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return null;
				}
			} else {
				// 当前为跌
				BasicUtils.out(moring29m.getDate());
				huiluo = moring29m.getShoupan()
						/ IndicatorsManager.getDateRangeLow(goods,
								DateUtils.getFirstMinuteOfDay(date),
								moring29m.getDate());
				if (huiluo > higtShoupan) {
					BasicUtils.out(goods.getFlag() + " 在 "
							+ DateUtils.format(date) + " 上午结束价比上午最低价 " + huiluo
							+ " 大于 " + higtShoupan + "，不进行交易");
					this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
					return null;
				}
			}

			AtomicData data_kongzhikaishi = SqlUtils.getDataInMinite(goods,
					kongzhikaicangkaishi(date));
			AtomicData data_kongzhijieshu = SqlUtils.getDataInMinite(goods,
					kongzhikaicangjieshu(date));
			double kongzhi = Math.abs(data_kongzhijieshu.getShoupan()
					- data_kongzhikaishi.getShoupan())
					/ data_kongzhikaishi.getShoupan();
			if (kongzhi > bodongyuzhi) {
				BasicUtils.out(goods.getFlag() + " 在 "
						+ DateUtils.format(kongzhikaicangjieshu(date)) + " 波动 "
						+ kongzhi + "  大于阈值 " + bodongyuzhi + "，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}

			if (zf > 1.04 || zf < 0.96) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 上午比昨日收盘涨跌幅超过4%，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				tingbanList.add(goods.getFlag() + " "
						+ BaseDate.formatDateToDays(date));
				return null;
			}

			if (IndicatorsManager.isTingBanBoforeKaicang(goods,
					this.getThisMunite(date))) {
				BasicUtils.out(goods.getFlag() + " 在 "
						+ DateUtils.format(this.getThisMunite(date))
						+ " 上午已停板，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				tingbanList.add(goods.getFlag() + " "
						+ BaseDate.formatDateToDays(date));
				return null;
			}
			BasicUtils.out(goods.getFlag() + " 开仓了："
					+ (isZhang ? "是买进" : "是卖出"));
			date = this.getThisMunite(date);
			Trade trade;
			if (isZhang) {
				//买进加差价
				double price = SqlUtils.getAvgPriceInMinite(goods, date)
						+ goods.getFutures().getChaJia();
				trade = new Trade(account, date, true, true, goods, price, 1);
				trade.setSignal("开仓--涨");
				trade.setSemaphore((zf - 1) * 100);
				trade.setHuiluo(NumberUtils.formatNumber((huiluo - 1) * 100));
			} else {
				//卖出减差价
				double price = SqlUtils.getAvgPriceInMinite(goods, date)
						- goods.getFutures().getChaJia();
				trade = new Trade(account, date, true, false, goods, price, 1);
				trade.setSignal("开仓--跌");
				trade.setSemaphore((1 - zf) * 100);
				trade.setHuiluo(NumberUtils.formatNumber((huiluo - 1) * 100));
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
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 最后一分钟卖出");
						Trade trade = new Trade(account, date, false, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("收盘平");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
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
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " 最后一分钟买进");
						Trade trade = new Trade(account, date, false, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										+ goods.getFutures().getChaJia(), 1);
						trade.setSignal("收盘平");
						this.setSkipToTime(DateUtils
								.getFirstMinuteOfNextDay(date));
						return trade;
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
			Sheet sheet3 = wb.createSheet("停板记录");
			Sheet sheet4 = wb.createSheet("数据异常");
			SummarySheetCreator.createSummarySheet(this, account, sheet1,
					tradeRecoreds);
			TradeListSheetCreator.createTradeListSheet(account, sheet2,
					tradeRecoreds, this);
			TingbanSheetCreator.createErrorSheet(sheet3, tingbanList);
			ErrorSheetCreator.createErrorSheet(sheet4, errors);

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

	public Date kongzhikaicangkaishi(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, kongzhikaicangkaishi_shi);
		c.set(Calendar.MINUTE, kongzhikaicangkaishi_fen);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	public Date kongzhikaicangjieshu(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, kongzhikaicangjieshu_shi);
		c.set(Calendar.MINUTE, kongzhikaicangjieshu_fen);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	@Override
	public String getName() {
		return "可变开仓时间的隔日交易";
	}

	@Override
	public boolean printTrend() {
		return printTrend;
	}

}
