package com.marswork.investment.futures.tradeswitcher;

import java.io.FileOutputStream;
import java.util.List;

import model.pojo.TradeRecord;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.minitools.object.BasicUtils;

public class PickedListSheetCreator {

	public static void createTradeListSheet(Workbook wb,
			List<TradeRecord> tradeRecoreds) throws MarsException {
		BasicUtils.out(tradeRecoreds.size());
		Sheet sheet = wb.createSheet("去重交易");
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("交易所");
		head.createCell(1).setCellValue("品种");
		head.createCell(2).setCellValue("标识");
		head.createCell(3).setCellValue("交割月份");
		head.createCell(4).setCellValue("开/平仓");
		head.createCell(5).setCellValue("日内/隔夜");
		head.createCell(6).setCellValue("买卖方向");
		head.createCell(7).setCellValue("交易日期");
		head.createCell(8).setCellValue("交易时间");
		head.createCell(9).setCellValue("交易年份");
		head.createCell(10).setCellValue("交易价格");
		head.createCell(11).setCellValue("开仓价格");
		head.createCell(12).setCellValue("交易数量");
		head.createCell(13).setCellValue("保证金");
		head.createCell(14).setCellValue("平仓类型");
		head.createCell(15).setCellValue("涨跌幅");
		head.createCell(16).setCellValue("回落至最值");
		head.createCell(17).setCellValue("手续费");
		head.createCell(18).setCellValue("交易总额");
		head.createCell(19).setCellValue("盈亏点数");
		head.createCell(20).setCellValue("净盈亏");
		head.createCell(21).setCellValue("收益率");
		head.createCell(22).setCellValue("当日成交量");
		head.createCell(23).setCellValue("MA12");
		head.createCell(24).setCellValue("MA32");
		head.createCell(25).setCellValue("MA55");
		head.createCell(26).setCellValue("MA64");
		head.createCell(27).setCellValue("MA89");
		head.createCell(28).setCellValue("MA120");
		head.createCell(29).setCellValue("走势");
		head.createCell(30).setCellValue("MAM5");
		head.createCell(31).setCellValue("MAM15");
		head.createCell(32).setCellValue("MAM30");
		head.createCell(33).setCellValue("当日开盘");
		head.createCell(34).setCellValue("当日收盘");
		head.createCell(35).setCellValue("上午最高");
		head.createCell(36).setCellValue("上午最低");
		head.createCell(37).setCellValue("下午最高");
		head.createCell(38).setCellValue("下午最低");
		head.createCell(39).setCellValue("偏离率12");
		head.createCell(40).setCellValue("偏离率32");
		head.createCell(41).setCellValue("偏离率55");
		head.createCell(42).setCellValue("偏离率64");
		head.createCell(43).setCellValue("偏离率89");
		head.createCell(44).setCellValue("偏离率120");
		head.createCell(45).setCellValue("收盘平仓价");
		head.createCell(46).setCellValue("隔夜收益");

		int index = 1;
		for (TradeRecord trade : tradeRecoreds) {
			Row data = sheet.createRow(index * 2 - 1);
			inputRow(data, trade);
			data = sheet.createRow(index * 2);
			inputRow(data, trade.getCloseTrade());
			index++;
		}

		try {
			FileOutputStream fileOut = new FileOutputStream("c:/workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void inputRow(Row head, TradeRecord trade) {
		head.createCell(0).setCellValue(trade.getJiaoyisuo());
		head.createCell(1).setCellValue(trade.getPinzhong());
		head.createCell(2).setCellValue(trade.getBiaozhi());
		head.createCell(3).setCellValue(trade.getJiaogeyuefen());
		head.createCell(4).setCellValue(trade.getKaipingcang());
		head.createCell(5).setCellValue(trade.getRineigeye());
		head.createCell(6).setCellValue(trade.getMaimaifangxiang());
		head.createCell(7).setCellValue(trade.getJiaoyiriqi());
		head.createCell(8).setCellValue(trade.getJiaoyishijian());
		head.createCell(9).setCellValue(trade.getJiaoyinianfen());
		head.createCell(10).setCellValue(trade.getJiaoyijiage());
		head.createCell(11).setCellValue(trade.getKaicangjiage());
		head.createCell(12).setCellValue(trade.getJiaoyishuliang());
		head.createCell(13).setCellValue(trade.getBaozhengjin());
		head.createCell(14).setCellValue(trade.getPingcangleixing());
		head.createCell(15).setCellValue(trade.getZhangdiefu());
		head.createCell(16).setCellValue(trade.getHuiluozhizuigao());
		head.createCell(17).setCellValue(trade.getShouxufei());
		head.createCell(18).setCellValue(trade.getJiaoyizonge());
		head.createCell(19).setCellValue(trade.getYingkuidianshu());
		head.createCell(20).setCellValue(trade.getJingyingkui());
		head.createCell(21).setCellValue(trade.getShouyilv());
		head.createCell(22).setCellValue(trade.getDangrichengjiao());
		head.createCell(23).setCellValue(trade.getM12());
		head.createCell(24).setCellValue(trade.getM32());
		head.createCell(25).setCellValue(trade.getM55());
		head.createCell(26).setCellValue(trade.getM64());
		head.createCell(27).setCellValue(trade.getM89());
		head.createCell(28).setCellValue(trade.getM120());
		head.createCell(29).setCellValue(trade.getZoushi());
		head.createCell(30).setCellValue(trade.getMam5());
		head.createCell(31).setCellValue(trade.getMam15());
		head.createCell(32).setCellValue(trade.getMam30());
		head.createCell(33).setCellValue(trade.getDangrikaipan());
		head.createCell(34).setCellValue(trade.getDangrishoupan());
		head.createCell(35).setCellValue(trade.getShangwuzuigao());
		head.createCell(36).setCellValue(trade.getShangwuzuidi());
		head.createCell(37).setCellValue(trade.getXiawuzuigao());
		head.createCell(38).setCellValue(trade.getXiawuzuidi());
		head.createCell(39).setCellValue(trade.getPianlilv12());
		head.createCell(40).setCellValue(trade.getPianlilv32());
		head.createCell(41).setCellValue(trade.getPianlilv55());
		head.createCell(42).setCellValue(trade.getPianlilv64());
		head.createCell(43).setCellValue(trade.getPianlilv89());
		head.createCell(44).setCellValue(trade.getPianlilv120());
		head.createCell(45).setCellValue(trade.getShoupanpingchangjia());
		head.createCell(46).setCellValue(trade.getGeyehouyi());

	}
}
