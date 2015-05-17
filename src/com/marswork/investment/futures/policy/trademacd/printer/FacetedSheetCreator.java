package com.marswork.investment.futures.policy.trademacd.printer;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;

public class FacetedSheetCreator {

	public static void createFacetedSheet(AbstractPolicy policy,
			VirtureAccount account, Workbook wb, List<Trade> tradeRecoreds)
			throws MarsException {
		int index;
		for (Goods goods : policy.getGoods()) {
			index = 0;
			Sheet sheet = wb.createSheet(goods.getFlag());
			Row head = sheet.createRow(0);
			head.createCell(0).setCellValue("交易所");
			head.createCell(1).setCellValue("品种");
			head.createCell(2).setCellValue("标识");
			head.createCell(3).setCellValue("开/平仓");
			head.createCell(4).setCellValue("日内/隔夜");
			head.createCell(5).setCellValue("买卖方向");
			head.createCell(6).setCellValue("交易日期");
			head.createCell(7).setCellValue("交易时间");
			head.createCell(8).setCellValue("交易价格");
			head.createCell(9).setCellValue("交易数量");
			head.createCell(10).setCellValue("保证金");
			head.createCell(11).setCellValue("交易信号");
			head.createCell(12).setCellValue("手续费");
			head.createCell(13).setCellValue("交易总额");
			head.createCell(14).setCellValue("盈亏点数");
			head.createCell(15).setCellValue("盈亏总额");
			head.createCell(16).setCellValue("净盈亏");
			head.createCell(17).setCellValue("收益率");
			head.createCell(18).setCellValue("当日成交量");
			head.createCell(19).setCellValue("MA55");
			head.createCell(20).setCellValue("MA89");
			head.createCell(21).setCellValue("走势");
			for (int i = 0; i < tradeRecoreds.size(); i++) {
				Trade trade = tradeRecoreds.get(i);
				if (trade.getGoods().equals(goods)) {
					index++;
					Row data = sheet.createRow(index);
					data.createCell(0).setCellValue(
							trade.getGoods().getFutures().getPlace());
					data.createCell(1).setCellValue(
							trade.getGoods().getFutures().getCategoryName());
					data.createCell(2).setCellValue(trade.getGoods().getFlag());
					data.createCell(3).setCellValue(
							trade.isOpen() ? "开仓" : "平仓");
					data.createCell(4).setCellValue("平今");
					data.createCell(5).setCellValue(trade.isIn() ? "买进" : "卖出");
					data.createCell(6).setCellValue(
							DateUtils.format(trade.getDate()).substring(0, 10));
					data.createCell(7).setCellValue(
							DateUtils.format(trade.getDate()).substring(11));
					data.createCell(8).setCellValue(trade.getPrice());
					data.createCell(9).setCellValue(trade.getShou());
					data.createCell(10).setCellValue(
							NumberUtils.formatNumber(trade.getZongJine()
									* trade.getGoods().getFutures()
											.getBaoZhengJin() / 100));
					data.createCell(11).setCellValue(trade.getSignal());
					data.createCell(12).setCellValue(
							NumberUtils.formatNumber(trade.getShouXuFei()));
					data.createCell(13).setCellValue(
							NumberUtils.formatNumber(trade.getZongJine()));
					if (!trade.isOpen()) {
						if (!trade.isIn()) {
							try {
								Trade lastTrade = tradeRecoreds.get(i - 1);
								if (lastTrade.isIn()) {
									data.createCell(14).setCellValue(
											trade.getPrice()
													- lastTrade.getPrice());
									data.createCell(15).setCellValue(
											NumberUtils.formatNumber(trade
													.getZongJine()
													- lastTrade.getZongJine()));
									data.createCell(16).setCellValue(
											NumberUtils.formatNumber(trade
													.getZongJine()
													- lastTrade.getZongJine()));
									data.createCell(17).setCellValue(
											NumberUtils.formatNumber((trade
													.getZongJine() - lastTrade
													.getZongJine())
													/ lastTrade.getZongJine()
													* 100)
													+ "%");
									data.createCell(18).setCellValue(
											ChengjiaoHistory.getChengjiao(
													trade.getGoods(),
													trade.getDate()));
								}
							} catch (Exception e) {
							}
						} else {
							try {
								Trade lastTrade = tradeRecoreds.get(i - 1);
								if (!lastTrade.isIn()) {
									data.createCell(14).setCellValue(
											lastTrade.getPrice()
													- trade.getPrice());
									data.createCell(15).setCellValue(
											NumberUtils.formatNumber(lastTrade
													.getZongJine()
													- trade.getZongJine()));
									data.createCell(16).setCellValue(
											NumberUtils.formatNumber(lastTrade
													.getZongJine()
													- trade.getZongJine()));
									data.createCell(17).setCellValue(
											NumberUtils.formatNumber((lastTrade
													.getZongJine() - trade
													.getZongJine())
													/ lastTrade.getZongJine()
													* 100)
													+ "%");
									data.createCell(18).setCellValue(
											ChengjiaoHistory.getChengjiao(
													trade.getGoods(),
													trade.getDate()));
								}
							} catch (Exception e) {
							}
						}
						int ma55 = IndicatorsManager.getHourMa(
								trade.getGoods(), trade.getDate(), 55);
						int ma89 = IndicatorsManager.getHourMa(
								trade.getGoods(), trade.getDate(), 89);
						data.createCell(19).setCellValue(ma55);
						data.createCell(20).setCellValue(ma89);
						data.createCell(21).setCellValue(
								(ma55 > ma89) ? "牛市" : "熊市");
					}
				}
			}
		}
	}
}
