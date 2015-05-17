package com.marswork.investment.futures.loaddata.macd;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.time.BaseDate;
import com.marswork.investment.futures.context.atomicdata.AtomicData;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;
import com.marswork.investment.futures.utils.SqlUtils;

public class EmaLoader_day {

	private static Goods goods = new Goods("sqru05");

	private static List<Double> list12 = new ArrayList<Double>();

	private static List<Double> list26 = new ArrayList<Double>();

	private static List<Integer> listShoupan = new ArrayList<Integer>();

	private static List<Double> listDea = new ArrayList<Double>();

	private static List<Double> listMacd = new ArrayList<Double>();

	private static List<String> listDate = new ArrayList<String>();

	private static Date startDate;

	private static Date endDate;

	private static Calendar c = Calendar.getInstance();

	static {
		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 4);
		c.set(Calendar.HOUR_OF_DAY, 15);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		startDate = c.getTime();

		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.SECOND, 0);

		endDate = c.getTime();

		try {
			AtomicData data = SqlUtils.getDataInMinite(goods, startDate);
			list12.add(data.getShoupan());
			list26.add(data.getShoupan());
			listShoupan.add((int) (data.getShoupan()));
			listDea.add(0D);
			listMacd.add(0D);
			listDate.add(BaseDate.formatDateToMinites(startDate));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Date tmpDate = DateUtils.getLastMinuteOfDay(DateUtils.addMinute(
					goods, startDate));
			while (tmpDate != null && !tmpDate.after(endDate)) {
				try {
					list12.add(NumberUtils.formatNumber2((list12.get(list12
							.size() - 1) * 11 / 13 + get5MinDate(tmpDate)
							.getShoupan() * 2 / 13)));
					list26.add(NumberUtils.formatNumber2(list26.get(list26
							.size() - 1)
							* 25
							/ 27
							+ get5MinDate(tmpDate).getShoupan() * 2 / 27));
					listShoupan.add(NumberUtils.formatInteger(get5MinDate(
							tmpDate).getShoupan()));
					listDea.add(NumberUtils.formatNumber2(listDea.get(
							listDea.size() - 1).doubleValue()
							* 8
							/ 10
							+ (list12.get(list12.size() - 1) - list26
									.get(list26.size() - 1)) * 2 / 10));
					listMacd.add((list12.get(list12.size() - 1)
							- list26.get(list26.size() - 1) - listDea
							.get(listDea.size() - 1)) * 2);
					listDate.add(BaseDate.formatDateToMinites(tmpDate));

				} catch (Exception e) {
					continue;
				} finally {
					try {
						tmpDate = DateUtils.getLastMinuteOfDay(DateUtils
								.addMinute(goods, tmpDate));
					} catch (Exception e) {
						break;
					}
				}
			}
			printResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static AtomicData get5MinDate(Date date) throws Exception {
		AtomicData data = new AtomicData();
		// data.setGoods(goods);
		// CommonDAO dao = new CommonDAO();
		// String sql =
		// "select max(zuigao) as zuigao,min(zuidi) as zuidi,sum(chengjiao) as chengjiao from sqru05 where date <= '"
		// + BaseDate.formatDateToSeconds(date)
		// + "' order by date desc limit 5";
		// CommonVO vo = dao.doSearch(sql);
		// data.setZuigao(Double.parseDouble(vo.getValue("ZUIGAO", 0)));
		// data.setZuidi(Double.parseDouble(vo.getValue("ZUIDI", 0)));
		// data.setChengjiao(Integer.parseInt(vo.getValue("CHENGJIAO", 0)));
		if (!DateUtils.isLastMiniteBeforeBreak(date)
				&& !DateUtils.isLastMiniteBeforeSecondBreak(date)
				&& !DateUtils.isLastMiniteOfDay(date)
				&& !DateUtils.isLastMiniteOfFirstHalf(date)) {
			date = DateUtils.addMinute(goods, date);
		}
		data.setShoupan(SqlUtils.getDataInMinite(goods, date).getShoupan());
		// data.setKaipan(SqlUtils.getDataInMinite(goods,
		// DateUtils.minusMinute(goods, date, 4)).getShoupan());
		return data;
	}

	private static void printResult() {
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet();
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("时间");
		head.createCell(1).setCellValue("收盘");
		head.createCell(2).setCellValue("ema12");
		head.createCell(3).setCellValue("ema26");
		head.createCell(4).setCellValue("dea");
		head.createCell(5).setCellValue("macd");

		for (int i = 1; i < list12.size(); i++) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(listDate.get(i - 1));
			row.createCell(1).setCellValue(listShoupan.get(i - 1));
			row.createCell(2).setCellValue(list12.get(i - 1));
			row.createCell(3).setCellValue(list26.get(i - 1));
			row.createCell(4).setCellValue(listDea.get(i - 1));
			row.createCell(5).setCellValue(listMacd.get(i - 1));

		}

		try {
			FileOutputStream fileOut = new FileOutputStream("c:/workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
