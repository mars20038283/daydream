package com.marswork.investment.futures.policy.trademacd;

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
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.indicator.macd.Macd10m;
import com.marswork.investment.futures.indicator.macd.Macd30m;
import com.marswork.investment.futures.indicator.macd.MacdData;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.policy.trademacd.printer.ErrorSheetCreator;
import com.marswork.investment.futures.policy.trademacd.printer.SummarySheetCreator;
import com.marswork.investment.futures.policy.trademacd.printer.TradeListSheetCreator;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TradeMacd extends AbstractPolicy {

	/**
	 * 昨日成交量必须大于
	 */
	private int yesterdayTradeCondition = 50000;

	private Macd30m macd5m;

	private MacdData currMacd;

	private MacdData thisMacd;

	public TradeMacd() {

		Calendar c = Calendar.getInstance();

		// 设置参与的商品
//		try {
//			for (String flag : DbSysInfo.getAllUserTable()) {
//				if (!flag.endsWith("mi") && !flag.contains("trade")) {
//					try {
//						if (flag.contains("dlm01"))
//							this.addGoods(new Goods(flag));
//					} catch (Exception e) {
//						continue;
//					}
//				}
//			}
//		} catch (MarsException e) {
//			e.printStackTrace();
//		}

		// 设置参与的商品
		 this.addGoods(new Goods("dly01"));
		
		 // 设置开始时间
		 c.set(Calendar.YEAR, 2013);
		 c.set(Calendar.MONTH, Calendar.JANUARY);
		 c.set(Calendar.DATE, 4);
		 c.set(Calendar.HOUR_OF_DAY, 9);
		 c.set(Calendar.MINUTE, 1);
		 c.set(Calendar.SECOND, 0);
		 this.setFromDate(c.getTime());
		
		 // 设置结束时间
		 c.set(Calendar.YEAR, 2013);
		 c.set(Calendar.MONTH, Calendar.MAY);
		 c.set(Calendar.DATE, 15);
		 c.set(Calendar.HOUR_OF_DAY, 15);
		 c.set(Calendar.MINUTE, 0);
		 c.set(Calendar.SECOND, 0);
		 this.setToDate(c.getTime());

	}

	@Override
	public void beforeGoods(Goods goods) {
		macd5m = new Macd30m(goods);
		currMacd = null;
		thisMacd = null;
		System.gc();
	}

	@Override
	public void beforeThisMinute(Goods goods, Date date) {
		thisMacd = macd5m.getMacdData(date);
	}

	@Override
	public void afterThisMinute(Goods goods, Date date) {
		if (thisMacd != null) {
			currMacd = thisMacd;
		}
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
			if (account.getLastTrade() == null
					|| !account.getLastTrade().isOpen()) {
				if (date.equals(this.getToDate())) {
					return null;
				}
				if (currMacd != null && thisMacd != null) {
					if (currMacd.getMacd() < 0 && thisMacd.getMacd() > 0) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " macd由负变正，开仓买进");
						Trade trade = new Trade(account, date, true, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("macd--开仓买进");
						return trade;
					} else if (currMacd.getMacd() > 0 && thisMacd.getMacd() < 0) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " macd由正变负，开仓卖出");
						Trade trade = new Trade(account, date, true, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("macd--开仓卖出");
						return trade;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Trade pingCang(VirtureAccount account, Goods goods, Date date) {
		try {
			if (date.equals(this.getToDate()) && account.getLastTrade() != null
					&& account.getLastTrade().isOpen()) {
				if (account.getLastTrade().isIn()) {
					Trade trade = new Trade(account, date, false, false, goods,
							SqlUtils.getAvgPriceInMinite(goods, date)
									- goods.getFutures().getChaJia(), 1);
					trade.setSignal("最后一分钟--卖");
					return trade;
				} else {
					Trade trade = new Trade(account, date, false, true, goods,
							SqlUtils.getAvgPriceInMinite(goods, date)
									+ goods.getFutures().getChaJia(), 1);
					trade.setSignal("最后一分钟--买");
					return trade;
				}
			}
			if (account.getLastTrade() != null
					&& account.getLastTrade().isOpen()
					&& !account.getLastTrade().getDate().equals(date)) {
				if (currMacd != null && thisMacd != null) {
					if (currMacd.getMacd() < 0 && thisMacd.getMacd() > 0) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " macd由负变正，平仓买进");
						Trade trade = new Trade(account, date, false, true,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										+ goods.getFutures().getChaJia(), 1);
						trade.setSignal("macd--平仓买进");
						return trade;
					} else if (currMacd.getMacd() > 0 && thisMacd.getMacd() < 0) {
						BasicUtils.out(goods.getFlag() + " 在 "
								+ DateUtils.format(date) + " macd由正变负，平仓卖出");
						Trade trade = new Trade(account, date, false, false,
								goods,
								SqlUtils.getAvgPriceInMinite(goods, date)
										- goods.getFutures().getChaJia(), 1);
						trade.setSignal("macd--平仓卖出");
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

	@Override
	public String getName() {
		return "macd交易";
	}

	@Override
	public boolean printTrend() {
		return true;
	}

}
