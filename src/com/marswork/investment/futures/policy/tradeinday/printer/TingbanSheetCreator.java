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

public class TingbanSheetCreator {

	public static void createErrorSheet(Sheet sheet, List<String> tingbanList) {
		for (int i = 0; i < tingbanList.size(); i++) {
			try {

				Row data = sheet.createRow(i);
				data.createCell(0).setCellValue(tingbanList.get(i));
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}
}
