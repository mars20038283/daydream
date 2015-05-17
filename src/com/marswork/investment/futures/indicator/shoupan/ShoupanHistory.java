package com.marswork.investment.futures.indicator.shoupan;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.investment.futures.context.goods.Goods;

public class ShoupanHistory {

	private static Map<Goods, List<ShoupanInDay>> shoupanInDay = new HashMap<Goods, List<ShoupanInDay>>();

	public static double getShoupan(Goods goods, Date date) {
		List<ShoupanInDay> shoupan = shoupanInDay.get(goods);
		if (shoupan == null) {
			loadShoupan(goods);
			shoupan = shoupanInDay.get(goods);
		}
		for (ShoupanInDay shoupanInDay : shoupan) {
			if (shoupanInDay.getDate().equals(date)) {
				return shoupanInDay.getShoupan();
			}
		}
		return 0;
	}

	private static void loadShoupan(Goods goods) {
		List<ShoupanInDay> result = new ArrayList<ShoupanInDay>();
		try {

			String sql = "select left(date,10) as DATE,shoupan from "
					+ goods.getFlag()
					+ " where date like '%15:00:00' order by date asc";
			CommonVO vo = new CommonDAO().doSearch(sql);
			for (Map<String, String> o : vo.getRows()) {
				result.add(new ShoupanInDay(goods, o.get("DATE"), o
						.get("SHOUPAN")));
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}
		shoupanInDay.put(goods, result);
	}
}
