package com.marswork.investment.futures.loaddata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.csvreader.CsvReader;
import com.marswork.core.minitools.file.FileOperater;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.basic.CommonDAO;
import com.marswork.dataaccess.basic.CommonVO;

public class DataLoadRunner {

	public static final String dataFile = "F:\\期货相关\\期货数据";

	private static final DataLoader loader = new DataLoader();

	private static int index = 0;

	public static void main(String[] args) {
		File targetFile = new File(dataFile);
		doLoadDataFromCsv(targetFile);
	}

	public static void doLoadDataFromCsv(File dataFile) {
		if (dataFile.isDirectory()) {
			for (File subFile : dataFile.listFiles()) {
				doLoadDataFromCsv(subFile);
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
				if (index > 1257) {
					loader.loadData(dataFile.getAbsolutePath());
				}
			}
		}
	}
}