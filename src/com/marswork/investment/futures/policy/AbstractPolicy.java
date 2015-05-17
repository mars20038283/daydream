package com.marswork.investment.futures.policy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.exceptions.object.datetime.NotDateTimeException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.enums.RangeCategory;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public abstract class AbstractPolicy {

	private Date fromDate;

	private Date toDate;

	private RangeCategory range;

	private List<Goods> goods = new ArrayList<Goods>();

	private Date skipToTime;

	private boolean doNextGoods;

	public Date getSkipToTime() {
		Date d = skipToTime;
		skipToTime = null;
		return d;
	}

	public void setSkipToTime(Date skipToTime) {
		this.skipToTime = skipToTime;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void addGoods(Goods g) {
		this.goods.add(g);
	}

	public Date getFromDate() {
		if (fromDate == null) {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, 2006);
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 4);
			c.set(Calendar.HOUR_OF_DAY, 9);
			c.set(Calendar.MINUTE, 1);
			c.set(Calendar.SECOND, 0);
			fromDate = c.getTime();
		}
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		if (toDate == null)
			toDate = new Date();
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public RangeCategory getRange() {
		return range;
	}

	public void setRange(RangeCategory range) {
		try {
			this.range = range;
			for (String tableNames : DbSysInfo.getAllUserTable()) {
				goods.add(new Goods(tableNames));
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}
	}
	
	public void beforeGoods(Goods goods){}
	
	public void afterGoods(Goods goods){}
	
	public void beforeThisMinute(Goods goods,Date date){}
	
	public void afterThisMinute(Goods goods,Date date){}
	
	public abstract Trade kaiCang(VirtureAccount account, Goods goods, Date date);

	public abstract Trade pingCang(VirtureAccount account, Goods goods,
			Date date);

	public abstract String getName();

	public abstract boolean printTrend();

	public abstract void createResultExcel(VirtureAccount account,
			List<Trade> tradeRecoreds);

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public boolean isDoNextGoods() {
		return doNextGoods;
	}

	public void setDoNextGoods(boolean doNextGoods) {
		this.doNextGoods = doNextGoods;
	}

	protected boolean isTheLastDay(Date date) throws NotDateTimeException,
			DateOutOfRangeException {
		Date lastTradeDate = TradeDate.getTheLastTradeDate();
		Date toDate = getToDate();
		if (toDate.before(lastTradeDate)) {
			lastTradeDate = toDate;
		}
		return DateUtils.getFirstMinuteOfDay(lastTradeDate).equals(
				DateUtils.getFirstMinuteOfDay(date));
	}

	protected List<Trade> removeInvalidTrade(List<Trade> tradeRecoreds,
			Map<Trade, String> errors) {
		List<Trade> newTradeList = new ArrayList<Trade>();
		Trade trade;
		for (int i = 0; i < tradeRecoreds.size(); i++) {
			trade = tradeRecoreds.get(i);
			try {// 交易数据检查
				if (trade.isOpen()) {
					String check1 = SqlUtils.checkData(trade.getGoods(),
							trade.getDate());
					String check2 = SqlUtils.checkData(tradeRecoreds.get(i + 1)
							.getGoods(), tradeRecoreds.get(i + 1).getDate());
					if (!BasicUtils.isTrimBlank(check1)) {
						errors.put(trade, check1);
						continue;
					} else if (!BasicUtils.isTrimBlank(check2)) {
						errors.put(tradeRecoreds.get(i + 1), check2);
						continue;
					}
				} else {
					continue;
				}
				newTradeList.add(trade);
				newTradeList.add(tradeRecoreds.get(i + 1));
			} catch (Exception e1) {
				continue;
			}
		}
		return newTradeList;
	}
}
