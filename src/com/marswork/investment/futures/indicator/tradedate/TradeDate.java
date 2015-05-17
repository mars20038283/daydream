package com.marswork.investment.futures.indicator.tradedate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.marswork.core.exceptions.object.datetime.NotDateTimeException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.utils.DateUtils;

public class TradeDate {

	public static Map<String, Integer> cache_date_order;

	public static Map<Integer, String> cache_order_date;

	public static int index = 0;

	public static void init() {
		if (cache_date_order == null) {
			try {
				cache_date_order = new HashMap<String, Integer>();
				cache_order_date = new HashMap<Integer, String>();
				String sql = "select TRADE_date from trade_date order by trade_date asc";
				CommonVO vo = new CommonDAO().doSearch(sql);
				for (Map<String, String> map : vo.getRows()) {
					index++;
					String date = BaseDate.parseDate(map.get("TRADE_DATE"))
							.toString();
					cache_order_date.put(index, date);
					cache_date_order.put(date, index);
				}
			} catch (Exception e) {
			}
		}
	}

	/**
	 * 返回后一个交易日，如果没有返回null
	 * 
	 * @param date
	 * @return
	 * @throws NotDateTimeException
	 * @throws DateOutOfRangeException
	 */
	public static Date getNextTradeDate(Date date) throws NotDateTimeException,
			DateOutOfRangeException {
		init();
		Date rdate = null;
		try {
			rdate = BaseDate.parseDate(cache_order_date.get(cache_date_order
					.get(DateUtils.getFirstMinuteOfDay(date).toString()) + 1));
		} catch (Exception e) {
			throw new DateOutOfRangeException(date);
		}
		return rdate;
	}

	/**
	 * 返回前一个交易日，如果没有返回null
	 * 
	 * @param date
	 * @return
	 * @throws NotDateTimeException
	 * @throws DateOutOfRangeException
	 */
	public static Date getLastTradeDate(Date date) throws NotDateTimeException,
			DateOutOfRangeException {
		init();
		Date rdate = null;
		try {
			rdate = BaseDate.parseDate(cache_order_date.get(cache_date_order
					.get(DateUtils.getFirstMinuteOfDay(date).toString()) - 1));
		} catch (Exception e) {
			throw new DateOutOfRangeException(date);
		}
		return rdate;
	}

	/**
	 * 
	 * @return
	 * @throws NotDateTimeException
	 */
	public static Date getTheLastTradeDate() throws NotDateTimeException {
		init();
		return BaseDate.parseDate(cache_order_date.get(index));
	}
}
