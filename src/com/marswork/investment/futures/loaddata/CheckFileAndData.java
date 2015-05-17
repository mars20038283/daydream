package com.marswork.investment.futures.loaddata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.marswork.core.minitools.file.FileOperater;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;
import com.mysql.jdbc.StringUtils;

public class CheckFileAndData {

	private static int index = 0;

	private static List<Integer> failedIndex = new ArrayList<Integer>();

	private static List<String> failedString = new ArrayList<String>();

	public static void main(String[] args) {
		File targetFile = new File(DataLoadRunner.dataFile);
		check(targetFile);
		BasicUtils.outList(failedIndex);
		BasicUtils.outList(failedString);
	}

	public static List<String> check(File dataFile) {
		if (dataFile.isDirectory()) {
			for (File subFile : dataFile.listFiles()) {
				check(subFile);
			}
		} else {
			if ((dataFile.getName().toUpperCase().startsWith("ZZTA")
			// || dataFile.getName().toUpperCase().startsWith("ZZMA")
			// || dataFile.getName().toUpperCase().startsWith("SQRU")
			// || dataFile.getName().toUpperCase().startsWith("SQRB")
			|| dataFile.getName().toUpperCase().startsWith("SQNI"))
					&& !dataFile.getName().toUpperCase().endsWith("MI.CSV")
					&& !dataFile.getName().toUpperCase().endsWith("-.CSV")) {
				index++;
				BasicUtils.out(index + "_" + dataFile.getAbsolutePath());
				// loader.loadData(dataFile.getAbsolutePath());
				// if (index > 1140) {
				doCheck(dataFile);
				// }
			}
		}
		return failedString;
	}

	public static void doCheck(File dataFile) {
		try {
			String fileName = FileOperater.getSimpleName(dataFile
					.getAbsolutePath());

			CsvReader products = new CsvReader(dataFile.getAbsolutePath());
			String lastDateOfFile = "";
			String firstDateOfFile = "";
			while (products.readRecord()) {
				if (BasicUtils.isTrimBlank(firstDateOfFile)) {
					firstDateOfFile = products.get(0) + " ";
					if (products.get(1).length() == 4) {
						firstDateOfFile += "0";
					}
					firstDateOfFile += products.get(1) + ":00";
				}
				lastDateOfFile = products.get(0) + " ";
				if (products.get(1).length() == 4) {
					lastDateOfFile += "0";
				}
				lastDateOfFile += products.get(1) + ":00";
			}
			String sqlLash = ("select * from " + fileName + " where date = '"
					+ lastDateOfFile + "'").replace("/", "-");
			String sqlFirst = ("select * from " + fileName + " where date = '"
					+ firstDateOfFile + "'").replace("/", "-");
			CommonDAO dao = new CommonDAO();
			CommonVO voLast = dao.doSearch(sqlLash);
			CommonVO voFirst = dao.doSearch(sqlFirst);
			BasicUtils.out(voLast.hasData() && voFirst.getRowCountInVO() <= 1);
			if (!(voLast.hasData() && voFirst.getRowCountInVO() <= 1)) {
				failedIndex.add(index);
				failedString.add(dataFile.getAbsolutePath());
				dao.doExec("delete from " + fileName + " where date >= '"
						+ firstDateOfFile + "' and date <= '" + lastDateOfFile
						+ "'");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
