package com.marswork.investment.futures.tradeswitcher.rule;

import com.marswork.investment.futures.context.trade.Trade;

public interface I_RemoveRule {

	public boolean remove(Trade trade);
}
