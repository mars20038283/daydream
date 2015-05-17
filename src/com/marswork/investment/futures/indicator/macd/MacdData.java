package com.marswork.investment.futures.indicator.macd;

import java.util.Date;

public class MacdData {

	private Date date;
	
	private double shoupan;
	
	private double ema12;
	
	private double ema26;
	
	private double dea;
	
	private double macd;

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

	public double getEma12() {
		return ema12;
	}

	public void setEma12(double ema12) {
		this.ema12 = ema12;
	}

	public double getEma26() {
		return ema26;
	}

	public void setEma26(double ema26) {
		this.ema26 = ema26;
	}

	public double getDea() {
		return dea;
	}

	public void setDea(double dea) {
		this.dea = dea;
	}

	public double getMacd() {
		return macd;
	}

	public void setMacd(double macd) {
		this.macd = macd;
	}
}
