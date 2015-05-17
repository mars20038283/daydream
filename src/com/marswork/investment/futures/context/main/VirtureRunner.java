package com.marswork.investment.futures.context.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.core.minitools.system.SystemExpenses;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class VirtureRunner {

	private AbstractPolicy policy;

	private List<AtomicData> dataInDay;

	private VirtureAccount account;

	public VirtureRunner(AbstractPolicy policy) {
		this.policy = policy;
		this.account = new VirtureAccount();
		this.dataInDay = new ArrayList<AtomicData>();
	}

	public AbstractPolicy getPolicy() {
		return policy;
	}

	public void setPolicy(AbstractPolicy policy) {
		this.policy = policy;
	}

	public void run() {
		SystemExpenses.printChanges();
		try {
			Date date;
			Date skipDay = null;
			for (Goods goods : policy.getGoods()) {// 循环每一个品种
				policy.beforeGoods(goods);
				date = policy.getFromDate();
				while (policy.getToDate().after(date)
						|| policy.getToDate().equals(date)) {// 循环每一分钟
					policy.beforeThisMinute(goods, date);
					dataInDay.add(SqlUtils.getDataInMinite(goods, date));
					// 更新每个时间段的运行时指标
					this.jiaoYi(policy.kaiCang(account, goods, date));// 运行开仓条件
					this.jiaoYi(policy.pingCang(account, goods, date));// 运行平仓条件
					policy.afterThisMinute(goods, date);
					skipDay = policy.getSkipToTime();// 跳转到指定时间
					if (skipDay != null) {
						date = skipDay;
					} else {
						date = DateUtils.addMinute(goods, date);// 没有指定的跳转时间，则跳转到下一分钟
					}
					if (date == null) {
						break;
					}
				}
				policy.afterGoods(goods);
				BasicUtils.out(goods.getFlag() + "结束了");
			}
		} catch (DateOutOfRangeException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		// for (Trade trade : account.getTradeRecored()) {
		// if (trade.isIn()) {
		// BasicUtils.out("交易结果：在 "
		// + BaseDate.formatDateToMinites(trade.getDate())
		// + " 买入 " + trade.getGoods().getFlag() + " "
		// + trade.getShou() + " 手，价格 " + trade.getPrice()
		// + "，手续费" + trade.getShouXuFei() + "，支出 "
		// + trade.getZongJine());
		// } else {
		// BasicUtils.out("交易结果：在 "
		// + BaseDate.formatDateToMinites(trade.getDate())
		// + " 卖出 " + trade.getGoods().getFlag() + " "
		// + trade.getShou() + " 手，价格 " + trade.getPrice()
		// + "，手续费" + trade.getShouXuFei() + "，收入  "
		// + trade.getZongJine());
		// }
		// }
		policy.createResultExcel(account, account.getTradeRecored());
		SystemExpenses.printChanges();
	}

	private void jiaoYi(Trade trade) throws MarsException {

		if (trade != null) {
			// 进行交易
			if (trade.isIn()) {
				account.buy(trade);
			} else {
				account.sell(trade);
			}
			account.appendTradeList(trade);
		}
	}
}
