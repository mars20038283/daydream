package com.marswork.investment.futures.tradeswitcher.rule;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.crit.TradeRecordCriteria;
import model.pojo.TradeRecord;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.map.BaseMap;
import com.marswork.core.minitools.object.map.MapKeyValue;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.dataaccess.criteria.CriteriaManager;
import com.marswork.investment.futures.context.trade.Trade;

public class CopyOfTradeSwitcher {

	private List<TradeRecord> tradeList;

	private List<TradeRecord> pickedList;

	private List<TradeRecord> abandonedList;

	private List<TradeRecord> tempAbandonedList;

	public CopyOfTradeSwitcher(Date date) {
		try {
			this.tradeList = CriteriaManager
					.getInstance(TradeRecordCriteria.class)
					.findByJiaoyiriqi(BaseDate.formatDateToDays(date))
					.getListBeans();
		} catch (MarsException e) {
			this.tradeList = new ArrayList<TradeRecord>();
		}
		this.pickedList = new ArrayList<TradeRecord>();
		this.abandonedList = new ArrayList<TradeRecord>();
		this.doPick();
	}

	private void doPick() {
		tempAbandonedList = new ArrayList<TradeRecord>();
	}

	private void doRepick() {

	}
}
