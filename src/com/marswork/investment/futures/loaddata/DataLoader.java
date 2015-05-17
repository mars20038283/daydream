package com.marswork.investment.futures.loaddata;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.csvreader.CsvReader;
import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.file.FileOperater;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.UUIDGenerator;
import com.marswork.dataaccess.basic.CommonDAO;

public class DataLoader {

	private CommonDAO dao = new CommonDAO();
	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	public void loadData(String dataFilePath) {
		try {
			FuturesData data = new FuturesData();
			CsvReader products = new CsvReader(dataFilePath);

			String fileName = FileOperater.getSimpleName(dataFilePath);

			while (products.readRecord()) {
				data.setDate(products.get(0), products.get(1));
				data.setKaipan(Double.parseDouble(products.get(2)));
				data.setZuigao(Double.parseDouble(products.get(3)));
				data.setZuidi(Double.parseDouble(products.get(4)));
				data.setShoupan(Double.parseDouble(products.get(5)));
				data.setChengjiao(Integer.parseInt(products.get(6).replace(
						".00", "")));
				data.setChicang(Integer.parseInt(products.get(7).replace(".00",
						"")));
				insertFuturesData(fileName, data);
			}

			products.close();
		} catch (Exception e) {
			BasicUtils.out("异常文件："+dataFilePath);
			e.printStackTrace();
		} 
	}

	public void insertFuturesData(String tableName, FuturesData data) {
		String sql = "insert into "
				+ tableName
				+ " (`DATA_ID`,`DATE`,`KAIPAN`,`SHOUPAN`,`ZUIGAO`,`ZUIDI`,`CHENGJIAO`,`CHICANG`) values"
				+ " ('" + UUIDGenerator.getNextValue() + "','"
				+ df.format(data.getDate()) + "'," + data.getKaipan() + ","
				+ data.getShoupan() + "," + data.getZuigao() + ","
				+ data.getZuidi() + "," + data.getChengjiao() + ","
				+ data.getChicang() + ")";
		try {
			dao.doExec(sql);
		} catch (MarsException e) {
			if (e.getMessage().contains("doesn't exist")
					&& e.getMessage().contains("Table")) {
				String createTableSql = "CREATE TABLE `"
						+ tableName
						+ "` (`DATA_ID` char(32) NOT NULL DEFAULT '',  `DATE` datetime DEFAULT NULL,  `KAIPAN` double DEFAULT NULL,  `SHOUPAN` double DEFAULT NULL,  `ZUIGAO` double DEFAULT NULL,  `ZUIDI` double DEFAULT NULL,  `CHENGJIAO` int(11) DEFAULT NULL,  `CHICANG` int(11) DEFAULT NULL,  PRIMARY KEY (`DATA_ID`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;";

				try {
					dao.doExec(createTableSql);
					dao.doExec(sql);
				} catch (MarsException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
