package com.marswork.investment.futures.indicator.today;

import java.util.Calendar;
import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.Indicator;
import com.marswork.investment.futures.utils.DateUtils;

/**
 * 今日上午最高，9：01-11:29
 * 
 * @author daijun02
 * 
 */
public class TodayMorningZuigao extends Indicator {

	private Goods goods;

	private Date date;

	public TodayMorningZuigao(Goods goods, Date date) {
		this.goods = goods;
		this.date = date;
	}

	public Object getData() {
		try {
			String sql = "select max(ZUIGAO) from " + goods.getFlag()
					+ " where date>='"
					+ DateUtils.format(DateUtils.getFirstMinuteOfDay(date))
					+ "' and date<='" + DateUtils.format(DateUtils.get29Munite(date))
					+ "'";
			return new CommonDAO().doSearch(sql).getValue(0, 0);
		} catch (MarsException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
