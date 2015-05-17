package com.marswork.investment.futures.indicator.tingban;

import java.util.Calendar;
import java.util.Date;

import org.jfree.data.DataUtilities;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class TingBan {

	public static boolean isTingBanFirstHalf(Goods goods, Date date) {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.set(Calendar.HOUR_OF_DAY, 11);
			c.set(Calendar.MINUTE, 29);
			AtomicData data29 = SqlUtils.getDataInMinite(goods, c.getTime());
			c.set(Calendar.MINUTE, 28);
			AtomicData data28 = SqlUtils.getDataInMinite(goods, c.getTime());
			c.set(Calendar.MINUTE, 27);
			AtomicData data27 = SqlUtils.getDataInMinite(goods, c.getTime());
			if (data27.getZuigao() == data27.getZuidi()
					&& data27.getZuidi() == data28.getZuigao()
					&& data27.getZuidi() == data28.getZuidi()
					&& data27.getZuidi() == data29.getZuigao()
					&& data27.getZuidi() == data29.getZuidi()) {
				return true;
			}
		} catch (MarsException e) {
		}
		return false;
	}

	public static boolean isTingBanBoforeKaicang(Goods goods, Date date) {
		try {
			AtomicData data29 = SqlUtils.getDataInMinite(goods,
					DateUtils.minusMinute(goods, date, 1));
			AtomicData data28 = SqlUtils.getDataInMinite(goods,
					DateUtils.minusMinute(goods, date, 2));
			AtomicData data27 = SqlUtils.getDataInMinite(goods,
					DateUtils.minusMinute(goods, date, 3));
			if (data27.getZuigao() == data27.getZuidi()
					&& data27.getZuidi() == data28.getZuigao()
					&& data27.getZuidi() == data28.getZuidi()
					&& data27.getZuidi() == data29.getZuigao()
					&& data27.getZuidi() == data29.getZuidi()
					&& (data29.getShoupan() == IndicatorsManager
							.getDateRangeLow(goods,
									DateUtils.getFirstMinuteOfDay(date),
									DateUtils.getLastMinuteOfDay(date)) || data29
							.getShoupan() == IndicatorsManager
							.getDateRangeHigh(goods,
									DateUtils.getFirstMinuteOfDay(date),
									DateUtils.getLastMinuteOfDay(date)))) {
				return true;
			}
		} catch (MarsException e) {
		}
		return false;
	}
}
