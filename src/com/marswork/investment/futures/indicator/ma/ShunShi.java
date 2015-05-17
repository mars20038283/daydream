package com.marswork.investment.futures.indicator.ma;

import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.IndicatorsManager;

public class ShunShi {

	public static boolean isNiuShi(Goods goods, Date date) throws MarsException {
		int ma32 = IndicatorsManager.getHourMa(goods, date, 32);
		int ma12 = IndicatorsManager.getHourMa(goods, date, 12);
		return ma12 > ma32;
	}
}
