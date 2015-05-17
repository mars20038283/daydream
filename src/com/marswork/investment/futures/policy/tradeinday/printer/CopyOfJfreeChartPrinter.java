package com.marswork.investment.futures.policy.tradeinday.printer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.category.DefaultCategoryDataset;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.utils.SqlUtils;

public class CopyOfJfreeChartPrinter {

	private Trade trade;

	private File chartFile;

	private static final String BASEDIR = "D:\\jfreechartmp\\";

	public void doPrint() throws IOException, MarsException {

		DefaultCategoryDataset dateSet = new DefaultCategoryDataset();

		List<Map<String, String>> data = SqlUtils.getDataInDay(
				trade.getGoods(), trade.getDate());

		for (Map<String, String> m : data) {
			dateSet.addValue(Double.parseDouble(m.get("SHOUPAN")), "Date",
					m.get("DATE"));
		}

		JFreeChart chart = ChartFactory.createLineChart(trade.getGoods()
				.getFlag()
				+ " "
				+ BaseDate.formatDateToDays(trade.getDate())
				+ " trand", "Date", "Shoupan", dateSet);

		ChartUtilities.saveChartAsJPEG(chartFile, chart, 1024, 768);
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
		this.chartFile = new File(BASEDIR + trade.getGoods().getFlag() + "\\"
				+ trade.getGoods().getFlag() + "-"
				+ BaseDate.formatDateToDays(trade.getDate()) + ".jpg");

		File chartDir = new File(BASEDIR + trade.getGoods().getFlag());
		if (!chartFile.exists()) {
			chartDir.mkdirs();
		}

		if (!chartFile.exists()) {
			try {
				chartFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
