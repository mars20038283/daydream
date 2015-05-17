package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.TradeRecord;

public class TradeRecordCriteria extends SqlCriteria<TradeRecord> {

	public static final String TABLE_NAME  = "trade_record";

	public TradeRecordCriteria() {
		super(TradeRecord.class);
	}

	public TradeRecordCriteria(DriverInfo driverInfo) {
		super(driverInfo, TradeRecord.class);
	}

	public void save(TradeRecord tradeRecord) throws MarsException {
		super.save(tradeRecord);
	}

	public void update(TradeRecord tradeRecord) throws MarsException {
		super.update(tradeRecord);
	}

	public void delete(TradeRecord tradeRecord) throws MarsException {
		super.delete(tradeRecord);
	}

	public static final String trade_id = "trade_id";

	public TradeRecordCriteria findByTradeId(String tradeId) {
		this.findByPropertyEq(TradeRecordCriteria.trade_id, TABLE_NAME, tradeId);
		return this;
	}

	public static final String trade_index = "trade_index";

	public TradeRecordCriteria findByTradeIndex(Integer tradeIndex) {
		this.findByPropertyEq(TradeRecordCriteria.trade_index, TABLE_NAME, tradeIndex);
		return this;
	}

	public static final String jiaoyisuo = "jiaoyisuo";

