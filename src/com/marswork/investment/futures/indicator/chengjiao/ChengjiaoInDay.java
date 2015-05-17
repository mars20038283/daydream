package com.marswork.investment.futures.indicator.chengjiao;

import java.util.Date;

import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class ChengjiaoInDay {

	private Goods goods;

	private Date date;

	private int chengjiao;

	public ChengjiaoInDay(Goods goods, String date, String chengjiao) {
		this.goods = goods;
		this.date = DateUtils.parse(date);
		this.chengjiao = Integer.parseInt(chengjiao);
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

	public int getChengjiao() {
		return chengjiao;
	}

	public void setChengjiao(int chengjiao) {
		this.chengjiao = chengjiao;
	}

}
