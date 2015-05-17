package com.marswork.investment.futures.indicator.daterangeextremepoint;

import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class DateRangeExtremePoint {

	public static double getExtremeHighPoint(Goods goods, Date fromDate,
			Date toDate) throws MarsException {
		String sql = "select max(SHOUPAN) as ZUIGAO from " + goods.getFlag()
				+ " where date>='" + DateUtils.format(fromDate)
				+ "' and date<='" + DateUtils.format(toDate) + "'";
		CommonVO vo = new CommonDAO().doSearch(sql);
		if (vo.getRowCountInVO() > 0) {
			return Double.parseDouble(vo.getValue(0, 0));
		}
		return 0;
	}
	
	public static double getExtremeLowPoint(Goods goods, Date fromDate,
			Date toDate) throws MarsException {
		String sql = "select min(SHOUPAN) as ZUIDI from " + goods.getFlag()
				+ " where date>='" + DateUtils.format(fromDate)
				+ "' and date<='" + DateUtils.format(toDate) + "'";
		CommonVO vo = new CommonDAO().doSearch(sql);
		if (vo.getRowCountInVO() > 0) {
			return Double.parseDouble(vo.getValue(0, 0));
		}
		return 0;
	}
}
