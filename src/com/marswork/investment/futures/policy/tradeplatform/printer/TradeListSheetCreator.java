package com.marswork.investment.futures.policy.tradeplatform.printer;

import java.io.IOException;
import java.util.Date;
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
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.policy.tradeinday.TradeInDay;
import com.marswork.investment.futures.policy.tradeplatform.TradePlatform;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TradeListSheetCreator {

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
		head.createCell(16).setCellValue("回落至最值");
		head.createCell(17).setCellValue("手续费");
		head.createCell(18).setCellValue("交易总额");
		head.createCell(19).setCellValue("盈亏点数");
		head.createCell(20).setCellValue("净盈亏");
		head.createCell(21).setCellValue("收益率");
		head.createCell(22).setCellValue("当日成交量");
		head.createCell(23).setCellValue("MA12");
		head.createCell(24).setCellValue("MA32");
		head.createCell(25).setCellValue("MA55");
		head.createCell(26).setCellValue("MA64");
		head.createCell(27).setCellValue("MA89");
		head.createCell(28).setCellValue("MA120");
		head.createCell(29).setCellValue("走势");
		head.createCell(30).setCellValue("MAM5");
		head.createCell(31).setCellValue("MAM15");
		head.createCell(32).setCellValue("MAM30");
		head.createCell(33).setCellValue("开仓当日开盘");
		head.createCell(34).setCellValue("开仓当日收盘");
		head.createCell(35).setCellValue("开仓上午最高");
		head.createCell(36).setCellValue("开仓上午最低");
		head.createCell(37).setCellValue("开仓下午最高");
		head.createCell(38).setCellValue("开仓下午最低");
		head.createCell(39).setCellValue("平仓当日开盘");
		head.createCell(40).setCellValue("平仓当日收盘");
		head.createCell(41).setCellValue("平仓上午最高");
		head.createCell(42).setCellValue("平仓上午最低");
		head.createCell(43).setCellValue("平仓下午最高");
		head.createCell(44).setCellValue("平仓下午最低");
		head.createCell(45).setCellValue("偏离率12");
		head.createCell(46).setCellValue("偏离率32");
		head.createCell(47).setCellValue("偏离率55");
		head.createCell(48).setCellValue("偏离率64");
		head.createCell(49).setCellValue("偏离率89");
		head.createCell(50).setCellValue("偏离率120");
		head.createCell(51).setCellValue("收盘平仓价");
		head.createCell(52).setCellValue("隔夜收益");
		head.createCell(53).setCellValue("隔夜收益率");
		head.createCell(54).setCellValue("9:02平仓价");
		head.createCell(55).setCellValue("9:02收益");
		head.createCell(56).setCellValue("9:02收益率");
		head.createCell(57).setCellValue("9:04平仓价");
		head.createCell(58).setCellValue("9:04收益");
		head.createCell(59).setCellValue("9:04收益率");
		head.createCell(60).setCellValue("9:06平仓价");
		head.createCell(61).setCellValue("9:06收益");
		head.createCell(62).setCellValue("9:06收益率");
		head.createCell(63).setCellValue("9:11平仓价");
		head.createCell(64).setCellValue("9:11收益");
		head.createCell(65).setCellValue("9:11收益率");
		head.createCell(66).setCellValue("9:16平仓价");
		head.createCell(67).setCellValue("9:16收益");
		head.createCell(68).setCellValue("9:16收益率");
		head.createCell(69).setCellValue("9:31平仓价");
		head.createCell(70).setCellValue("9:31收益");
		head.createCell(71).setCellValue("9:31收益率");
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
			data.createCell(5).setCellValue("平收盘");
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
			if (trade.isOpen()) {
				data.createCell(16).setCellValue(trade.getHuiluo());
			} else {
				data.createCell(16).setCellValue(lastTrade.getHuiluo());
			}
			data.createCell(17).setCellValue(
					NumberUtils.formatNumber(trade.getShouXuFei()));
			data.createCell(18).setCellValue(
					NumberUtils.formatNumber(trade.getZongJine()));
			if (!trade.isOpen()) {
				if (!trade.isIn()) {
					try {
						if (lastTrade.isIn()) {
							data.createCell(19).setCellValue(
									trade.getPrice() - lastTrade.getPrice());
							data.createCell(20).setCellValue(
									NumberUtils.formatNumber(trade
											.getZongJine()
											- lastTrade.getZongJine()));
							data.createCell(21)
									.setCellValue(
											NumberUtils.formatNumber((trade
													.getZongJine() - lastTrade
													.getZongJine())
													/ lastTrade
															.getBaozhengjin()
													* 100));
							data.createCell(22).setCellValue(
									ChengjiaoHistory.getChengjiao(
											trade.getGoods(), trade.getDate()));
						}
					} catch (Exception e) {
					}
				} else {
					try {
						if (!lastTrade.isIn()) {
							data.createCell(19).setCellValue(
									lastTrade.getPrice() - trade.getPrice());
							data.createCell(20).setCellValue(
									NumberUtils.formatNumber(lastTrade
											.getZongJine()
											- trade.getZongJine()));
							data.createCell(21)
									.setCellValue(
											NumberUtils.formatNumber((lastTrade
													.getZongJine() - trade
													.getZongJine())
													/ lastTrade
															.getBaozhengjin()
													* 100));
							data.createCell(22).setCellValue(
									ChengjiaoHistory.getChengjiao(
											trade.getGoods(), trade.getDate()));
						}
					} catch (Exception e) {
					}
				}
				int ma55 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 55);
				int ma64 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 64);
				int ma89 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 89);
				int ma12 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 12);
				int ma32 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 32);
				int ma120 = IndicatorsManager.getHourMa(trade.getGoods(),
						trade.getDate(), 120);
				int mam5 = IndicatorsManager.getMinuteMa(trade.getGoods(),
						trade.getDate(), 5);
				int mam15 = IndicatorsManager.getMinuteMa(trade.getGoods(),
						trade.getDate(), 15);
				int mam30 = IndicatorsManager.getMinuteMa(trade.getGoods(),
						trade.getDate(), 30);
				data.createCell(23).setCellValue(ma12);
				data.createCell(24).setCellValue(ma32);
				data.createCell(25).setCellValue(ma55);
				data.createCell(26).setCellValue(ma64);
				data.createCell(27).setCellValue(ma89);
				data.createCell(28).setCellValue(ma120);
				data.createCell(29).setCellValue((ma12 > ma32) ? "牛市" : "熊市");
				data.createCell(30).setCellValue(mam5);
				data.createCell(31).setCellValue(mam15);
				data.createCell(32).setCellValue(mam30);

				data.createCell(33).setCellValue(
						IndicatorsManager.getTodayKaipan(lastTrade.getGoods(),
								lastTrade.getDate()));
				data.createCell(34).setCellValue(
						IndicatorsManager.getTodayShoupan(lastTrade.getGoods(),
								lastTrade.getDate()));
				data.createCell(35).setCellValue(
						IndicatorsManager.getTodayMoringHigh(
								lastTrade.getGoods(), lastTrade.getDate()));
				data.createCell(36).setCellValue(
						IndicatorsManager.getTodayMoringLow(
								lastTrade.getGoods(), lastTrade.getDate()));
				data.createCell(37).setCellValue(
						IndicatorsManager.getTodayAfternoonHigh(
								lastTrade.getGoods(), lastTrade.getDate()));
				data.createCell(38).setCellValue(
						IndicatorsManager.getTodayAfternoonLow(
								lastTrade.getGoods(), lastTrade.getDate()));

				data.createCell(39).setCellValue(
						IndicatorsManager.getTodayKaipan(trade.getGoods(),
								trade.getDate()));
				data.createCell(40).setCellValue(
						IndicatorsManager.getTodayShoupan(trade.getGoods(),
								trade.getDate()));
				data.createCell(41).setCellValue(
						IndicatorsManager.getTodayMoringHigh(trade.getGoods(),
								trade.getDate()));
				data.createCell(42).setCellValue(
						IndicatorsManager.getTodayMoringLow(trade.getGoods(),
								trade.getDate()));
				data.createCell(43).setCellValue(
						IndicatorsManager.getTodayAfternoonHigh(
								trade.getGoods(), trade.getDate()));
				data.createCell(44).setCellValue(
						IndicatorsManager.getTodayAfternoonLow(
								trade.getGoods(), trade.getDate()));

				AtomicData data29 = SqlUtils
						.getDataInMinite(
								trade.getGoods(),
								DateUtils.minusMinute(trade.getGoods(),
										trade.getDate()));
				data.createCell(45).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma12)
								/ ma12 * 100));
				data.createCell(46).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma32)
								/ ma32 * 100));
				data.createCell(47).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma55)
								/ ma55 * 100));
				data.createCell(48).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma64)
								/ ma64 * 100));
				data.createCell(49).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma89)
								/ ma89 * 100));
				data.createCell(50).setCellValue(
						NumberUtils.formatNumber((data29.getShoupan() - ma120)
								/ ma120 * 100));

				// if (trade.getSignal().equals("隔夜平")) {
				// Date date = DateUtils.getLastMinuteOfDay(TradeDate
				// .getLastTradeDate(trade.getDate()));
				// // 收盘平仓价
				// int shoupanpingcangjia = 0;
				// double geyeshouyi = 0;
				// if (trade.isIn()) {
				// shoupanpingcangjia = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(), date)
				// + trade.getGoods().getFutures().getChaJia());
				// geyeshouyi = shoupanpingcangjia - trade.getPrice();
				// } else {
				// shoupanpingcangjia = (int) Math.floor(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(), date)
				// - trade.getGoods().getFutures().getChaJia());
				// geyeshouyi = trade.getPrice() - shoupanpingcangjia;
				// }
				// data.createCell(51).setCellValue(shoupanpingcangjia);
				// data.createCell(52).setCellValue(
				// NumberUtils.formatNumber(geyeshouyi));
				// data.createCell(53).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(geyeshouyi)
				// * 10000
				// / shoupanpingcangjia));
				//
				// // 9:02平仓价
				// int pingcangjia902 = 0;
				// double shouyi902 = 0;
				// if (trade.isIn()) {
				// pingcangjia902 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), -1))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi902 = shoupanpingcangjia - pingcangjia902;
				// } else {
				// pingcangjia902 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), -1))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi902 = pingcangjia902 - shoupanpingcangjia;
				// }
				// data.createCell(54).setCellValue(pingcangjia902);
				// data.createCell(55).setCellValue(
				// NumberUtils.formatNumber(shouyi902));
				// data.createCell(56).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi902)
				// * 10000
				// / pingcangjia902));
				//
				// // 9:04平仓价
				// int pingcangjia904 = 0;
				// double shouyi904 = 0;
				// if (trade.isIn()) {
				// pingcangjia904 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +1))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi904 = shoupanpingcangjia - pingcangjia904;
				// } else {
				// pingcangjia904 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +1))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi904 = pingcangjia904 - shoupanpingcangjia;
				// }
				// data.createCell(57).setCellValue(pingcangjia904);
				// data.createCell(58).setCellValue(
				// NumberUtils.formatNumber(shouyi904));
				// data.createCell(59).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi904)
				// * 10000
				// / pingcangjia904));
				//
				// // 9:06平仓价
				// int pingcangjia906 = 0;
				// double shouyi906 = 0;
				// if (trade.isIn()) {
				// pingcangjia906 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +3))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi906 = shoupanpingcangjia - pingcangjia906;
				// } else {
				// pingcangjia906 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +3))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi906 = pingcangjia906 - shoupanpingcangjia;
				// }
				// data.createCell(60).setCellValue(pingcangjia906);
				// data.createCell(61).setCellValue(
				// NumberUtils.formatNumber(shouyi906));
				// data.createCell(62).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi906)
				// * 10000
				// / pingcangjia906));
				//
				// // 9:11平仓价
				// int pingcangjia911 = 0;
				// double shouyi911 = 0;
				// if (trade.isIn()) {
				// pingcangjia911 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +8))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi911 = shoupanpingcangjia - pingcangjia911;
				// } else {
				// pingcangjia911 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +8))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi911 = pingcangjia911 - shoupanpingcangjia;
				// }
				// data.createCell(63).setCellValue(pingcangjia911);
				// data.createCell(64).setCellValue(
				// NumberUtils.formatNumber(shouyi911));
				// data.createCell(65).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi911)
				// * 10000
				// / pingcangjia911));
				//
				// // 9:16平仓价
				// int pingcangjia916 = 0;
				// double shouyi916 = 0;
				// if (trade.isIn()) {
				// pingcangjia916 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +13))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi916 = shoupanpingcangjia - pingcangjia916;
				// } else {
				// pingcangjia916 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +13))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi916 = pingcangjia916 - shoupanpingcangjia;
				// }
				// data.createCell(66).setCellValue(pingcangjia916);
				// data.createCell(67).setCellValue(
				// NumberUtils.formatNumber(shouyi916));
				// data.createCell(68).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi916)
				// * 10000
				// / pingcangjia916));
				//
				// // 9:31平仓价
				// int pingcangjia931 = 0;
				// double shouyi931 = 0;
				// if (trade.isIn()) {
				// pingcangjia931 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +28))
				// + trade.getGoods().getFutures().getChaJia());
				// shouyi931 = shoupanpingcangjia - pingcangjia931;
				// } else {
				// pingcangjia931 = (int) Math.ceil(SqlUtils
				// .getAvgPriceInMinite(trade.getGoods(),
				// DateUtils.addMinute(trade.getGoods(),
				// trade.getDate(), +28))
				// - trade.getGoods().getFutures().getChaJia());
				// shouyi931 = pingcangjia931 - shoupanpingcangjia;
				// }
				// data.createCell(69).setCellValue(pingcangjia931);
				// data.createCell(70).setCellValue(
				// NumberUtils.formatNumber(shouyi931));
				// data.createCell(71).setCellValue(
				// NumberUtils.formatNumber(NumberUtils
				// .formatNumber(shouyi931)
				// * 10000
				// / pingcangjia931));
				// }
			}
		}
	}
}
