package com.marswork.investment.futures.loaddata.macd;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.investment.futures.context.goods.Goods;

public class MacdLoader {

	private static List<Goods> indicators = new ArrayList<Goods>();

	private static Date startDate;

	private static Date endDate;

	static {
		indicators.add(new Goods("sqru05"));

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2006);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 4);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);

		startDate = c.getTime();

		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, Calendar.JULY);
		c.set(Calendar.DATE, 31);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);

		endDate = c.getTime();
	}

	public static void main(String[] args) {
		Date tmpDate = startDate;
		for (Goods goods : indicators) {
			while(!tmpDate.after(endDate)){
				if(tmpDate.equals(startDate)){
					
				}
			}
		}
	}
	
	private void insertMacd(String flag,int value) throws MarsException{
		boolean isTableExsist=false;
		for(String table:DbSysInfo.getAllUserTable()){
			if(table.equals("indicator_"+flag)){
				isTableExsist=true;
				break;
			}
		}
	}
}
