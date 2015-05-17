package com.marswork.investment.futures.exceptions;

import java.util.Date;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.time.BaseDate;

public class DateOutOfRangeException extends MarsException{

	public DateOutOfRangeException(Date date) {
		super("日期 "+BaseDate.formatDateToSeconds(date)+" 超出数据范围");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -9017506416983220414L;

}
