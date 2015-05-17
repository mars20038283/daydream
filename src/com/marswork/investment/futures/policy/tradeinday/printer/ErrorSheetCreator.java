package com.marswork.investment.futures.policy.tradeinday.printer;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.map.BaseMap;
import com.marswork.core.minitools.object.map.MapKeyValue;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class ErrorSheetCreator {

	public static void createErrorSheet(Sheet sheet, Map<Trade, String> errors) {
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("品种");
		head.createCell(1).setCellValue("时间");
		head.createCell(2).setCellValue("异常描述");
		head.createCell(3).setCellValue("原始数据——开盘价");
		head.createCell(4).setCellValue("原始数据——最高价");
		head.createCell(5).setCellValue("原始数据——最低价");
		head.createCell(6).setCellValue("原始数据——收盘价");
		head.createCell(7).setCellValue("原始数据——成交");
		head.createCell(8).setCellValue("原始数据——持仓");
		List<MapKeyValue<Trade, String>> errorList = BaseMap.walkMap(errors);
		for (int i = 0; i < errorList.size(); i++) {
			try {
				MapKeyValue<Trade, String> e = errorList.get(i);
				Trade trade = e.getKey();
				AtomicData atomicData = SqlUtils.getDataInMinite(
						trade.getGoods(), trade.getDate());
				Row data = sheet.createRow(i + 1);
				data.createCell(0).setCellValue(trade.getGoods().getFlag());
				data.createCell(1).setCellValue(
						DateUtils.format(trade.getDate()));
				data.createCell(2).setCellValue(e.getValue());
				data.createCell(3).setCellValue(atomicData.getKaipan());
				data.createCell(4).setCellValue(atomicData.getZuigao());
				data.createCell(5).setCellValue(atomicData.getZuidi());
				data.createCell(6).setCellValue(atomicData.getShoupan());
				data.createCell(7).setCellValue(atomicData.getChengjiao());
				data.createCell(8).setCellValue(atomicData.getChicang());
			} catch (MarsException e) {
				e.printStackTrace();
				continue;
			}
		}
	}
}
