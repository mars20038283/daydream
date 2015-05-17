package com.marswork.investment.futures.loaddata;

import java.util.List;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.dataaccess.exception.DumplicateIndexException;

public class CreateIndex {
	public static void main(String[] args) {
		try {
			List<String> tableNames = DbSysInfo.getAllUserTable();

			for (String tableName : tableNames) {
				BasicUtils.out("正在执行：" + tableName);
				String sql = "create index ax_date on " + tableName + " (date)";
				try {
					new CommonDAO().doExec(sql);
				} catch (Exception e) {
					if (e.getMessage().startsWith("Duplicate key name")) {
						continue;
					}
					if (e.getMessage().equals(
							"Key column 'date' doesn't exist in table")) {
						continue;
					}
					throw new MarsException(e.getMessage());
				}
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}
	}
}
