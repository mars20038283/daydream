package com.marswork.investment.indicatortest;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.goods.Goods;

public class IndicatorTest {

	public static void main(String[] args) {
		try {
			 int result = MacdIndicator.macd(new Goods("sqru05"),
			 BaseDate.parseDate("2008-05-27 10:09:00"));
			 BasicUtils.out(result);

//			int index = 0;
//			Date date = BaseDate.parseDate("2006-01-04 09:01:00");
//			while (!date.after(BaseDate.parseDate("2010-05-27 09:01:00"))) {
//				index++;
//				date = TradeDate.getNextTradeDate(date);
//				BasicUtils.out(index);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
