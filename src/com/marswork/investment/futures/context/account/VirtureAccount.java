package com.marswork.investment.futures.context.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.utils.DateUtils;

public class VirtureAccount {

	private final double originSum = 2000;

	private double currSum;

	private Map<Goods, Integer> chiCang;

	private List<Trade> tradeRecored;

	private static int MIN_LEFT = 50;

	public VirtureAccount() {
		currSum = originSum;
		chiCang = new HashMap<Goods, Integer>();
		tradeRecored = new ArrayList<Trade>();
	}

	public void buy(Trade trade) {
		if (chiCang.get(trade.getGoods()) == null) {
			chiCang.put(trade.getGoods(), 0);
		}
		chiCang.put(trade.getGoods(),
				chiCang.get(trade.getGoods()) + trade.getShou());
		if (trade.isOpen()) {
			currSum -= trade.getBaozhengjin();
		} else {
			Trade lastTrade = getLastTrade();
			currSum += lastTrade.getZongJine() - trade.getZongJine()
					+ lastTrade.getBaozhengjin();
		}
	}

	public void sell(Trade trade) {
		if (chiCang.get(trade.getGoods()) == null) {
			chiCang.put(trade.getGoods(), 0);
		}
		chiCang.put(trade.getGoods(),
				chiCang.get(trade.getGoods()) - trade.getShou());
		if (trade.isOpen()) {
			currSum -= trade.getBaozhengjin();
		} else {
			Trade lastTrade = getLastTrade();
			currSum += trade.getZongJine() - lastTrade.getZongJine()
					+ lastTrade.getBaozhengjin();
		}
	}

	public void sell() {

	}

	public void appendTradeList(Trade trade) {
		tradeRecored.add(trade);
	}

	public Trade getLastTrade() {
		if (tradeRecored.size() > 0) {
			return tradeRecored.get(tradeRecored.size() - 1);
		} else {
			return null;
		}
	}

	public Map<Goods, Integer> getChiCang() {
		return chiCang;
	}

	public int getChiCang(Goods goods) {
		if (chiCang.get(goods) == null) {
			chiCang.put(goods, 0);
		}
		return chiCang.get(goods);
	}

	public List<Trade> getTradeRecored() {
		return tradeRecored;
	}

	public int openShou(Goods goods, boolean isIn, double price) {

		price = isIn ? (int) Math.ceil(price) : (int) Math.floor(price);
		int shou = (int) (currSum / (goods.getFutures().getShou() * price
				* goods.getFutures().getBaoZhengJin() / 100));

		if ((goods.getFutures().getShou() * price
				* goods.getFutures().getBaoZhengJin() / 100)
				+ MIN_LEFT > currSum
				&& shou > 0) {
			shou--;
		}
		return shou;
	}

	public int closeShou(Goods goods) {
		Integer shou = chiCang.get(goods);
		if (shou == null) {
			shou = 0;
		}
		return Math.abs(shou);
	}

	public double getOriginSum() {
		return originSum;
	}

	public double getCurrSum() {
		return currSum;
	}
}
