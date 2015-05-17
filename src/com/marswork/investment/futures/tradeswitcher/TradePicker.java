package com.marswork.investment.futures.tradeswitcher;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.pojo.TradeRecord;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.marswork.investment.futures.indicator.tradedate.TradeDate;

public class TradePicker {

	private List<TradeRecord> tradeList = new ArrayList<TradeRecord>();
	private List<TradeRecord> abandonedList = new ArrayList<TradeRecord>();

	public void doPick() {
		try {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, 2006);
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 4);
			Date date = c.getTime();
			Date lastDate = TradeDate.getTheLastTradeDate();
//			Date lastDate = date;
			while (!date.after(lastDate)) {
				TradeSwitcher switcher = new TradeSwitcher(date);
				if (switcher.getPickedTrade() != null) {
					tradeList.add(switcher.getPickedTrade());
				}
				abandonedList.addAll(switcher.getAbandonedList());
				date = TradeDate.getNextTradeDate(date);
				if (date == null) {
					break;
				}
			}

			Workbook wb = new HSSFWorkbook();
			PickedListSheetCreator.createTradeListSheet(wb, tradeList);
			AbandonedListSheetCreator.createTradeListSheet(wb, abandonedList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
