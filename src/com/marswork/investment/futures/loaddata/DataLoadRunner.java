package com.marswork.investment.futures.loaddata;

import java.io.File;
import java.util.List;

import com.marswork.core.minitools.object.BasicUtils;

public class DataLoadRunner {

	public static final String dataFile = "F:\\期货相关\\期货数据";

	private static final DataLoader loader = new DataLoader();

	public static void main(String[] args) {
		File targetFile = new File(dataFile);
		doLoadDataFromCsv(targetFile);
	}

	public static void doLoadDataFromCsv(File dataFile) {
		List<String> files = CheckFileAndData.check(dataFile);
		BasicUtils.outList(files);
		for (String filePath : files) {
			loader.loadData(filePath);
		}
	}
}
