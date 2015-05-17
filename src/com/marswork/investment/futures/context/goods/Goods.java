package com.marswork.investment.futures.context.goods;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.investment.futures.enums.FuturesCategory;

public class Goods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6714488128942434321L;

	private FuturesCategory futures;

	private String flag;

	private int jiaogeYuefen;

	public Goods(FuturesCategory futures, String deadlineMonth) {
		this.futures = futures;
		this.flag = (futures.getPlace() + futures.name() + deadlineMonth)
				.toLowerCase();
	}

	public Goods(String flag) {
		this.flag = flag;
		Pattern pattern = Pattern
				.compile("([dl|sq|zz]{2})([\\w]*)([\\d]{2})");
		Matcher matcher = pattern.matcher(flag);
		this.futures = FuturesCategory.valueOf(matcher.replaceAll("$2")
				.toUpperCase());
		this.jiaogeYuefen = Integer.parseInt(matcher.replaceAll("$3"));
	}

	public FuturesCategory getFutures() {
		return futures;
	}

	public String getFlag() {
		return flag;
	}

	public int getJiaogeYuefen() {
		return jiaogeYuefen;
	}
}
