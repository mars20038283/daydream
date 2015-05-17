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
			for (String filePath : CheckFileAndData.check(dataFile)) {
				loader.loadData(filePath);
			}
		}
	}
}
