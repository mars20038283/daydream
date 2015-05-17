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
public enum ExtremePointCategory implements I_Category<ExtremePointCategory> {

	EXTREME_HIGH("极高点"),

	EXTREME_LOW("极低点"),

	;

	public String getName() {
		return name;
	}

	private String name;

	private ExtremePointCategory(String name) {
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
	public ExtremePointCategory reflect(String categoryName) {
		for (ExtremePointCategory category : values()) {
			if (category.getCategoryName().equals(categoryName)) {
				return category;
			}
		}
		return null;
	}
}
