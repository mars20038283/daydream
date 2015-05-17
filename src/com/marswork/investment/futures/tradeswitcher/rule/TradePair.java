package com.marswork.investment.futures.tradeswitcher.rule;

import java.util.ArrayList;
import java.util.List;

import com.marswork.investment.futures.context.trade.Trade;

public class TradePair extends Trade {

	public TradePair(Trade trade, Trade lastTrade) {
		super(trade.getAccount(), trade.getDate(), trade.isOpen(),
				trade.isIn(), trade.getGoods(), trade.getPrice(), trade
						.getShou());
		this.lastTrade = lastTrade;
	}

	private Trade lastTrade;

	private boolean picked;

	public boolean isPicked() {
		return picked;
	}

	public void setPicked(boolean picked) {
		this.picked = picked;
	}

	public static List<TradePair> toPickedList(List<Trade> tradeList) {
		List<TradePair> pTradList = new ArrayList<TradePair>();
		for (int i = 0; i < tradeList.size(); i++) {
			if (!tradeList.get(i).isOpen()) {
				pTradList.add(new TradePair(tradeList.get(i), tradeList
						.get(i - 1)));
			}
		}
		return pTradList;
	}

	public Trade getLastTrade() {
		return lastTrade;
	}
}
