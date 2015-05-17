package com.marswork.investment.futures.loaddata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.marswork.core.common.data.MarsBean;

public class FuturesData extends MarsBean{

	/**
	 * 数据时间
	 */
	private Date date;

	/**
	 * 开盘价(股指期货当月连续)
	 */
	private double kaipan;

	/**
	 * 收盘价(股指期货当月连续)
	 */
	private double shoupan;
	/**
	 * 最高价(股指期货当月连续)
	 */
	private double zuigao;
	/**
	 * 最低价(股指期货当月连续)
	 */
	private double zuidi;
	/**
	 * 成交量(股指期货当月连续)
	 */
	private int chengjiao;
	/**
	 * 当天截止的持仓量(股指期货当月连续)
	 */
	private int chicang;

	public Date getDate() {
		return date;
	}

	public void setDate(String day, String minit) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			date = df.parse(day.replace("/", "-") + " " + minit);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public double getKaipan() {
		return kaipan;
	}

	public void setKaipan(double kaipan) {
		this.kaipan = kaipan;
	}

	public double getShoupan() {
		return shoupan;
	}

	public void setShoupan(double shoupan) {
		this.shoupan = shoupan;
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

	public double getChengjiao() {
		return chengjiao;
	}

	public void setChengjiao(int chengjiao) {
		this.chengjiao = chengjiao;
	}

	public double getChicang() {
		return chicang;
	}

	public void setChicang(int chicang) {
		this.chicang = chicang;
	}

	@Override
	public void evaluatePkValue(String arg0) {
		
	}

	@Override
	public String findPkColumn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPkValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
