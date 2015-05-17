package com.marswork.investment.futures.indicator.yesterday;

import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.Indicator;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.utils.DateUtils;

/**
 * 昨日收盘价
 * 
 * @author daijun02
 * 
 */
public class YesterdayShoupan extends Indicator {

	private Goods goods;

	private Date date;

	public YesterdayShoupan(Goods goods, Date date) {
		this.goods = goods;
		this.date = date;
	}

	public Object getData() {
		try {
//			Date yesterdaDate = DateUtils.getLastMinuteOfDay(DateUtils
//					.getRelativeDate(date, -1));
			Date yesterdaDate = DateUtils.getLastMinuteOfDay(TradeDate
					.getLastTradeDate(date));
			String sql = "select SHOUPAN from " + goods.getFlag()
					+ " where date ='" + DateUtils.format(yesterdaDate) + "'";
			return new CommonDAO().doSearch(sql).getValue(0, 0);
		} catch (MarsException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
