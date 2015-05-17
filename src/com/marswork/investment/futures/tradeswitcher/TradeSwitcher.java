package com.marswork.investment.futures.tradeswitcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.crit.TradeRecordCriteria;
import model.pojo.TradeRecord;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.dataaccess.criteria.CriteriaManager;

public class TradeSwitcher {

	private List<TradeRecord> tradeList;

	private TradeRecord pickedTrade;

	private List<TradeRecord> orginPickedList;

	private List<TradeRecord> abandonedList;

	private List<TradeRecord> tempPickedList;

	public TradeSwitcher(Date date) {
		try {
			this.tradeList = CriteriaManager
					.getInstance(TradeRecordCriteria.class)
					.findByJiaoyiriqi(BaseDate.formatDateToDays(date))
					.findByKaipingcang("开仓").getListBeans();
		} catch (MarsException e) {
			this.tradeList = new ArrayList<TradeRecord>();
		}
		this.orginPickedList = tradeList;
		this.abandonedList = new ArrayList<TradeRecord>();

		if (this.doPianlilvPick()) {

		}
	}

	private boolean doPianlilvPick() {
		tempPickedList = new ArrayList<TradeRecord>();
		for (TradeRecord trade : orginPickedList) {
			TradeRecord closeTrade = trade.getCloseTrade();
			if (closeTrade.getPianlilv12() > 0.3 || closeTrade.getPianlilv12() < -0.3) {
				abandonedList.add(trade);
			} else {
				tempPickedList.add(trade);
			}
		}
		if (tempPickedList.size() == 1) {
			pickedTrade = tempPickedList.get(0);
			return false;
		}
		if (tempPickedList.size() > 1) {
			orginPickedList = tempPickedList;
			return true;
		}
		doRepick();
		return false;
	}

	private void doRepick() {
		BasicUtils.out("大家来重新挑选吧");
		for (int i = 0; i < orginPickedList.size(); i++) {
			if (i == 0) {
				pickedTrade = orginPickedList.get(0);
			} else if (orginPickedList.get(i).getHuiluozhizuigao() < pickedTrade
					.getHuiluozhizuigao()) {
				pickedTrade = orginPickedList.get(i);
			}
		}
		abandonedList = new ArrayList<TradeRecord>();
		for (TradeRecord r : tradeList) {
			if (!pickedTrade.getTradeId().equals(r.getTradeId())) {
				abandonedList.add(r);
			}
		}
	}

	public TradeRecord getPickedTrade() {
		return pickedTrade;
	}

	public List<TradeRecord> getAbandonedList() {
		return abandonedList;
	}
}
