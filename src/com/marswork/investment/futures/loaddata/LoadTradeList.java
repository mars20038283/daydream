package com.marswork.investment.futures.loaddata;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.crit.TradeRecordCriteria;
import model.pojo.TradeRecord;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.marswork.core.minitools.object.BasicUtils;

public class LoadTradeList {

	public static String FILE_TRADE_LIST = "C:\\workbook--隔日交易--涨幅1.005--开仓1.005--止损1.005--全数据（概况中部分数据有误，隔夜收益有误）.xls";

	public static void main(String[] args) {
		InputStream inp = null;
		try {
			inp = new FileInputStream(FILE_TRADE_LIST);

			Workbook wb = WorkbookFactory.create(inp);
			Sheet sheet = wb.getSheetAt(1);
			TradeRecordCriteria crit = new TradeRecordCriteria();
			int index = 1;
			crit.deleteAll().doExec();
			while (sheet.getRow(index) != null) {
				Row row = sheet.getRow(index);
				TradeRecord tradeRecord = new TradeRecord();
				tradeRecord.setTradeIndex(index);
				tradeRecord.setJiaoyisuo(row.getCell(0).getStringCellValue());
				tradeRecord.setPinzhong(row.getCell(1).getStringCellValue());
				tradeRecord.setBiaozhi(row.getCell(2).getStringCellValue());
				tradeRecord
						.setJiaogeyuefen(getIntegerCellValue(row.getCell(3)));
				tradeRecord.setKaipingcang(row.getCell(4).getStringCellValue());
				tradeRecord.setRineigeye(row.getCell(5).getStringCellValue());
				tradeRecord.setMaimaifangxiang(row.getCell(6)
						.getStringCellValue());
				tradeRecord.setJiaoyiriqi(row.getCell(7).getStringCellValue());
				tradeRecord.setJiaoyishijian(row.getCell(8)
						.getStringCellValue());
				tradeRecord
						.setJiaoyinianfen(getIntegerCellValue(row.getCell(9)));
				tradeRecord
						.setJiaoyijiage(getIntegerCellValue(row.getCell(10)));
				tradeRecord
						.setKaicangjiage(getIntegerCellValue(row.getCell(11)));
				tradeRecord.setJiaoyishuliang(getIntegerCellValue(row
						.getCell(12)));
				tradeRecord.setBaozhengjin(getDoubleCellValue(row.getCell(13)));
				tradeRecord.setPingcangleixing(row.getCell(14)
						.getStringCellValue());
				tradeRecord.setZhangdiefu(getDoubleCellValue(row.getCell(15)));
				tradeRecord.setHuiluozhizuigao(getDoubleCellValue(row
						.getCell(16)));
				tradeRecord.setShouxufei(getDoubleCellValue(row.getCell(17)));
				tradeRecord
						.setJiaoyizonge(getIntegerCellValue(row.getCell(18)));
				tradeRecord.setYingkuidianshu(getDoubleCellValue(row
						.getCell(19)));
				tradeRecord.setJingyingkui(getDoubleCellValue(row.getCell(20)));
				tradeRecord.setShouyilv(getDoubleCellValue(row.getCell(21)));
				tradeRecord.setDangrichengjiao(getIntegerCellValue(row
						.getCell(22)));
				tradeRecord.setM12(getIntegerCellValue(row.getCell(23)));
				tradeRecord.setM32(getIntegerCellValue(row.getCell(24)));
				tradeRecord.setM55(getIntegerCellValue(row.getCell(25)));
				tradeRecord.setM64(getIntegerCellValue(row.getCell(26)));
				tradeRecord.setM89(getIntegerCellValue(row.getCell(27)));
				tradeRecord.setM120(getIntegerCellValue(row.getCell(28)));
				if (row.getCell(29) != null) {
					tradeRecord.setZoushi(row.getCell(29).getStringCellValue());
				}
				tradeRecord.setMam5(getIntegerCellValue(row.getCell(30)));
				tradeRecord.setMam15(getIntegerCellValue(row.getCell(31)));
				tradeRecord.setMam30(getIntegerCellValue(row.getCell(32)));
				tradeRecord
						.setDangrikaipan(getIntegerCellValue(row.getCell(33)));
				tradeRecord.setDangrishoupan(getIntegerCellValue(row
						.getCell(34)));
				tradeRecord.setShangwuzuigao(getIntegerCellValue(row
						.getCell(35)));
				tradeRecord
						.setShangwuzuidi(getIntegerCellValue(row.getCell(36)));
				tradeRecord
						.setXiawuzuigao(getIntegerCellValue(row.getCell(37)));
				tradeRecord.setXiawuzuidi(getIntegerCellValue(row.getCell(38)));
				tradeRecord.setPianlilv12(getDoubleCellValue(row.getCell(39)));
				tradeRecord.setPianlilv32(getDoubleCellValue(row.getCell(40)));
				tradeRecord.setPianlilv55(getDoubleCellValue(row.getCell(41)));
				tradeRecord.setPianlilv64(getDoubleCellValue(row.getCell(42)));
				tradeRecord.setPianlilv89(getDoubleCellValue(row.getCell(43)));
				tradeRecord.setPianlilv120(getDoubleCellValue(row.getCell(44)));
				tradeRecord.setShoupanpingchangjia(getIntegerCellValue(row
						.getCell(45)));
				tradeRecord.setGeyehouyi(getDoubleCellValue(row.getCell(46)));

				crit.save(tradeRecord);
				index++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inp != null) {
				try {
					inp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static Integer getIntegerCellValue(Cell cell) {
		if (cell == null) {
			return null;
		}
		return (int) cell.getNumericCellValue();
	}

	private static Double getDoubleCellValue(Cell cell) {
		if (cell == null) {
			return null;
		}
		return cell.getNumericCellValue();
	}
}
