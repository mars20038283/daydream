package com.marswork.investment.futures.loaddata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.marswork.core.minitools.file.FileOperater;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;

public class CheckFileAndData {

	private static int index = 0;

	private static List<Integer> failedIndex=new ArrayList<Integer>();

	private static List<String> failedString=new ArrayList<String>();

	public static void main(String[] args) {
		File targetFile = new File(DataLoadRunner.dataFile);
		check(targetFile);
		BasicUtils.outList(failedIndex);
		// BasicUtils.out(failedString);
	}

	private static void check(File dataFile) {
		if (dataFile.isDirectory()) {
			for (File subFile : dataFile.listFiles()) {
				check(subFile);
			}
		} else {
			if (!(dataFile.getName().toUpperCase().startsWith("ZZTA01")
					|| dataFile.getName().toUpperCase().startsWith("ZZTA05")
					|| dataFile.getName().toUpperCase().startsWith("ZZTA09")
					|| dataFile.getName().toUpperCase().startsWith("ZZMA06")
					|| dataFile.getName().toUpperCase().startsWith("ZZMA09")
					|| dataFile.getName().toUpperCase().startsWith("DLL01")
					|| dataFile.getName().toUpperCase().startsWith("DLL05")
					|| dataFile.getName().toUpperCase().startsWith("DLL09")
					|| dataFile.getName().toUpperCase().startsWith("SQRU01")
					|| dataFile.getName().toUpperCase().startsWith("SQRU05")
					|| dataFile.getName().toUpperCase().startsWith("SQRU09")
					|| dataFile.getName().toUpperCase().startsWith("SQRB01")
					|| dataFile.getName().toUpperCase().startsWith("SQRB05") || dataFile
					.getName().toUpperCase().startsWith("SQRB09"))
					&& !dataFile.getName().toUpperCase().endsWith("MI.CSV")
					&& !dataFile.getName().toUpperCase().endsWith("-.CSV")) {
				index++;
				BasicUtils.out(index + "_" + dataFile.getAbsolutePath());
				// loader.loadData(dataFile.getAbsolutePath());
				if (index > 1140) {
					doCheck(dataFile);
				}
			}
		}
	}

	private static void doCheck(File dataFile) {
		try {
			String fileName = FileOperater.getSimpleName(dataFile
					.getAbsolutePath());
			CsvReader products = new CsvReader(dataFile.getAbsolutePath());
			String lastDateOfFile = "";
			while (products.readRecord()) {
				lastDateOfFile = products.get(0) + " ";
				if (products.get(1).length() == 4) {
					lastDateOfFile += "0";
				}
				lastDateOfFile += products.get(1) + ":00";
			}
			String sql = ("select * from " + fileName + " where date = '"
					+ lastDateOfFile + "'").replace("/", "-");
			CommonDAO dao = new CommonDAO();
			CommonVO vo = dao.doSearch(sql);
			BasicUtils.out(vo.hasData());
			if (!vo.hasData()) {
				failedIndex.add(index);
				failedString.add(dataFile.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
