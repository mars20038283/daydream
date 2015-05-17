package com.marswork.investment.futures.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;

public class SqlUtils {

	private static Cache cache;

	private static CacheManager manager;

	static {
		manager = CacheManager.create();
		cache = new Cache("AtomicDataCache", 10000,
				MemoryStoreEvictionPolicy.LFU, true, null, false, 6000, 3000,
				false, 0, null);
		manager.addCache(cache);
	}

	public static synchronized AtomicData getDataInMinite(Goods goods, Date date)
			throws MarsException {
		try {
			AtomicData result;
			String sql = "select * from " + goods.getFlag() + " where date='"
					+ DateUtils.format(date) + "'";
			if (cache.get(sql) == null) {
				Map<String, String> data = new CommonDAO().doSearch(sql)
						.getRows().get(0);
				result = new AtomicData(goods, date, data);
				cache.put(new Element(sql, result));
			} else {
				result = (AtomicData) cache.get(sql).getObjectValue();
			}
			return result;
		} catch (IndexOutOfBoundsException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Map<String, String>> getDataInDay(Goods goods, Date date)
			throws MarsException {

		String sql = "select date,shoupan from " + goods.getFlag()
				+ " where date >='"
				+ DateUtils.format(DateUtils.getFirstMinuteOfDay(date))
				+ "' and  date <= '"
				+ DateUtils.format(DateUtils.getLastMinuteOfDay(date))
				+ "' order by date asc";

		CommonVO vo = new CommonDAO().doSearch(sql);
		return vo.getRows();
	}

	public static List<Map<String, String>> getDataInAdjacentDays(Goods goods,
			Date date) throws MarsException {

		Date lastDate;
		Date nextDate;

		try {
			lastDate = TradeDate.getLastTradeDate(date);
		} catch (Exception e) {
			lastDate = date;
		}
		try {
			nextDate = TradeDate.getNextTradeDate(date);
		} catch (Exception e) {
			nextDate = date;
		}

		String sql = "select date,shoupan,zuigao,zuidi from " + goods.getFlag()
				+ " where date >='"
				+ DateUtils.format(DateUtils.getFirstMinuteOfDay(lastDate))
				+ "' and  date <= '"
				+ DateUtils.format(DateUtils.getLastMinuteOfDay(nextDate))
				+ "' order by date asc";

		CommonVO vo = new CommonDAO().doSearch(sql);
		return vo.getRows();
	}

	// public static AtomicData getDataInMinite(Goods goods, Date date)
	// throws MarsException {
	// try {
	// AtomicData result;
	// String sql = "select * from " + goods.getFlag() + " where date='"
	// + DateUtils.format(date) + "'";
	// Map<String, String> data = new CommonDAO().doSearch(sql).getRows()
	// .get(0);
	// result = new AtomicData(goods, date, data);
	// return result;
	// } catch (IndexOutOfBoundsException e) {
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// return null;
	// }

	public static double getAvgPriceInMinite(Goods goods, Date date)
			throws MarsException {
		AtomicData data = getDataInMinite(goods, date);
		// 交易价为当前时间最高价加最低价加开盘价除以3
		return (data.getKaipan() + data.getZuigao() + data.getZuidi()) / 3;
	}

	public static String checkData(Goods goods, Date date) throws MarsException {
		AtomicData data = getDataInMinite(goods, date);
		if (data.getKaipan() > data.getZuigao()
				|| data.getShoupan() > data.getZuigao()
				|| data.getZuidi() > data.getZuigao()) {
			return "数据异常：" + DateUtils.format(date) + "最高价不是最高";
		}
		if (data.getKaipan() < data.getZuidi()
				|| data.getShoupan() < data.getZuidi()
				|| data.getZuigao() < data.getZuidi()) {
			return "数据异常：" + DateUtils.format(date) + "最低价不是最低";
		}
		if (data.getZuigao() / data.getZuidi() > 1.08) {
			return "数据异常：" + DateUtils.format(date) + "最高价比最低价超过可能范围";
		}
		return "";
	}
}
