package com.marswork.investment.futures.context.main;

import com.marswork.investment.futures.policy.AbstractPolicy;
import com.marswork.investment.futures.policy.tradeinday.TradeInDay;
import com.marswork.investment.futures.policy.trademacd.TradeMacd;
import com.marswork.investment.futures.policy.tradeplatform.TradePlatform;

public class MainThread {

	private static VirtureRunner runner;
	private static AbstractPolicy policy = new TradeInDay();
//	private static AbstractPolicy policy = new TradeMacd();
//	private static AbstractPolicy policy = new TradePlatform();

	public static void main(String[] args) {

		runner = new VirtureRunner(policy);
		runner.run();
	}

}
