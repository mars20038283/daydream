package com.marswork.investment.futures.tradeswitcher.rule;

import java.util.ArrayList;
import java.util.List;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class RemoveEngin {

//	private static List<I_RemoveRule> rules = new ArrayList<I_RemoveRule>();

	// private static Pianlidu rule_pinalidu = new Pianlidu();
	// static {
	// rules.add(rule_pinalidu);
	// }

	public static TradePair getPickedTrade(List<TradePair> dayTrade) {
		// 偏离率
		for (TradePair trade : dayTrade) {
			try {
				if (pianli12(trade) > 0.3 || pianli12(trade) < -0.3) {
					trade.setPicked(false);
				}
			} catch (MarsException e) {
				continue;
			}
		}
		dayTrade = repick(dayTrade);
		if (dayTrade.size() == 1) {
			return dayTrade.get(0);
		}
		// 回落
		for (TradePair trade : dayTrade) {
			try {
				if (huiluo(trade) >= 0.4) {
					trade.setPicked(false);
				}
			} catch (MarsException e) {
				continue;
			}
		}
		dayTrade = repick(dayTrade);
		if (dayTrade.size() == 1) {
			return dayTrade.get(0);
		}
		//顺市
		for (TradePair trade : dayTrade) {
			try {
				if (!isShunShi(trade)) {
					trade.setPicked(false);
				}
			} catch (MarsException e) {
				continue;
			}
		}
		dayTrade = repick(dayTrade);
		if (dayTrade.size() == 1) {
			return dayTrade.get(0);
		}
		//涨得多
		return dayTrade.get(0);
	}

	private static List<TradePair> repick(List<TradePair> dayTrade) {
		List<TradePair> result = new ArrayList<TradePair>();
		for (TradePair trade : dayTrade) {
			if (trade.isPicked()) {
				result.add(trade);
			}
		}
		if (result.size() == 0) {
			result.add(dayTrade.get(0));
		}
		return result;
	}

	private static double pianli12(Trade trade) throws MarsException {
		AtomicData data29 = SqlUtils.getDataInMinite(trade.getGoods(),
				DateUtils.get29Munite(trade.getDate()));
		int ma12 = IndicatorsManager.getHourMa(trade.getGoods(),
				trade.getDate(), 12);
		return NumberUtils.formatNumber((data29.getShoupan() - ma12) / ma12
				* 100);
	}

	private static double huiluo(TradePair trade) throws MarsException {
		double huiluo;
		Trade lastTrade = trade.getLastTrade();
		if (trade.isOpen()) {
			AtomicData moring29m = SqlUtils.getDataInMinite(trade.getGoods(),
					DateUtils.get29Munite(trade.getDate()));
			if (trade.isIn()) {
				huiluo = NumberUtils.formatNumber(IndicatorsManager
						.getTodayMoringHigh(trade.getGoods(), trade.getDate())
						/ moring29m.getShoupan() * 100);
			} else {
				huiluo = NumberUtils.formatNumber(moring29m.getShoupan()
						/ IndicatorsManager.getTodayMoringLow(trade.getGoods(),
								trade.getDate()) * 100);
			}
		} else {
			AtomicData moring29m = SqlUtils.getDataInMinite(
					lastTrade.getGoods(),
					DateUtils.get29Munite(lastTrade.getDate()));
			if (!trade.isIn()) {
				huiluo = NumberUtils.formatNumber(IndicatorsManager
						.getTodayMoringHigh(lastTrade.getGoods(),
								lastTrade.getDate())
						/ moring29m.getShoupan() * 100);
			} else {
				huiluo = NumberUtils.formatNumber(moring29m.getShoupan()
						/ IndicatorsManager.getTodayMoringLow(
								lastTrade.getGoods(), lastTrade.getDate())
						* 100);
			}
		}
		return NumberUtils.formatNumber(huiluo - 100);
	}

	private static boolean isShunShi(TradePair trade) throws MarsException {
		int ma55 = IndicatorsManager.getHourMa(trade.getGoods(),
				trade.getDate(), 55);
		int ma120 = IndicatorsManager.getHourMa(trade.getGoods(),
				trade.getDate(), 120);
		if ((ma55 > ma120 && !trade.isIn()) || (ma55 <= ma120 && trade.isIn())) {
			return true;
		}
		return false;
	}

}