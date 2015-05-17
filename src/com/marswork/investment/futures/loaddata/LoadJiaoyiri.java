package com.marswork.investment.futures.loaddata;

import java.util.List;
import java.util.Map;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.marswork.dataaccess.common.DbSysInfo;
import com.marswork.dataaccess.exception.DumplicateIndexException;
import com.marswork.dataaccess.exception.DumplicateKeyException;

public class LoadJiaoyiri {

	public static void main(String[] args) {

		try {
			CommonDAO dao = new CommonDAO();
			List<String> tableNames = DbSysInfo.getAllUserTable();
			String deleteSql = "delete from trade_date";
			try {
				dao.doSearch(deleteSql);
			} catch (Exception e1) {
			}
			for (String tableName : tableNames) {
				if (!tableName.equals("trade_date")) {
					String sql = "select left(date,10) as DATE from "
							+ tableName
							+ " group by left(date,10) order by date asc";
					CommonVO vo = dao.doSearch(sql);
					for (Map<String, String> map : vo.getRows()) {
						sql = "insert into trade_date (trade_date) values ('"
								+ map.get("DATE") + " 09:01:00" + "')";
						try {
							dao.doExec(sql);
						} catch (DumplicateIndexException e) {
							continue;
						} catch (DumplicateKeyException e) {
							continue;
						}
					}
				}
			}
		} catch (MarsException e) {
			e.printStackTrace();
		}

	}
}
