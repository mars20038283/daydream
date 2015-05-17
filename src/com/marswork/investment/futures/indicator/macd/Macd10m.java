package com.marswork.investment.futures.indicator.macd;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class Macd10m {

	private Goods goods;

	private List<Double> list12 = new ArrayList<Double>();

	private List<Double> list26 = new ArrayList<Double>();

	private List<Integer> listShoupan = new ArrayList<Integer>();

	private List<Double> listDea = new ArrayList<Double>();

	private List<Double> listMacd = new ArrayList<Double>();

	private List<Date> listDate = new ArrayList<Date>();

	private Map<Date, MacdData> macdData = new HashMap<Date, MacdData>();

	private Date startDate;

	private Date endDate;

	private Calendar c = Calendar.getInstance();

	public Macd10m(Goods goods) {

		this.goods = goods;

		c.set(Calendar.YEAR, 2006);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 4);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 10);
		c.set(Calendar.SECOND, 0);

		startDate = c.getTime();

		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);

		endDate = c.getTime();

		try {
			list12.add(get5MinData(startDate).getShoupan());
			list26.add(get5MinData(startDate).getShoupan());
			listShoupan.add((int) (get5MinData(startDate).getShoupan()));
			listDea.add(0D);
			listMacd.add(0D);
			listDate.add(startDate);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.doInit();
	}

	public void doInit() {
		try {
			Date tmpDate = DateUtils.getLastMinuteOfDay(DateUtils.addMinute(
					goods, startDate));
			while (tmpDate != null && !tmpDate.after(endDate)) {
				try {
					list12.add(NumberUtils.formatNumber2((list12.get(list12
							.size() - 1) * 11 / 13 + get5MinData(tmpDate)
							.getShoupan() * 2 / 13)));
					list26.add(NumberUtils.formatNumber2(list26.get(list26
							.size() - 1)
							* 25
							/ 27
							+ get5MinData(tmpDate).getShoupan() * 2 / 27));
					listShoupan.add(NumberUtils.formatInteger(get5MinData(
							tmpDate).getShoupan()));
					listDea.add(NumberUtils.formatNumber2(listDea.get(
							listDea.size() - 1).doubleValue()
							* 8
							/ 10
							+ (list12.get(list12.size() - 1) - list26
									.get(list26.size() - 1)) * 2 / 10));
					listMacd.add((list12.get(list12.size() - 1)
							- list26.get(list26.size() - 1) - listDea
							.get(listDea.size() - 1)) * 2);
					listDate.add(tmpDate);

				} catch (Exception e) {
					continue;
				} finally {
					try {
						tmpDate = DateUtils.addMinute(goods, tmpDate, 10);
					} catch (Exception e) {
						break;
					}
				}
			}
			wrapResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private AtomicData get5MinData(Date date) throws Exception {
		AtomicData data = new AtomicData();

		if (!DateUtils.isLastMiniteBeforeBreak(date)
				&& !DateUtils.isLastMiniteBeforeSecondBreak(date)
				&& !DateUtils.isLastMiniteOfDay(date)
				&& !DateUtils.isLastMiniteOfFirstHalf(date)) {
			date = DateUtils.addMinute(goods, date);
		}
		data.setShoupan(SqlUtils.getDataInMinite(goods, date).getShoupan());
		return data;
	}

	private void wrapResult() {
		MacdData data;

		for (int i = 1; i < list12.size(); i++) {
			data = new MacdData();
			data.setDate(listDate.get(i - 1));
			data.setShoupan(listShoupan.get(i - 1));
			data.setEma12(list12.get(i - 1));
			data.setEma26(list26.get(i - 1));
			data.setDea(listDea.get(i - 1));
			data.setMacd(listMacd.get(i - 1));
			macdData.put(data.getDate(), data);
		}
	}

	public MacdData getMacdData(Date date) {
		return macdData.get(date);
	}
}
