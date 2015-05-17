package com.marswork.investment.futures.policy.tradeplatform.printer;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.policy.trademacd.TradeMacd;
import com.marswork.investment.futures.policy.tradeplatform.TradePlatform;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class CopyOfTradeListSheetCreator {

	private static JfreeChartPrinter jFreeChartPrinter = new JfreeChartPrinter();

	public static void createTradeListSheet(VirtureAccount account,
			Sheet sheet, List<Trade> tradeRecoreds, TradePlatform policy)
			throws MarsException {
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("交易所");
		head.createCell(1).setCellValue("品种");
		head.createCell(2).setCellValue("标识");
		head.createCell(3).setCellValue("交割月份");
		head.createCell(4).setCellValue("开/平仓");
		head.createCell(5).setCellValue("日内/隔夜");
		head.createCell(6).setCellValue("买卖方向");
		head.createCell(7).setCellValue("交易日期");
		head.createCell(8).setCellValue("交易时间");
		head.createCell(9).setCellValue("交易年份");
		head.createCell(10).setCellValue("交易价格");
		head.createCell(11).setCellValue("开仓价格");
		head.createCell(12).setCellValue("交易数量");
		head.createCell(13).setCellValue("保证金");
		head.createCell(14).setCellValue("平仓类型");
		head.createCell(15).setCellValue("涨跌幅");
		head.createCell(16).setCellValue("手续费");
		head.createCell(17).setCellValue("交易总额");
		head.createCell(18).setCellValue("盈亏点数");
		head.createCell(19).setCellValue("净盈亏");
		head.createCell(20).setCellValue("收益率");
		head.createCell(21).setCellValue("当日成交量");

		for (int i = 0; i < tradeRecoreds.size(); i++) {
			Trade trade = tradeRecoreds.get(i);

			if (policy.printTrend()) {
				jFreeChartPrinter.setTrade(trade);
				try {
					BasicUtils.out("开始作图:"
							+ BaseDate.formatDateToMinites(trade.getDate()));
					jFreeChartPrinter.doPrint();
					BasicUtils.out("结束作图");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			Row data = sheet.createRow(i + 1);
			data.createCell(0).setCellValue(
					trade.getGoods().getFutures().getPlace());
			data.createCell(1).setCellValue(
					trade.getGoods().getFutures().getCategoryName());
			data.createCell(2).setCellValue(trade.getGoods().getFlag());
			data.createCell(3).setCellValue(trade.getGoods().getJiaogeYuefen());
			data.createCell(4).setCellValue(trade.isOpen() ? "开仓" : "平仓");
			data.createCell(5).setCellValue("平隔夜");
			data.createCell(6).setCellValue(trade.isIn() ? "买进" : "卖出");
			data.createCell(7).setCellValue(
					DateUtils.format(trade.getDate()).substring(0, 10));
			data.createCell(8).setCellValue(
					DateUtils.format(trade.getDate()).substring(11));
			data.createCell(9).setCellValue(DateUtils.getYear(trade.getDate()));
			data.createCell(10).setCellValue(trade.getPrice());
			if (!trade.isOpen()) {
				data.createCell(11).setCellValue(
						tradeRecoreds.get(i - 1).getPrice());
			}
			data.createCell(12).setCellValue(trade.getShou());
			if (trade.isOpen()) {
				data.createCell(13).setCellValue(trade.getBaozhengjin());
			} else {
				data.createCell(13).setCellValue(
						tradeRecoreds.get(i - 1).getBaozhengjin());
			}
			data.createCell(14).setCellValue(trade.getSignal());
			try {
				if (trade.isOpen()) {
					data.createCell(15).setCellValue(
							NumberUtils.formatNumber(trade.getSemaphore()));
				} else {
					data.createCell(15).setCellValue(
							NumberUtils.formatNumber(tradeRecoreds.get(i - 1)
									.getSemaphore()));
				}
			} catch (Exception e1) {
			}

			Trade lastTrade = null;
			try {
				lastTrade = tradeRecoreds.get(i - 1);
			} catch (Exception e1) {
			}

			data.createCell(16).setCellValue(
					NumberUtils.formatNumber(trade.getShouXuFei()));
			data.createCell(17).setCellValue(
					NumberUtils.formatNumber(trade.getZongJine()));

			if (!trade.isOpen()) {
				if (!trade.isIn()) {
					try {
						if (lastTrade.isIn()) {
							data.createCell(18).setCellValue(
									trade.getPrice() - lastTrade.getPrice());
							data.createCell(19).setCellValue(
									NumberUtils.formatNumber(trade
											.getZongJine()
											- lastTrade.getZongJine()));
							data.createCell(20)
									.setCellValue(
											NumberUtils.formatNumber((trade
													.getZongJine() - lastTrade
													.getZongJine())
													/ lastTrade
															.getBaozhengjin()
													* 100));
							data.createCell(21).setCellValue(
									ChengjiaoHistory.getChengjiao(
											trade.getGoods(), trade.getDate()));
						}
					} catch (Exception e) {
					}
				} else {
					try {
						if (!lastTrade.isIn()) {
							data.createCell(18).setCellValue(
									lastTrade.getPrice() - trade.getPrice());
							data.createCell(19).setCellValue(
									NumberUtils.formatNumber(lastTrade
											.getZongJine()
											- trade.getZongJine()));
							data.createCell(20)
									.setCellValue(
											NumberUtils.formatNumber((lastTrade
													.getZongJine() - trade
													.getZongJine())
													/ lastTrade
															.getBaozhengjin()
													* 100));
							data.createCell(21).setCellValue(
									ChengjiaoHistory.getChengjiao(
											trade.getGoods(), trade.getDate()));
						}
					} catch (Exception e) {
					}
				}

			}
		}
	}
}
