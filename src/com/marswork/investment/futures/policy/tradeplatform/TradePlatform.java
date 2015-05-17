package com.marswork.investment.futures.policy.tradeplatform;

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
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.policy.tradeplatform.printer.ErrorSheetCreator;
import com.marswork.investment.futures.policy.tradeplatform.printer.SummarySheetCreator;
import com.marswork.investment.futures.policy.tradeplatform.printer.TradeListSheetCreator;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TradePlatform extends AbstractPolicy {

	/**
	 * 昨日成交量必须大于
	 */
	private int yesterdayTradeCondition = 50000;
	/**
	 * 上午结束前相比昨日收盘涨幅或跌幅必须大于
	 */
	private double zhangDieFu = 0.01;
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
	private int kaishishi = 10;

	/**
	 * 开仓时间--分
	 */
	private int kaishifen = 31;

	/**
	 * 开仓时间--时
	 */
	private int jieshushi = 11;

	/**
	 * 开仓时间--分
	 */
	private int jieshufen = 30;

	/**
	 * 用的是ma几
	 */
	private int macanshu = 3;

	/**
	 * 平台持续时间
	 */
	private int platformDuration = 45;

	private boolean printTrend = true;

	private Map<Date, Integer> ma = new HashMap<Date, Integer>();

	public TradePlatform() {

		Calendar c = Calendar.getInstance();

		// 设置参与的商品
		// try {
		// for (String flag : DbSysInfo.getAllUserTable()) {
		// if (!flag.endsWith("mi") && !flag.contains("trade")) {
		// try {
		// this.addGoods(new Goods(flag));
		// } catch (Exception e) {
		// continue;
		// }
		// }
		// }
		// } catch (MarsException e) {
		// e.printStackTrace();
		// }

		// 设置参与的商品
		this.addGoods(new Goods("sqrb01"));
		this.addGoods(new Goods("sqrb05"));
		this.addGoods(new Goods("sqru01"));
		this.addGoods(new Goods("sqru05"));
		this.addGoods(new Goods("dlc01"));
		this.addGoods(new Goods("dlc05"));
		this.addGoods(new Goods("dly01"));
		this.addGoods(new Goods("dly05"));
		this.addGoods(new Goods("zzta01"));
		this.addGoods(new Goods("zzta05"));

		// 设置开始时间
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 4);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);
		this.setFromDate(c.getTime());

		// 设置结束时间
//		c.set(Calendar.YEAR, 2013);
//		c.set(Calendar.MONTH, Calendar.JANUARY);
//		c.set(Calendar.DATE, 4);
//		c.set(Calendar.HOUR_OF_DAY, 15);
//		c.set(Calendar.MINUTE, 0);
//		c.set(Calendar.SECOND, 0);
//		this.setToDate(c.getTime());

	}

	@Override
	public Trade kaiCang(VirtureAccount account, Goods goods, Date date) {

		try {
			if (ChengjiaoHistory.getChengjiao(goods, date) < yesterdayTradeCondition) {
				BasicUtils.out(goods.getFlag() + " 在 " + DateUtils.format(date)
						+ " 前一天的交易量小于 " + yesterdayTradeCondition + "，不进行交易");
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
				return null;
			}

			if (date.before(this.kaishishijian(date))) {
				this.setSkipToTime(this.kaishishijian(date));
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (account.getLastTrade() == null
					|| !account.getLastTrade().isOpen()) {
				Date fromDate = DateUtils.minusMinute(goods, date,
						platformDuration);
				Date toDate = DateUtils.minusMinute(goods, date);
				double maMin = this.getMaMin(goods, fromDate, toDate);
				double maMax = this.getMaMax(goods, fromDate, toDate);

				if (maMax - maMin <= (maMax + maMin) * 0.25 / 200) { // 形成平台
					BasicUtils.out("平台形成：" + (maMax - maMin) + "--"
							+ (maMax + maMin) * 0.25 / 200);
					double lastShoupan = SqlUtils
							.getDataInMinite(goods, toDate).getShoupan();
					BasicUtils.out(lastShoupan);
					BasicUtils.out(IndicatorsManager.getDateRangeHigh(goods,
							fromDate, toDate));
					if (lastShoupan >= IndicatorsManager.getDateRangeHigh(goods,
							fromDate, toDate)) {
						BasicUtils.out("开仓买进:"
								+ BaseDate.formatDateToMinites(date));
						double price = SqlUtils
								.getAvgPriceInMinite(goods, date)
								+ goods.getFutures().getChaJia();
						Trade trade = new Trade(account, date, true, true,
								goods, price, 1);
						trade.setSignal("开仓--向上突破平台");
						return trade;
					}
					if (lastShoupan <= IndicatorsManager.getDateRangeLow(goods,
							fromDate, toDate)) {
						BasicUtils.out("开仓卖出:"
								+ BaseDate.formatDateToMinites(date));
						double price = SqlUtils
								.getAvgPriceInMinite(goods, date)
								- goods.getFutures().getChaJia();
						Trade trade = new Trade(account, date, true, false,
								goods, price, 1);
						trade.setSignal("开仓--向下突破平台");
						return trade;
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Trade lastTrade = account.getLastTrade();
			if (date.equals(this.jieshushijian(date))
					&& (lastTrade == null || !lastTrade.isOpen())) {
				this.setSkipToTime(DateUtils.getFirstMinuteOfNextDay(date));
			}
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

	public Date kaishishijian(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, kaishishi);
		c.set(Calendar.MINUTE, kaishifen);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	public Date jieshushijian(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, jieshushi);
		c.set(Calendar.MINUTE, jieshufen);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	private int getMa(Goods goods, Date date) throws MarsException {
		Integer i = ma.get(date);
		if (i == null) {
			i = IndicatorsManager.getMinuteMa(goods, date, macanshu);
			ma.put(date, i);
		}
		return i;
	}

	private int getMaMax(Goods goods, Date formDate, Date toDate)
			throws MarsException {
		Date currDate = formDate;
		int maxMa = Integer.MIN_VALUE;
		while (!currDate.after(toDate)) {
			int temp = this.getMa(goods, currDate);
			if (temp > maxMa) {
				maxMa = temp;
			}
			currDate = DateUtils.addMinute(goods, currDate);
		}
		return maxMa;
	}

	private int getMaMin(Goods goods, Date formDate, Date toDate)
			throws MarsException {
		Date currDate = formDate;
		int minMa = Integer.MAX_VALUE;
		while (!currDate.after(toDate)) {
			int temp = this.getMa(goods, currDate);
			if (temp < minMa) {
				minMa = temp;
			}
			currDate = DateUtils.addMinute(goods, currDate);
		}
		return minMa;
	}

	@Override
	public String getName() {
		return "平台突破交易";
	}

	@Override
	public boolean printTrend() {
		return printTrend;
	}

}
