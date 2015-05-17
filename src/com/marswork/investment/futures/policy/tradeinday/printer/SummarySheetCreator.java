package com.marswork.investment.futures.policy.tradeinday.printer;

import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.marswork.core.common.data.PojoConverter;
import com.marswork.core.minitools.object.BaseCollection;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.utils.NumberUtils;

public class SummarySheetCreator {

	public static void createSummarySheet(AbstractPolicy policy,
			VirtureAccount account, Sheet sheet, List<Trade> tradeRecoreds) {
		Row row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("交易策略");
		row0.createCell(1).setCellValue(policy.getName());

		double allSum = 0;
		double allSum_10_15 = 0;
		double allSum_15_20 = 0;
		double allSum_20_30 = 0;
		double allSum_30 = 0;
		int yingli = 0;
		int kuisun = 0;
		int liankui = 0;
		int zuidaliankui = 0;
		double danbiyingli = 0;
		double danbikuisun = 0;
		double shouxufei = 0;
		for (int i = 0; i < tradeRecoreds.size(); i++) {
			Trade trade = tradeRecoreds.get(i);
			double jioayijine = (trade.isIn() ? -trade.getZongJine() : trade
					.getZongJine());
			allSum += jioayijine;

			if (trade.isOpen()) {
				Trade nextTrade = tradeRecoreds.get(i + 1);
				double semaphore = trade.getSemaphore();
				double yinglijine = trade.isIn() ? nextTrade.getZongJine()
						- trade.getZongJine() : trade.getZongJine()
						- nextTrade.getZongJine();
				if (1 < semaphore && semaphore <= 1.5) {
					allSum_10_15 += yinglijine;
				} else if (semaphore > 1.5 && semaphore <= 2) {
					allSum_15_20 += yinglijine;
				} else if (semaphore > 2 && semaphore <= 3) {
					allSum_20_30 += yinglijine;
				} else if (semaphore > 3) {
					allSum_30 += yinglijine;
				}
			}

			shouxufei += trade.getShouXuFei();
			try {
				if (!trade.isOpen()) {
					double tempYinli = 0;
					if (!trade.isIn()) {
						tempYinli = trade.getZongJine()
								- tradeRecoreds.get(i - 1).getZongJine();
					} else {
						tempYinli = tradeRecoreds.get(i - 1).getZongJine()
								- trade.getZongJine();
					}
					if (tempYinli >= 0) {
						yingli++;
						liankui = 0;
						if (tempYinli > danbiyingli) {
							danbiyingli = tempYinli;
						}
					} else {
						kuisun++;
						liankui++;
						if (liankui > zuidaliankui) {
							zuidaliankui = liankui;
						}
						if (tempYinli < danbikuisun) {
							danbikuisun = tempYinli;
						}
					}
				}
			} catch (Exception e) {
			}
		}
		
		Row row = sheet.createRow(1);
		row.createCell(0).setCellValue("原始资金");
		row.createCell(1).setCellValue(account.getOriginSum());
		
		 row = sheet.createRow(2);
		row.createCell(0).setCellValue("结束时资金");
		row.createCell(1).setCellValue(account.getCurrSum());

		 row = sheet.createRow(3);
		row.createCell(0).setCellValue("总净收益");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(allSum));

		row = sheet.createRow(4);
		row.createCell(0).setCellValue("测试品种");
		row.createCell(1)
				.setCellValue(
						BaseCollection.listString(PojoConverter.getField(
								policy.getGoods(), "flag"), ","));

		row = sheet.createRow(5);
		row.createCell(0).setCellValue("测试开始时间");
		row.createCell(1).setCellValue(
				BaseDate.formatDateToDays(policy.getFromDate()));

		row = sheet.createRow(6);
		row.createCell(0).setCellValue("测试结束时间");
		row.createCell(1).setCellValue(
				BaseDate.formatDateToDays(policy.getToDate()));

		row = sheet.createRow(7);
		row.createCell(0).setCellValue("净盈利次数");
		row.createCell(1).setCellValue(yingli);

		row = sheet.createRow(8);
		row.createCell(0).setCellValue("净亏损次数");
		row.createCell(1).setCellValue(kuisun);

		row = sheet.createRow(9);
		row.createCell(0).setCellValue("最多连续亏损次数");
		row.createCell(1).setCellValue(zuidaliankui);

		row = sheet.createRow(10);
		row.createCell(0).setCellValue("最大回撤（从总资金最高到最低点的百分比）");
		row.createCell(1).setCellValue("暂无");

		row = sheet.createRow(11);
		row.createCell(0).setCellValue("最高单笔盈利");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(danbiyingli));

		row = sheet.createRow(12);
		row.createCell(0).setCellValue("最大单笔亏损");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(danbikuisun));

		row = sheet.createRow(13);
		row.createCell(0).setCellValue("年化收益率");
		row.createCell(1).setCellValue("暂无");

		row = sheet.createRow(14);
		row.createCell(0).setCellValue("手续费总额");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(shouxufei));

		row = sheet.createRow(15);
		row.createCell(0).setCellValue("总净收益(信号量绝对值1.0-1.5)");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(allSum_10_15));

		row = sheet.createRow(16);
		row.createCell(0).setCellValue("总净收益(信号量绝对值1.5-2.0)");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(allSum_15_20));

		row = sheet.createRow(17);
		row.createCell(0).setCellValue("总净收益(信号量绝对值2.0-3.0)");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(allSum_20_30));

		row = sheet.createRow(18);
		row.createCell(0).setCellValue("总净收益(信号量绝对值大于3.0)");
		row.createCell(1).setCellValue(NumberUtils.formatNumber(allSum_30));
	}
}
