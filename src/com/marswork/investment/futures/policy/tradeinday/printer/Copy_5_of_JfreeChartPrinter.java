package com.marswork.investment.futures.policy.tradeinday.printer;

import java.awt.Color;
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
import org.jfree.chart.axis.ValueAxis;
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
import com.marswork.core.exceptions.object.datetime.NotDateTimeException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.trade.Trade;
import com.marswork.investment.futures.exceptions.DateOutOfRangeException;
import com.marswork.investment.futures.indicator.IndicatorsManager;
import com.marswork.investment.futures.indicator.tradedate.TradeDate;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class Copy_5_of_JfreeChartPrinter {

	private Trade trade;

	private File chartFile;

	private static final String BASEDIR = "D:\\jfreechartmp\\";

	public void doPrint() throws IOException, MarsException {

		JFreeChart chart = createChart(createDataset());
		ChartUtilities.saveChartAsJPEG(chartFile, chart, 1024, 768);
	}

	private IntervalXYDataset createDataset() throws NotDateTimeException,
			DateOutOfRangeException {
		Date yesterday = TradeDate.getLastTradeDate(trade.getDate());
		Date tomorrow = TradeDate.getNextTradeDate(trade.getDate());

		TimeSeries todaySeries = new TimeSeries(BaseDate.formatDateToDays(trade
				.getDate()), "Year", "$ Million");
		TimeSeries yesterdaySeries = new TimeSeries(
				BaseDate.formatDateToDays(yesterday), "Year", "$ Million");
		TimeSeries tomorrowSeries = new TimeSeries(
				BaseDate.formatDateToDays(tomorrow), "Year", "$ Million");
		try {
			List<Map<String, String>> data = SqlUtils.getDataInDay(
					trade.getGoods(), trade.getDate());
			List<Map<String, String>> data2 = SqlUtils.getDataInDay(
					trade.getGoods(), yesterday);
			List<Map<String, String>> data3 = SqlUtils.getDataInDay(
					trade.getGoods(), tomorrow);

			Calendar c = Calendar.getInstance();
			for (int i = 0; i < data.size(); i++) {
				Map<String, String> m = data.get(i);
				Map<String, String> m2 = data2.get(i);
				Map<String, String> m3 = data3.get(i);
				Date date = BaseDate.parseDate(m.get("DATE"));
				c.setTime(date);
				todaySeries.add(
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
		} catch (Exception localException) {
			System.err.println(localException.getMessage());
		}
		TimeSeriesCollection localTimeSeriesCollection = new TimeSeriesCollection();
		localTimeSeriesCollection.addSeries(todaySeries);
		localTimeSeriesCollection.addSeries(yesterdaySeries);
		localTimeSeriesCollection.addSeries(tomorrowSeries);
		return localTimeSeriesCollection;
	}

	private JFreeChart createChart(XYDataset paramXYDataset)
			throws NotDateTimeException, DateOutOfRangeException, MarsException {
		JFreeChart localJFreeChart = ChartFactory
				.createTimeSeriesChart(
						trade.getGoods().getFlag() + " "
								+ BaseDate.formatDateToDays(trade.getDate())
								+ " trend", "Date", "ShouPan", paramXYDataset,
						true, true, false);
		XYPlot localXYPlot = (XYPlot) localJFreeChart.getPlot();
		localXYPlot.setDomainPannable(true);
		localXYPlot.setRangePannable(true);
		localXYPlot.setDomainCrosshairVisible(true);
		localXYPlot.setRangeCrosshairVisible(true);
		XYItemRenderer localXYItemRenderer = localXYPlot.getRenderer();
		if ((localXYItemRenderer instanceof XYLineAndShapeRenderer)) {
			XYLineAndShapeRenderer localObject = (XYLineAndShapeRenderer) localXYItemRenderer;
			((XYLineAndShapeRenderer) localObject).setBaseShapesVisible(false);
		}
		DateAxis localObject = (DateAxis) localXYPlot.getDomainAxis();
		localObject.setDateFormatOverride(new SimpleDateFormat("HH:mm"));

		ValueAxis valueaxis = localXYPlot.getRangeAxis();
		valueaxis.setRange(IndicatorsManager.getDateRangeLow(trade.getGoods(),
				TradeDate.getLastTradeDate(trade.getDate()), DateUtils
						.getLastMinuteOfDay(TradeDate.getNextTradeDate(trade
								.getDate()))), IndicatorsManager
				.getDateRangeHigh(trade.getGoods(), TradeDate
						.getLastTradeDate(trade.getDate()), DateUtils
						.getLastMinuteOfDay(TradeDate.getNextTradeDate(trade
								.getDate()))));
		valueaxis.setAutoRange(false);

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

	public double bofeng(double d1, double d2, double d3) {
		if (d1 > d2) {
			if (d1 > d3) {
				return d1;
			} else {
				return d3;
			}
		} else {
			if (d2 > d3) {
				return d2;
			} else {
				return d3;
			}
		}
	}

	public double bogu(double d1, double d2, double d3) {
		if (d1 < d2) {
			if (d1 < d3) {
				return d1;
			} else {
				return d3;
			}
		} else {
			if (d2 < d3) {
				return d2;
			} else {
				return d3;
			}
		}
	}
}
