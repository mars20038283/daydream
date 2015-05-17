/**
 * 
 */
package com.marswork.investment.futures.enums;

import com.marswork.core.enums.I_Category;

/**
 * 
 * @author daijun02
 * 
 */
public enum RangeCategory implements I_Category<RangeCategory> {

	ZZ("郑州"),

	SQ("上海"),

	DL("大连"),

	ALL("全部"),

	;

	public String getName() {
		return name;
	}

	private String name;

	private RangeCategory(String name) {
		this.name = name;
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
	public RangeCategory reflect(String categoryName) {
		for (RangeCategory category : values()) {
			if (category.getCategoryName().equals(categoryName)) {
				return category;
			}
		}
		return null;
	}
}
