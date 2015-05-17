package com.marswork.investment.futures.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.marswork.core.exceptions.object.datetime.NotDateTimeException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.chengjiao.ChengjiaoHistory;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;

public class DateUtils {

	private static Calendar c = Calendar.getInstance();

	private static Date secondBreakDeadline;

	static {
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.MONTH, Calendar.JUNE);
		c.set(Calendar.DAY_OF_MONTH, 28);
		secondBreakDeadline = c.getTime();
	}

	public static SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public static String format(Date date) {
		return formatter.format(date);
	}

	public static Date parse(String dete) {
		try {
			return BaseDate.parseDate(dete);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取指定日期的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstMinuteOfDay(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的第二天的第一分钟
	 * 
	 * @param date
	 * @return
	 * @throws NotDateTimeException
	 * @throws DateOutOfRangeException
	 */
	public static Date getFirstMinuteOfNextDay(Date date)
			throws NotDateTimeException, DateOutOfRangeException {
		return TradeDate.getNextTradeDate(date);
	}

	/**
	 * 获取指定日期的第二天的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstMinuteOfTheDay(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的前天的最后一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMinuteOfYesterday(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 15);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		c.add(Calendar.DATE, -1);
		return c.getTime();
	}

	/**
	 * 获取指定日期的最后一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMinuteOfDay(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 15);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的上午最后一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMiniteOfFirstHalf(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 11);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的下午第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstMiniteOfSecondHalf(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 13);
		c.set(Calendar.MINUTE, 31);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的休息前的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMiniteBeforeBreak(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 15);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的休息后的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstMiniteAfterBreak(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 31);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的下午休息前的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getLastMiniteBeforeSecondBreak(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 14);
		c.set(Calendar.MINUTE, 10);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的下午休息后的第一分钟
	 * 
	 * @param date
	 * @return
	 */
	public static Date getFirstMiniteAfterSecondBreak(Date date) {
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 14);
		c.set(Calendar.MINUTE, 21);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 获取指定日期的计算日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getRelativeDate(Date date, int days) {
		c.setTime(date);
		c.add(Calendar.DATE, days);
		return c.getTime();
	}

	public static boolean isFirstMiniteOfDay(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 9 && c.get(Calendar.MINUTE) == 1;
	}

	public static boolean isLastMiniteOfFirstHalf(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 11
				&& c.get(Calendar.MINUTE) == 30;
	}

	public static boolean isFirstMiniteOfSecondHalf(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 13
				&& c.get(Calendar.MINUTE) == 31;
	}

	public static boolean isLastMiniteOfDay(Date date) {
		c.setTime(date);
//		return c.get(Calendar.HOUR_OF_DAY) == 14 && c.get(Calendar.MINUTE) == 55;
		return c.get(Calendar.HOUR_OF_DAY) == 15 && c.get(Calendar.MINUTE) == 0;
	}

	public static boolean isLastMiniteBeforeBreak(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 10
				&& c.get(Calendar.MINUTE) == 15;
	}

	public static boolean isFirstMiniteAfterBreak(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 10
				&& c.get(Calendar.MINUTE) == 31;
	}

	public static boolean isLastMiniteBeforeSecondBreak(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 14
				&& c.get(Calendar.MINUTE) == 10;
	}

	public static boolean isFirstMiniteAfterSecondBreak(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) == 14
				&& c.get(Calendar.MINUTE) == 21;
	}

	public static boolean isMorning(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) >= 9
				&& c.get(Calendar.HOUR_OF_DAY) <= 11;
	}

	public static boolean isAfterNoon(Date date) {
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY) >= 13
				&& c.get(Calendar.HOUR_OF_DAY) <= 15;
	}

	public static Date addMinute(Goods goods, Date date)
			throws NotDateTimeException, DateOutOfRangeException {
		if (DateUtils.isLastMiniteBeforeBreak(date)) {
			return DateUtils.getFirstMiniteAfterBreak(date);
		} else if (DateUtils.isLastMiniteOfFirstHalf(date)) {
			return DateUtils.getFirstMiniteOfSecondHalf(date);
		} else if (DateUtils.isLastMiniteOfDay(date)) {
			return TradeDate.getNextTradeDate(date);
		} else if (DateUtils.isLastMiniteBeforeSecondBreak(date)
				&& date.before(secondBreakDeadline)
				&& goods.getFutures().getPlace().equals("SQ")) {
			return DateUtils.getFirstMiniteAfterSecondBreak(date);
		} else {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MINUTE, 1);
			return cal.getTime();
		}
	}

	public static Date addMinute(Goods goods, Date date, int step)
			throws NotDateTimeException, DateOutOfRangeException {
		for (int i = 0; i < step; i++) {
			date = addMinute(goods, date);
		}
		return date;
	}

	public static Date minusMinute(Goods goods, Date date)
			throws NotDateTimeException, DateOutOfRangeException {
		if (DateUtils.isFirstMiniteAfterBreak(date)) {
			return DateUtils.getLastMiniteBeforeBreak(date);
		} else if (DateUtils.isFirstMiniteOfSecondHalf(date)) {
			return DateUtils.getLastMiniteOfFirstHalf(date);
		} else if (DateUtils.isFirstMiniteOfDay(date)) {
			return DateUtils.getLastMinuteOfDay(TradeDate
					.getLastTradeDate(date));
		} else if (DateUtils.isLastMiniteBeforeSecondBreak(date)
				&& date.before(secondBreakDeadline)
				&& goods.getFutures().getPlace().equals("SQ")) {
			return DateUtils.getLastMiniteBeforeSecondBreak(date);
		} else {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MINUTE, -1);
			return cal.getTime();
		}
	}

	public static Date minusMinute(Goods goods, Date date, int step)
			throws NotDateTimeException, DateOutOfRangeException {
		for (int i = 0; i < step; i++) {
			date = minusMinute(goods, date);
		}
		return date;
	}

	public static int getYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}

	public static boolean isTheSameDay(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
				&& cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
				&& cal1.get(Calendar.DAY_OF_MONTH) == cal2
						.get(Calendar.DAY_OF_MONTH);
	}

	public static Date get29Munite(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 11);
		c.set(Calendar.MINUTE, 29);
		return c.getTime();
	}
}