	public TradeRecordCriteria findByJiaoyisuo(String jiaoyisuo) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyisuo, TABLE_NAME, jiaoyisuo);
		return this;
	}

	public static final String pinzhong = "pinzhong";

	public TradeRecordCriteria findByPinzhong(String pinzhong) {
		this.findByPropertyEq(TradeRecordCriteria.pinzhong, TABLE_NAME, pinzhong);
		return this;
	}

	public static final String biaozhi = "biaozhi";

	public TradeRecordCriteria findByBiaozhi(String biaozhi) {
		this.findByPropertyEq(TradeRecordCriteria.biaozhi, TABLE_NAME, biaozhi);
		return this;
	}

	public static final String jiaogeyuefen = "jiaogeyuefen";

	public TradeRecordCriteria findByJiaogeyuefen(Integer jiaogeyuefen) {
		this.findByPropertyEq(TradeRecordCriteria.jiaogeyuefen, TABLE_NAME, jiaogeyuefen);
		return this;
	}

	public static final String kaipingcang = "kaipingcang";

	public TradeRecordCriteria findByKaipingcang(String kaipingcang) {
		this.findByPropertyEq(TradeRecordCriteria.kaipingcang, TABLE_NAME, kaipingcang);
		return this;
	}

	public static final String rineigeye = "rineigeye";

	public TradeRecordCriteria findByRineigeye(String rineigeye) {
		this.findByPropertyEq(TradeRecordCriteria.rineigeye, TABLE_NAME, rineigeye);
		return this;
	}

	public static final String maimaifangxiang = "maimaifangxiang";

	public TradeRecordCriteria findByMaimaifangxiang(String maimaifangxiang) {
		this.findByPropertyEq(TradeRecordCriteria.maimaifangxiang, TABLE_NAME, maimaifangxiang);
		return this;
	}

	public static final String jiaoyiriqi = "jiaoyiriqi";

	public TradeRecordCriteria findByJiaoyiriqi(String jiaoyiriqi) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyiriqi, TABLE_NAME, jiaoyiriqi);
		return this;
	}

	public static final String jiaoyishijian = "jiaoyishijian";

	public TradeRecordCriteria findByJiaoyishijian(String jiaoyishijian) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyishijian, TABLE_NAME, jiaoyishijian);
		return this;
	}

	public static final String jiaoyinianfen = "jiaoyinianfen";

	public TradeRecordCriteria findByJiaoyinianfen(Integer jiaoyinianfen) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyinianfen, TABLE_NAME, jiaoyinianfen);
		return this;
	}

	public static final String jiaoyijiage = "jiaoyijiage";

	public TradeRecordCriteria findByJiaoyijiage(Integer jiaoyijiage) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyijiage, TABLE_NAME, jiaoyijiage);
		return this;
	}

	public static final String kaicangjiage = "kaicangjiage";

	public TradeRecordCriteria findByKaicangjiage(Integer kaicangjiage) {
		this.findByPropertyEq(TradeRecordCriteria.kaicangjiage, TABLE_NAME, kaicangjiage);
		return this;
	}

	public static final String jiaoyishuliang = "jiaoyishuliang";

	public TradeRecordCriteria findByJiaoyishuliang(Integer jiaoyishuliang) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyishuliang, TABLE_NAME, jiaoyishuliang);
		return this;
	}

	public static final String baozhengjin = "baozhengjin";

	public TradeRecordCriteria findByBaozhengjin(Double baozhengjin) {
		this.findByPropertyEq(TradeRecordCriteria.baozhengjin, TABLE_NAME, baozhengjin);
		return this;
	}

	public static final String pingcangleixing = "pingcangleixing";

	public TradeRecordCriteria findByPingcangleixing(String pingcangleixing) {
		this.findByPropertyEq(TradeRecordCriteria.pingcangleixing, TABLE_NAME, pingcangleixing);
		return this;
	}

	public static final String zhangdiefu = "zhangdiefu";

	public TradeRecordCriteria findByZhangdiefu(Double zhangdiefu) {
		this.findByPropertyEq(TradeRecordCriteria.zhangdiefu, TABLE_NAME, zhangdiefu);
		return this;
	}

	public static final String huiluozhizuigao = "huiluozhizuigao";

	public TradeRecordCriteria findByHuiluozhizuigao(Double huiluozhizuigao) {
		this.findByPropertyEq(TradeRecordCriteria.huiluozhizuigao, TABLE_NAME, huiluozhizuigao);
		return this;
	}

	public static final String shouxufei = "shouxufei";

	public TradeRecordCriteria findByShouxufei(Double shouxufei) {
		this.findByPropertyEq(TradeRecordCriteria.shouxufei, TABLE_NAME, shouxufei);
		return this;
	}

	public static final String jiaoyizonge = "jiaoyizonge";

	public TradeRecordCriteria findByJiaoyizonge(Integer jiaoyizonge) {
		this.findByPropertyEq(TradeRecordCriteria.jiaoyizonge, TABLE_NAME, jiaoyizonge);
		return this;
	}

	public static final String yingkuidianshu = "yingkuidianshu";

	public TradeRecordCriteria findByYingkuidianshu(Double yingkuidianshu) {
		this.findByPropertyEq(TradeRecordCriteria.yingkuidianshu, TABLE_NAME, yingkuidianshu);
		return this;
	}

	public static final String jingyingkui = "jingyingkui";

	public TradeRecordCriteria findByJingyingkui(Double jingyingkui) {
		this.findByPropertyEq(TradeRecordCriteria.jingyingkui, TABLE_NAME, jingyingkui);
		return this;
	}

	public static final String shouyilv = "shouyilv";

	public TradeRecordCriteria findByShouyilv(Double shouyilv) {
		this.findByPropertyEq(TradeRecordCriteria.shouyilv, TABLE_NAME, shouyilv);
		return this;
	}

	public static final String dangrichengjiao = "dangrichengjiao";

	public TradeRecordCriteria findByDangrichengjiao(Integer dangrichengjiao) {
		this.findByPropertyEq(TradeRecordCriteria.dangrichengjiao, TABLE_NAME, dangrichengjiao);
		return this;
	}

	public static final String m12 = "m12";

	public TradeRecordCriteria findByM12(Integer m12) {
		this.findByPropertyEq(TradeRecordCriteria.m12, TABLE_NAME, m12);
		return this;
	}

	public static final String m32 = "m32";

	public TradeRecordCriteria findByM32(Integer m32) {
		this.findByPropertyEq(TradeRecordCriteria.m32, TABLE_NAME, m32);
		return this;
	}

	public static final String m55 = "m55";

	public TradeRecordCriteria findByM55(Integer m55) {
		this.findByPropertyEq(TradeRecordCriteria.m55, TABLE_NAME, m55);
		return this;
	}

	public static final String m64 = "m64";

	public TradeRecordCriteria findByM64(Integer m64) {
		this.findByPropertyEq(TradeRecordCriteria.m64, TABLE_NAME, m64);
		return this;
	}

	public static final String m89 = "m89";

	public TradeRecordCriteria findByM89(Integer m89) {
		this.findByPropertyEq(TradeRecordCriteria.m89, TABLE_NAME, m89);
		return this;
	}

	public static final String m120 = "m120";

	public TradeRecordCriteria findByM120(Integer m120) {
		this.findByPropertyEq(TradeRecordCriteria.m120, TABLE_NAME, m120);
		return this;
	}

	public static final String zoushi = "zoushi";

	public TradeRecordCriteria findByZoushi(String zoushi) {
		this.findByPropertyEq(TradeRecordCriteria.zoushi, TABLE_NAME, zoushi);
		return this;
	}

	public static final String mam5 = "mam5";

	public TradeRecordCriteria findByMam5(Integer mam5) {
		this.findByPropertyEq(TradeRecordCriteria.mam5, TABLE_NAME, mam5);
		return this;
	}

	public static final String mam15 = "mam15";

	public TradeRecordCriteria findByMam15(Integer mam15) {
		this.findByPropertyEq(TradeRecordCriteria.mam15, TABLE_NAME, mam15);
		return this;
	}

	public static final String mam30 = "mam30";

	public TradeRecordCriteria findByMam30(Integer mam30) {
		this.findByPropertyEq(TradeRecordCriteria.mam30, TABLE_NAME, mam30);
		return this;
	}

	public static final String dangrikaipan = "dangrikaipan";

	public TradeRecordCriteria findByDangrikaipan(Integer dangrikaipan) {
		this.findByPropertyEq(TradeRecordCriteria.dangrikaipan, TABLE_NAME, dangrikaipan);
		return this;
	}

	public static final String dangrishoupan = "dangrishoupan";

	public TradeRecordCriteria findByDangrishoupan(Integer dangrishoupan) {
		this.findByPropertyEq(TradeRecordCriteria.dangrishoupan, TABLE_NAME, dangrishoupan);
		return this;
	}

	public static final String shangwuzuigao = "shangwuzuigao";

	public TradeRecordCriteria findByShangwuzuigao(Integer shangwuzuigao) {
		this.findByPropertyEq(TradeRecordCriteria.shangwuzuigao, TABLE_NAME, shangwuzuigao);
		return this;
	}

	public static final String shangwuzuidi = "shangwuzuidi";

	public TradeRecordCriteria findByShangwuzuidi(Integer shangwuzuidi) {
		this.findByPropertyEq(TradeRecordCriteria.shangwuzuidi, TABLE_NAME, shangwuzuidi);
		return this;
	}

	public static final String xiawuzuigao = "xiawuzuigao";

	public TradeRecordCriteria findByXiawuzuigao(Integer xiawuzuigao) {
		this.findByPropertyEq(TradeRecordCriteria.xiawuzuigao, TABLE_NAME, xiawuzuigao);
		return this;
	}

	public static final String xiawuzuidi = "xiawuzuidi";

	public TradeRecordCriteria findByXiawuzuidi(Integer xiawuzuidi) {
		this.findByPropertyEq(TradeRecordCriteria.xiawuzuidi, TABLE_NAME, xiawuzuidi);
		return this;
	}

	public static final String pianlilv12 = "pianlilv12";

	public TradeRecordCriteria findByPianlilv12(Double pianlilv12) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv12, TABLE_NAME, pianlilv12);
		return this;
	}

	public static final String pianlilv32 = "pianlilv32";

	public TradeRecordCriteria findByPianlilv32(Double pianlilv32) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv32, TABLE_NAME, pianlilv32);
		return this;
	}

	public static final String pianlilv55 = "pianlilv55";

	public TradeRecordCriteria findByPianlilv55(Double pianlilv55) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv55, TABLE_NAME, pianlilv55);
		return this;
	}

	public static final String pianlilv64 = "pianlilv64";

	public TradeRecordCriteria findByPianlilv64(Double pianlilv64) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv64, TABLE_NAME, pianlilv64);
		return this;
	}

	public static final String pianlilv89 = "pianlilv89";

	public TradeRecordCriteria findByPianlilv89(Double pianlilv89) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv89, TABLE_NAME, pianlilv89);
		return this;
	}

	public static final String pianlilv120 = "pianlilv120";

	public TradeRecordCriteria findByPianlilv120(Double pianlilv120) {
		this.findByPropertyEq(TradeRecordCriteria.pianlilv120, TABLE_NAME, pianlilv120);
		return this;
	}

	public static final String shoupanpingchangjia = "shoupanpingchangjia";

	public TradeRecordCriteria findByShoupanpingchangjia(Integer shoupanpingchangjia) {
		this.findByPropertyEq(TradeRecordCriteria.shoupanpingchangjia, TABLE_NAME, shoupanpingchangjia);
		return this;
	}

	public static final String geyehouyi = "geyehouyi";

	public TradeRecordCriteria findByGeyehouyi(Double geyehouyi) {
		this.findByPropertyEq(TradeRecordCriteria.geyehouyi, TABLE_NAME, geyehouyi);
		return this;
	}

	public TradeRecordCriteria findByPkId(String tradeId) {
		this.findByPropertyEq("trade_id", tradeId);
		return this;
	}


}