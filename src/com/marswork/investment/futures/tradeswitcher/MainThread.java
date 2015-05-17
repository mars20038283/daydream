package com.marswork.investment.futures.tradeswitcher;

import java.util.Calendar;
import java.util.Date;

import com.marswork.investment.futures.indicator.tradedate.TradeDate;

public class MainThread {

	public static void main(String[] args) {
		TradePicker picker = new TradePicker();
		picker.doPick();
	}
}
