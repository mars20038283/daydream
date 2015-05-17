package com.marswork.investment.futures.indicator.extremepoint;

import java.util.ArrayList;
import java.util.List;

import net.sf.ehcache.hibernate.nonstop.HibernateNonstopCacheExceptionHandler;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.enums.ExtremePointCategory;
import com.marswork.investment.futures.utils.DateUtils;

public class ExtremePointFinder {

	private Goods goods;

	private List<AtomicData> dataList = new ArrayList<AtomicData>();

	private double high = 0;
	private double low = 9999999d;

	private AtomicData highPoint;
	private AtomicData lowPoint;

	public ExtremePointFinder() {
	}

	public List<AtomicData> getDataList() {
		return dataList;
	}

	public void appendData(AtomicData data) {
		dataList.add(data);
		if (goods == null && data != null) {
			this.goods = data.getGoods();
		}
		calAppendExtremePoints();
	}

	public Goods getGoods() {
		return goods;
	}

	private void calAppendExtremePoints() {
		try {
			AtomicData td = dataList.get(dataList.size() - 1);
			if (td.getShoupan() > high) {
				high = td.getShoupan();
				highPoint = td;
			}
			if (td.getShoupan() < low) {
				low = td.getShoupan();
				lowPoint = td;
			}
		} catch (NullPointerException e) {
		} catch (IndexOutOfBoundsException e) {
		}
	}

	public AtomicData getExtremePoints(ExtremePointCategory extremePointCategory) {
		if (extremePointCategory.equals(ExtremePointCategory.EXTREME_HIGH)) {
			return highPoint;
		}
		return lowPoint;
	}
}
