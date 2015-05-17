package com.marswork.investment.futures.indicator.chengjiao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class ChengjiaoHistory {

	private static Map<Goods, List<ChengjiaoInDay>> chengJiaoInDay = new HashMap<Goods, List<ChengjiaoInDay>>();

	public static int getChengjiao(Goods goods, Date date) {
		List<ChengjiaoInDay> chengjiao = chengJiaoInDay.get(goods);
		if (chengjiao == null) {
			loadChengjiao(goods);
			chengjiao = chengJiaoInDay.get(goods);
		}
		for (ChengjiaoInDay chengJiaoInDay : chengjiao) {
			if (DateUtils.getFirstMinuteOfDay(chengJiaoInDay.getDate())
					.toString()
					.equals(DateUtils.getFirstMinuteOfDay(date).toString())) {
				return chengJiaoInDay.getChengjiao();
			}
		}
		return 0;
	}

	private static void loadChengjiao(Goods goods) {
		List<ChengjiaoInDay> result = new ArrayList<ChengjiaoInDay>();
		try {

			String sql = "select left(date,10) as DATE,sum(CHENGJIAO) as CHENGJIAO from "
					+ goods.getFlag()
					+ " group by left(date,10) order by date asc";
			CommonVO vo = new CommonDAO().doSearch(sql);
			for (Map<String, String> o : vo.getRows()) {
				result.add(new ChengjiaoInDay(goods, o.get("DATE"), o
						.get("CHENGJIAO")));
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}
		chengJiaoInDay.put(goods, result);
	}
}
