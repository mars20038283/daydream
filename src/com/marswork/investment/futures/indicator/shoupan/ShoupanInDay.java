package com.marswork.investment.futures.indicator.shoupan;

import java.util.Date;

import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class ShoupanInDay {

	private Goods goods;

	private Date date;

	private double shoupan;

	public ShoupanInDay(Goods goods, String date, String shoupan) {
		this.goods = goods;
		this.date = DateUtils.parse(date);
		this.shoupan = Double.parseDouble(shoupan);
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getShoupan() {
		return shoupan;
	}

	public void setShoupan(double shoupan) {
		this.shoupan = shoupan;
	}

}
