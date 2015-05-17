package com.marswork.investment.futures.indicator.ma;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class MinuteMa {

	public static int getMinuteMa(Goods goods, Date date, int step)
			throws MarsException {
		String sql = "select DATE,SHOUPAN from " + goods.getFlag()
				+ " where date < '" + BaseDate.formatDateToMinites(date)
				+ "'  order by date desc  limit " + step;
		List<Map<String, String>> list = new CommonDAO().doSearch(sql)
				.getRows();
		int sum = 0;
		for (Map<String, String> data : list) {
			sum += (int) Double.parseDouble(data.get("SHOUPAN"));
		}
		if (list.size() != 0) {
			return (int) (sum / list.size());
		}
		return 0;
	}
}
