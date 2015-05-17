package com.marswork.investment.futures.policy.tradeinday.printer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.utils.SqlUtils;

public class Copy_3_of_JfreeChartPrinter {

	private Trade trade;

	private File chartFile;

	private static final String BASEDIR = "D:\\jfreechartmp\\";

	public void doPrint() throws IOException, MarsException {

		JFreeChart chart = createChart(createDataset());
		ChartUtilities.saveChartAsJPEG(chartFile, chart, 1024, 768);
	}

	private IntervalXYDataset createDataset() {
		TimeSeries shoupanSeries = new TimeSeries("Budget", "Year", "$ Million");
		TimeSeries yesterdaySeries = new TimeSeries("Budget", "Year",
				"$ Million");
		TimeSeries tomorrowSeries = new TimeSeries("Budget", "Year",
				"$ Million");
		try {
			Date yesterday = TradeDate.getLastTradeDate(trade.getDate());
			Date tomorrow = TradeDate.getNextTradeDate(trade.getDate());
			List<Map<String, String>> data = SqlUtils.getDataInDay(
					trade.getGoods(), trade.getDate());
			List<Map<String, String>> data2 = SqlUtils.getDataInDay(
					trade.getGoods(), yesterday);
			List<Map<String, String>> data3 = SqlUtils.getDataInDay(
					trade.getGoods(), tomorrow);

			Calendar c = Calendar.getInstance();
			
			for(int i=0;i<data.size();i++){
				Map<String, String> m = data.get(i);
				Map<String, String> m2 = data2.get(i);
				Map<String, String> m3 = data3.get(i);
				shoupanSeries.add(
						new Minute(c.get(Calendar.MINUTE), new Hour(c
								.get(Calendar.HOUR_OF_DAY), new Day(c
								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
								c.get(Calendar.YEAR)))), Double.parseDouble(m
								.get("SHOUPAN")));
				yesterdaySeries.add(
						new Minute(c.get(Calendar.MINUTE), new Hour(c
								.get(Calendar.HOUR_OF_DAY), new Day(c
								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
								c.get(Calendar.YEAR)))), Double.parseDouble(m2
								.get("SHOUPAN")));
				tomorrowSeries.add(
						new Minute(c.get(Calendar.MINUTE), new Hour(c
								.get(Calendar.HOUR_OF_DAY), new Day(c
								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
								c.get(Calendar.YEAR)))), Double.parseDouble(m3
								.get("SHOUPAN")));
			}
			
//			for (Map<String, String> m : data) {
//				Date date = BaseDate.parseDate(m.get("DATE"));
//				c.setTime(date);
//				shoupanSeries.add(
//						new Minute(c.get(Calendar.MINUTE), new Hour(c
//								.get(Calendar.HOUR_OF_DAY), new Day(c
//								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
//								c.get(Calendar.YEAR)))), Double.parseDouble(m
//								.get("SHOUPAN")));
//			}
//			for (Map<String, String> m : data2) {
//				Date date = BaseDate.parseDate(m.get("DATE"));
//				c.setTime(date);
//				yesterdaySeries.add(
//						new Minute(c.get(Calendar.MINUTE), new Hour(c
//								.get(Calendar.HOUR_OF_DAY), new Day(c
//								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
//								c.get(Calendar.YEAR)))), Double.parseDouble(m
//								.get("SHOUPAN")));
//			}
//			for (Map<String, String> m : data3) {
//				Date date = BaseDate.parseDate(m.get("DATE"));
//				c.setTime(date);
//				tomorrowSeries.add(
//						new Minute(c.get(Calendar.MINUTE), new Hour(c
//								.get(Calendar.HOUR_OF_DAY), new Day(c
//								.get(Calendar.DATE), c.get(Calendar.MONTH) + 1,
//								c.get(Calendar.YEAR)))), Double.parseDouble(m
//								.get("SHOUPAN")));
//			}
		} catch (Exception localException) {
			System.err.println(localException.getMessage());
		}
		TimeSeriesCollection localTimeSeriesCollection = new TimeSeriesCollection();
		localTimeSeriesCollection.addSeries(shoupanSeries);
		localTimeSeriesCollection.addSeries(yesterdaySeries);
		localTimeSeriesCollection.addSeries(tomorrowSeries);
		return localTimeSeriesCollection;
	}

	private JFreeChart createChart(XYDataset paramXYDataset) {
		JFreeChart localJFreeChart = ChartFactory
				.createTimeSeriesChart(
						trade.getGoods().getFlag() + " "
								+ BaseDate.formatDateToDays(trade.getDate())
								+ " trend", "Date", "ShouPan", paramXYDataset,
						true, true, false);
		XYPlot localXYPlot = (XYPlot) localJFreeChart.getPlot();
		localXYPlot.setDomainPannable(true);
		localXYPlot.setRangePannable(false);
		localXYPlot.setDomainCrosshairVisible(true);
		localXYPlot.setRangeCrosshairVisible(true);
		XYItemRenderer localXYItemRenderer = localXYPlot.getRenderer();
		if ((localXYItemRenderer instanceof XYLineAndShapeRenderer)) {
			XYLineAndShapeRenderer localObject = (XYLineAndShapeRenderer) localXYItemRenderer;
			((XYLineAndShapeRenderer) localObject).setBaseShapesVisible(false);
		}
		DateAxis localObject = (DateAxis) localXYPlot.getDomainAxis();
		localObject.setDateFormatOverride(new SimpleDateFormat("HH:mm"));
		return (JFreeChart) localJFreeChart;
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
