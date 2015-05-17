/**
 * 
 */
package com.marswork.investment.futures.enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.marswork.core.enums.I_Category;

/**
 * 
 * @author daijun02
 * 
 */
public enum FuturesCategory implements I_Category<FuturesCategory>,
		Serializable {

	CF("棉花", "ZZ", 9, 1.2, 5, 5, false, true),

	FG("玻璃", "ZZ", 9, 3.34, 20, 1, true, false),

	ME("甲醇", "ZZ", 11, 1.2, 50, 1, false, true),

	OI("菜油", "ZZ", 8, 2.76, 10, 2, false, false),

	PM("普麦", "ZZ", 8, 1.2, 50, 1, false, true),

	RI("籼稻", "ZZ", 8, 1.2, 20, 1, false, true),

	RM("菜粕", "ZZ", 8, 2, 10, 1, true, false),

	RS("菜籽", "ZZ", 8, 1.2, 10, 1, false, true),

	SRX("白糖", "ZZ", 9, 3.5, 10, 1, true, false),
	
	SRY("白糖", "ZZ", 9, 3.5, 10, 1, true, false),

	TA("PTA", "ZZ", 11, 3.5, 5, 2, false, false),

	WH("强麦", "ZZ", 8, 1.2, 20, 1, false, true),

	AX("黄豆", "DL", 8, 2.25, 10, 1, false, false),

	B("豆二", "DL", 8, 1.2, 10, 1, false, true),

	C("玉米", "DL", 8, 1.2, 10, 1, false, true),

	J("焦炭", "DL", 8, 1, 100, 1, true, true),

	L("乙烯", "DL", 8, 1.2, 5, 5, false, true),

	M("豆粕", "DL", 8, 2.5, 10, 1, false, false),

	P("棕油", "DL", 8, 3, 10, 2, false, false),

	Y("豆油", "DL", 8, 3, 10, 2, false, false),

	V("聚氯", "DL", 8, 1.2, 5, 5, false, true),

	JM("焦煤", "DL", 8, 1.2, 60, 1, false, true),

	AG("白银", "SQ", 11, 4, 15, 1, true, false),

	AL("铝", "SQ", 8, 1.2, 5, 5, false, true),

	AU("黄金", "SQ", 10, 1.2, 1000, 0.05, false, true),

	CU("铜", "SQ", 11, 1.2, 5, 10, false, true),

	FU("燃油", "SQ", 11, 1.2, 50, 1, false, true),

	PB("铅", "SQ", 11, 1.2, 25, 5, false, true),

	RB("螺纹", "SQ", 10, 2, 10, 1, false, false),

	RU("橡胶", "SQ", 10, 1.2, 10, 5, false, false),

	WR("线材", "SQ", 10, 1.2, 10, 1, false, true),

	ZN("锌", "SQ", 9, 1.2, 5, 5, false, true)

	;

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public int getBaoZhengJin() {
		return baoZhengJin;
	}

	public double getShouXuFei() {
		return shouXuFei;
	}

	public int getShou() {
		return shou;
	}

	public double getChaJia() {
		return chaJia;
	}

	public boolean isRiNeiJianBan() {
		return riNeiJianBan;
	}

	/**
	 * 品种名称
	 */
	private String name;
	/**
	 * 交易所
	 */
	private String place;
	/**
	 * 保证金百分比
	 */
	private int baoZhengJin;
	/**
	 * 手续费万分比
	 */
	private double shouXuFei;

	/**
	 * 每手数量
	 */
	private int shou;

	/**
	 * 最小差价，每跳价格
	 */
	private double chaJia;

	/**
	 * 是续费是否日内减半
	 */
	private boolean riNeiJianBan;

	/**
	 * 手续费是固定还是万分比
	 */
	private boolean shouXuFeiBili;

	private FuturesCategory(String name, String place, int baoZhengJin,
			double shouXuFei, int shou, double chaJia, boolean riNeiJianBan,
			boolean shouXuFeiBili) {
		this.name = name;
		this.place = place;
		this.baoZhengJin = baoZhengJin;
		this.shouXuFei = shouXuFei;
		this.shou = shou;
		this.chaJia = chaJia;
		this.riNeiJianBan = riNeiJianBan;
		this.shouXuFeiBili = shouXuFeiBili;
	}

	@Override
	public String getCategoryName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.marswork.core.enums.Category#reflect(java.lang.String)
	 */
	@Override
	public FuturesCategory reflect(String categoryName) {
		for (FuturesCategory category : values()) {
			if (category.getCategoryName().equals(categoryName)) {
				return category;
			}
		}
		return null;
	}

	public static List<FuturesCategory> getFuturesByRange(
			RangeCategory rangeCategory) {
		List<FuturesCategory> result = new ArrayList<FuturesCategory>();
		for (FuturesCategory f : values()) {
			if (rangeCategory == RangeCategory.ALL
					|| f.getPlace().equals(rangeCategory.name())) {
				result.add(f);
			}
		}
		return result;
	}

	public boolean isShouXuFeiBili() {
		return shouXuFeiBili;
	}

}
