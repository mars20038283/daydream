package com.marswork.investment.indicatortest;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class MacdIndicator {

	private static Date fromDate;

	private static Map<String, Integer> ema12Map = new HashMap<String, Integer>();

	private static Map<String, Integer> ema26Map = new HashMap<String, Integer>();

	private static Map<String, Integer> macdMap = new HashMap<String, Integer>();

	static {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2006);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 4);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);
		fromDate = c.getTime();
	}

	public static int ema12(Goods goods, Date date) throws MarsException {

		Date tempDate = TradeDate.getNextTradeDate(fromDate);
		int result = (int) SqlUtils.getDataInMinite(goods,
				DateUtils.getLastMinuteOfDay(fromDate)).getShoupan();
		while (!tempDate.after(date)) {
			try {
				result = (int) (result * 2 / 13 + SqlUtils.getDataInMinite(
						goods, DateUtils.getLastMinuteOfDay(tempDate))
						.getShoupan() * 11 / 13);
				tempDate = TradeDate.getNextTradeDate(tempDate);
				if (tempDate == null) {
					break;
				}
			} catch (NullPointerException e) {
				tempDate = TradeDate.getNextTradeDate(tempDate);
				continue;
			}
		}
		return result;
	}

	public static int ema26(Goods goods, Date date) throws MarsException {

		Date tempDate = TradeDate.getNextTradeDate(fromDate);
		int result = (int) SqlUtils.getDataInMinite(goods,
				DateUtils.getLastMinuteOfDay(fromDate)).getShoupan();
		while (!tempDate.after(date)) {
			try {
				result = (int) (result * 2 / 27 + SqlUtils.getDataInMinite(
						goods, DateUtils.getLastMinuteOfDay(tempDate))
						.getShoupan() * 25 / 27);
				tempDate = TradeDate.getNextTradeDate(tempDate);
				if (tempDate == null) {
					break;
				}
			} catch (NullPointerException e) {
				tempDate = TradeDate.getNextTradeDate(tempDate);
				continue;
			}
		}
		return result;
	}

	public static int dif9(Goods goods, Date date) throws MarsException {
		int ema12 = ema12(goods, date);
		int ema26 = ema26(goods, date);
		return ema12 - ema26;
	}

	public static int macd(Goods goods, Date date) throws MarsException {

		Integer result = macdMap.get(goods.getFlag() + "_"
				+ BaseDate.formatDateToDays(date));
		if (result != null) {
			return result;
		}

		int dif9 = dif9(goods, date);
		int lastMacd = 0;
		date = TradeDate.getLastTradeDate(date);
		if (date == null) {
			lastMacd = 0;
		} else {
			lastMacd = (int) (macd(goods, date));
		}
		return lastMacd * 8 / 10 + dif9 * 2 / 10;
	}
}
