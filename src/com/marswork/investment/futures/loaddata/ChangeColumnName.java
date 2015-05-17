package com.marswork.investment.futures.loaddata;

import java.util.ArrayList;
import java.util.List;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.common.DbSysInfo;

public class ChangeColumnName {

	public static void main(String[] args) {
		try {
			List<String> tableNames = DbSysInfo.getAllUserTable();
			String sql = "alter table %1$s change %2$s %3$s double null";
			for (String tableName : tableNames) {
//				if (tableName.contains("zzsr")) {
					BasicUtils.out("正在执行：" + tableName);
					String sql1 = String
							.format(sql, tableName, "ZUIDI", "TEMP");
					String sql2 = String.format(sql, tableName, "ZUIGAO",
							"ZUIDI");
					String sql3 = String.format(sql, tableName, "SHOUPAN",
							"ZUIGAO");
					String sql4 = String.format(sql, tableName, "TEMP",
							"SHOUPAN");
					new CommonDAO().doExec(sql1);
					new CommonDAO().doExec(sql2);
					new CommonDAO().doExec(sql3);
					new CommonDAO().doExec(sql4);
//				}
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}
	}
}
