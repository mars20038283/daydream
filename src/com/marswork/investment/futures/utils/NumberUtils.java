package com.marswork.investment.futures.utils;

import java.text.DecimalFormat;

import com.marswork.core.minitools.object.BasicUtils;

public class NumberUtils {
	
	public static double formatNumber2(double source) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(source));
	}

	public static double formatNumber(double source) {
		DecimalFormat df = new DecimalFormat("#.#");
		return Double.parseDouble(df.format(source));
	}

	public static int formatInteger(double source) {
		DecimalFormat df = new DecimalFormat("#");
		return Integer.parseInt(df.format(source));
	}
	
	public static void main(String[] args){
		BasicUtils.out(formatInteger(26646.93));
	}
}
