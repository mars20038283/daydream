package com.marswork.investment.futures.indicator;

import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.daterangeextremepoint.DateRangeExtremePoint;
import com.marswork.investment.futures.indicator.ma.HourMa;
import com.marswork.investment.futures.indicator.ma.MinuteMa;
import com.marswork.investment.futures.indicator.ma.ShunShi;
import com.marswork.investment.futures.indicator.tingban.TingBan;
import com.marswork.investment.futures.indicator.today.TodayAfternoonZuidi;
import com.marswork.investment.futures.indicator.today.TodayAfternoonZuigao;
import com.marswork.investment.futures.indicator.today.TodayMorningZuidi;
import com.marswork.investment.futures.indicator.today.TodayMorningZuigao;
import com.marswork.investment.futures.indicator.yesterday.YesterdayShoupan;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class IndicatorsManager {

	/**
	 * 昨日收盘价
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static double getYesterdayShoupan(Goods goods, Date date) {
		return Double.parseDouble((new YesterdayShoupan(goods, date).getData())
				.toString());
	}

	/**
	 * 今日开盘价
	 * 
	 * @param goods
	 * @param date
	 * @return
	 * @throws MarsException
	 */
	public static double getTodayKaipan(Goods goods, Date date)
			throws MarsException {
		return SqlUtils.getDataInMinite(goods,
				DateUtils.getFirstMinuteOfDay(date)).getKaipan();
	}

	/**
	 * 今日收盘价
	 * 
	 * @param goods
	 * @param date
	 * @return
	 * @throws MarsException
	 */
	public static double getTodayShoupan(Goods goods, Date date)
			throws MarsException {
		return SqlUtils.getDataInMinite(goods,
				DateUtils.getLastMinuteOfDay(date)).getShoupan();
	}

	/**
	 * 今日上午最高点
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static double getTodayMoringHigh(Goods goods, Date date) {
		return Double.parseDouble((new TodayMorningZuigao(goods, date)
				.getData()).toString());
	}

	/**
	 * 今日上午最低点
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static double getTodayMoringLow(Goods goods, Date date) {
		return Double
				.parseDouble((new TodayMorningZuidi(goods, date).getData())
						.toString());
	}

	/**
	 * 今日下午最高点
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static double getTodayAfternoonHigh(Goods goods, Date date) {
		return Double.parseDouble((new TodayAfternoonZuigao(goods, date)
				.getData()).toString());
	}

	/**
	 * 今日下午最低点
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static double getTodayAfternoonLow(Goods goods, Date date) {
		return Double.parseDouble((new TodayAfternoonZuidi(goods, date)
				.getData()).toString());
	}

	/**
	 * 移动平均线上的值
	 * 
	 * @param goods
	 * @param date
	 * @param step
	 * @return
	 * @throws MarsException
	 */
	public static int getMinuteMa(Goods goods, Date date, int step)
			throws MarsException {
		return MinuteMa.getMinuteMa(goods, date, step);
	}

	/**
	 * 移动平均线上的值
	 * 
	 * @param goods
	 * @param date
	 * @param step
	 * @return
	 * @throws MarsException
	 */
	public static int getHourMa(Goods goods, Date date, int step)
			throws MarsException {
		return HourMa.getHourMa(goods, date, step);
	}

	/**
	 * 是否是顺市交易
	 * 
	 * @param goods
	 * @param date
	 * @return
	 * @throws MarsException
	 */
	public static boolean isNiuShi(Goods goods, Date date) throws MarsException {
		return ShunShi.isNiuShi(goods, date);
	}

	/**
	 * 上午是否停板
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static boolean isTingBanInFirstHalfa(Goods goods, Date date) {
		return TingBan.isTingBanFirstHalf(goods, date);
	}

	/**
	 * 开仓前是否停板
	 * 
	 * @param goods
	 * @param date
	 * @return
	 */
	public static boolean isTingBanBoforeKaicang(Goods goods, Date date) {
		return TingBan.isTingBanBoforeKaicang(goods, date);
	}

	/**
	 * 获取一个时间范围内的最高值
	 * 
	 * @param goods
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @throws MarsException
	 */
	public static double getDateRangeHigh(Goods goods, Date fromDate,
			Date toDate) throws MarsException {
		return DateRangeExtremePoint.getExtremeHighPoint(goods, fromDate,
				toDate);
	}

	/**
	 * 获取一个时间范围内的最低值
	 * 
	 * @param goods
	 * @param fromDate
	 * @param toDate
	 * @return
	 * @throws MarsException
	 */
	public static double getDateRangeLow(Goods goods, Date fromDate, Date toDate)
			throws MarsException {
		return DateRangeExtremePoint
				.getExtremeLowPoint(goods, fromDate, toDate);
	}
}
