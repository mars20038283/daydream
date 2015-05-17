package com.marswork.investment.futures.context.atomicdata;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;

public class AtomicData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6092837181844841973L;

	private Goods goods;

	private Date date;

	private double kaipan;

	private double zuigao;

	private double zuidi;

	private double shoupan;

	private int chengjiao;

	private int chicang;

	public AtomicData() {
	}

	public AtomicData(Goods goods, Date date, Map<String, String> data) {
		doWrap(goods, date, data);
	}

	public void doWrap(Goods goods, Date date, Map<String, String> data) {
		this.goods = goods;
		this.date = date;
		this.kaipan = Double.parseDouble(data.get("KAIPAN"));
		this.zuigao = Double.parseDouble(data.get("ZUIGAO"));
		this.zuidi = Double.parseDouble(data.get("ZUIDI"));
		this.shoupan = Double.parseDouble(data.get("SHOUPAN"));
		this.chengjiao = Integer.parseInt(data.get("CHENGJIAO"));
		this.chicang = Integer.parseInt(data.get("CHICANG"));
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

	public double getKaipan() {
		return kaipan;
	}

	public void setKaipan(double kaipan) {
		this.kaipan = kaipan;
	}

	public double getZuigao() {
		return zuigao;
	}

	public void setZuigao(double zuigao) {
		this.zuigao = zuigao;
	}

	public double getZuidi() {
		return zuidi;
	}

	public void setZuidi(double zuidi) {
		this.zuidi = zuidi;
	}

	public double getShoupan() {
		return shoupan;
	}

	public void setShoupan(double shoupan) {
		this.shoupan = shoupan;
	}

	public int getChengjiao() {
		return chengjiao;
	}

	public void setChengjiao(int chengjiao) {
		this.chengjiao = chengjiao;
	}

	public int getChicang() {
		return chicang;
	}

	public void setChicang(int chicang) {
		this.chicang = chicang;
	}

	public String toString() {
		return DateUtils.format(date) + "--kaipan:" + kaipan + ";zuigao:"
				+ zuigao + ";zuidi" + zuidi + ";shoupan:" + shoupan
				+ ";chengjiao:" + chengjiao + ";chicang:" + chicang;
	}
}
