package model.pojo;

import model.crit.TradeRecordCriteria;

import com.marswork.core.common.data.MarsBean;
import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.core.exceptions.object.list.NoSuchObjectException;
import com.marswork.core.exceptions.object.list.TooManyObjectException;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.core.minitools.object.UUIDGenerator;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.beansupport.annotation.AliasMapping;
import com.marswork.dataaccess.beansupport.annotation.PrimaryKey;

@AliasMapping("trade_record")
public class TradeRecord extends MarsBean {

	private static final long serialVersionUID = 1L;

	private String tradeId;

	private Integer tradeIndex;

	private String jiaoyisuo;

	private String pinzhong;

	private String biaozhi;

	private Integer jiaogeyuefen;

	private String kaipingcang;

	private String rineigeye;

	private String maimaifangxiang;

	private String jiaoyiriqi;

	private String jiaoyishijian;

	private Integer jiaoyinianfen;

	private Integer jiaoyijiage;

	private Integer kaicangjiage;

	private Integer jiaoyishuliang;

	private Double baozhengjin;

	private String pingcangleixing;

	private Double zhangdiefu;

	private Double huiluozhizuigao;

	private Double shouxufei;

	private Integer jiaoyizonge;

	private Double yingkuidianshu;

	private Double jingyingkui;

	private Double shouyilv;

	private Integer dangrichengjiao;

	private Integer m12;

	private Integer m32;

	private Integer m55;

	private Integer m64;

	private Integer m89;

	private Integer m120;

	private String zoushi;

	private Integer mam5;

	private Integer mam15;

	private Integer mam30;

	private Integer dangrikaipan;

	private Integer dangrishoupan;

	private Integer shangwuzuigao;

	private Integer shangwuzuidi;

	private Integer xiawuzuigao;

	private Integer xiawuzuidi;

	private Double pianlilv12;

	private Double pianlilv32;

	private Double pianlilv55;

	private Double pianlilv64;

	private Double pianlilv89;

	private Double pianlilv120;

	private Integer shoupanpingchangjia;

	private Double geyehouyi;

	public String getTradeId() {
		return tradeId;
	}

	@PrimaryKey
	@AliasMapping("trade_id")
	public void setTradeId(String tradeId) {
		if (BasicUtils.isTrimBlank(this.tradeId)) {
			this.tradeId = tradeId;
		}
	}

	public String findPkValue() {
		return tradeId;
	}

	public void evaluatePkValue(String pkId) {
		setTradeId(pkId);
	}

	public Integer getTradeIndex() {
		return tradeIndex;
	}

	@AliasMapping("trade_index")
	public void setTradeIndex(Integer tradeIndex) {
		if (!compareObj(this.tradeIndex, tradeIndex)) {
			this.tradeIndex = tradeIndex;
			modified = true;
		}
	}

	public String getJiaoyisuo() {
		return jiaoyisuo;
	}

	@AliasMapping("jiaoyisuo")
	public void setJiaoyisuo(String jiaoyisuo) {
		if (!compareObj(this.jiaoyisuo, jiaoyisuo)) {
			this.jiaoyisuo = jiaoyisuo;
			modified = true;
		}
	}

	public String getPinzhong() {
		return pinzhong;
	}

	@AliasMapping("pinzhong")
	public void setPinzhong(String pinzhong) {
		if (!compareObj(this.pinzhong, pinzhong)) {
			this.pinzhong = pinzhong;
			modified = true;
		}
	}

	public String getBiaozhi() {
		return biaozhi;
	}

	@AliasMapping("biaozhi")
	public void setBiaozhi(String biaozhi) {
		if (!compareObj(this.biaozhi, biaozhi)) {
			this.biaozhi = biaozhi;
			modified = true;
		}
	}

	public Integer getJiaogeyuefen() {
		return jiaogeyuefen;
	}

	@AliasMapping("jiaogeyuefen")
	public void setJiaogeyuefen(Integer jiaogeyuefen) {
		if (!compareObj(this.jiaogeyuefen, jiaogeyuefen)) {
			this.jiaogeyuefen = jiaogeyuefen;
			modified = true;
		}
	}

	public String getKaipingcang() {
		return kaipingcang;
	}

	@AliasMapping("kaipingcang")
	public void setKaipingcang(String kaipingcang) {
		if (!compareObj(this.kaipingcang, kaipingcang)) {
			this.kaipingcang = kaipingcang;
			modified = true;
		}
	}

	public String getRineigeye() {
		return rineigeye;
	}

	@AliasMapping("rineigeye")
	public void setRineigeye(String rineigeye) {
		if (!compareObj(this.rineigeye, rineigeye)) {
			this.rineigeye = rineigeye;
			modified = true;
		}
	}

	public String getMaimaifangxiang() {
		return maimaifangxiang;
	}

	@AliasMapping("maimaifangxiang")
	public void setMaimaifangxiang(String maimaifangxiang) {
		if (!compareObj(this.maimaifangxiang, maimaifangxiang)) {
			this.maimaifangxiang = maimaifangxiang;
			modified = true;
		}
	}

	public String getJiaoyiriqi() {
		return jiaoyiriqi;
	}

	@AliasMapping("jiaoyiriqi")
	public void setJiaoyiriqi(String jiaoyiriqi) {
		if (!compareObj(this.jiaoyiriqi, jiaoyiriqi)) {
			this.jiaoyiriqi = jiaoyiriqi;
			modified = true;
		}
	}

	public String getJiaoyishijian() {
		return jiaoyishijian;
	}

	@AliasMapping("jiaoyishijian")
	public void setJiaoyishijian(String jiaoyishijian) {
		if (!compareObj(this.jiaoyishijian, jiaoyishijian)) {
			this.jiaoyishijian = jiaoyishijian;
			modified = true;
		}
	}

	public Integer getJiaoyinianfen() {
		return jiaoyinianfen;
	}

	@AliasMapping("jiaoyinianfen")
	public void setJiaoyinianfen(Integer jiaoyinianfen) {
		if (!compareObj(this.jiaoyinianfen, jiaoyinianfen)) {
			this.jiaoyinianfen = jiaoyinianfen;
			modified = true;
		}
	}

	public Integer getJiaoyijiage() {
		return jiaoyijiage;
	}

	@AliasMapping("jiaoyijiage")
	public void setJiaoyijiage(Integer jiaoyijiage) {
		if (!compareObj(this.jiaoyijiage, jiaoyijiage)) {
			this.jiaoyijiage = jiaoyijiage;
			modified = true;
		}
	}

	public Integer getKaicangjiage() {
		return kaicangjiage;
	}

	@AliasMapping("kaicangjiage")
	public void setKaicangjiage(Integer kaicangjiage) {
		if (!compareObj(this.kaicangjiage, kaicangjiage)) {
			this.kaicangjiage = kaicangjiage;
			modified = true;
		}
	}

	public Integer getJiaoyishuliang() {
		return jiaoyishuliang;
	}

	@AliasMapping("jiaoyishuliang")
	public void setJiaoyishuliang(Integer jiaoyishuliang) {
		if (!compareObj(this.jiaoyishuliang, jiaoyishuliang)) {
			this.jiaoyishuliang = jiaoyishuliang;
			modified = true;
		}
	}

	public Double getBaozhengjin() {
		return baozhengjin;
	}

	@AliasMapping("baozhengjin")
	public void setBaozhengjin(Double baozhengjin) {
		if (!compareObj(this.baozhengjin, baozhengjin)) {
			this.baozhengjin = baozhengjin;
			modified = true;
		}
	}

	public String getPingcangleixing() {
		return pingcangleixing;
	}

	@AliasMapping("pingcangleixing")
	public void setPingcangleixing(String pingcangleixing) {
		if (!compareObj(this.pingcangleixing, pingcangleixing)) {
			this.pingcangleixing = pingcangleixing;
			modified = true;
		}
	}

	public Double getZhangdiefu() {
		return zhangdiefu;
	}

	@AliasMapping("zhangdiefu")
	public void setZhangdiefu(Double zhangdiefu) {
		if (!compareObj(this.zhangdiefu, zhangdiefu)) {
			this.zhangdiefu = zhangdiefu;
			modified = true;
		}
	}

	public Double getHuiluozhizuigao() {
		return huiluozhizuigao;
	}

	@AliasMapping("huiluozhizuigao")
	public void setHuiluozhizuigao(Double huiluozhizuigao) {
		if (!compareObj(this.huiluozhizuigao, huiluozhizuigao)) {
			this.huiluozhizuigao = huiluozhizuigao;
			modified = true;
		}
	}

	public Double getShouxufei() {
		return shouxufei;
	}

	@AliasMapping("shouxufei")
	public void setShouxufei(Double shouxufei) {
		if (!compareObj(this.shouxufei, shouxufei)) {
			this.shouxufei = shouxufei;
			modified = true;
		}
	}

	public Integer getJiaoyizonge() {
		return jiaoyizonge;
	}

	@AliasMapping("jiaoyizonge")
	public void setJiaoyizonge(Integer jiaoyizonge) {
		if (!compareObj(this.jiaoyizonge, jiaoyizonge)) {
			this.jiaoyizonge = jiaoyizonge;
			modified = true;
		}
	}

	public Double getYingkuidianshu() {
		return yingkuidianshu;
	}

	@AliasMapping("yingkuidianshu")
	public void setYingkuidianshu(Double yingkuidianshu) {
		if (!compareObj(this.yingkuidianshu, yingkuidianshu)) {
			this.yingkuidianshu = yingkuidianshu;
			modified = true;
		}
	}

	public Double getJingyingkui() {
		return jingyingkui;
	}

	@AliasMapping("jingyingkui")
	public void setJingyingkui(Double jingyingkui) {
		if (!compareObj(this.jingyingkui, jingyingkui)) {
			this.jingyingkui = jingyingkui;
			modified = true;
		}
	}

	public Double getShouyilv() {
		return shouyilv;
	}

	@AliasMapping("shouyilv")
	public void setShouyilv(Double shouyilv) {
		if (!compareObj(this.shouyilv, shouyilv)) {
			this.shouyilv = shouyilv;
			modified = true;
		}
	}

	public Integer getDangrichengjiao() {
		return dangrichengjiao;
	}

	@AliasMapping("dangrichengjiao")
	public void setDangrichengjiao(Integer dangrichengjiao) {
		if (!compareObj(this.dangrichengjiao, dangrichengjiao)) {
			this.dangrichengjiao = dangrichengjiao;
			modified = true;
		}
	}

	public Integer getM12() {
		return m12;
	}

	@AliasMapping("m12")
	public void setM12(Integer m12) {
		if (!compareObj(this.m12, m12)) {
			this.m12 = m12;
			modified = true;
		}
	}

	public Integer getM32() {
		return m32;
	}

	@AliasMapping("m32")
	public void setM32(Integer m32) {
		if (!compareObj(this.m32, m32)) {
			this.m32 = m32;
			modified = true;
		}
	}

	public Integer getM55() {
		return m55;
	}

	@AliasMapping("m55")
	public void setM55(Integer m55) {
		if (!compareObj(this.m55, m55)) {
			this.m55 = m55;
			modified = true;
		}
	}

	public Integer getM64() {
		return m64;
	}

	@AliasMapping("m64")
	public void setM64(Integer m64) {
		if (!compareObj(this.m64, m64)) {
			this.m64 = m64;
			modified = true;
		}
	}

	public Integer getM89() {
		return m89;
	}

	@AliasMapping("m89")
	public void setM89(Integer m89) {
		if (!compareObj(this.m89, m89)) {
			this.m89 = m89;
			modified = true;
		}
	}

	public Integer getM120() {
		return m120;
	}

	@AliasMapping("m120")
	public void setM120(Integer m120) {
		if (!compareObj(this.m120, m120)) {
			this.m120 = m120;
			modified = true;
		}
	}

	public String getZoushi() {
		return zoushi;
	}

	@AliasMapping("zoushi")
	public void setZoushi(String zoushi) {
		if (!compareObj(this.zoushi, zoushi)) {
			this.zoushi = zoushi;
			modified = true;
		}
	}

	public Integer getMam5() {
		return mam5;
	}

	@AliasMapping("mam5")
	public void setMam5(Integer mam5) {
		if (!compareObj(this.mam5, mam5)) {
			this.mam5 = mam5;
			modified = true;
		}
	}

	public Integer getMam15() {
		return mam15;
	}

	@AliasMapping("mam15")
	public void setMam15(Integer mam15) {
		if (!compareObj(this.mam15, mam15)) {
			this.mam15 = mam15;
			modified = true;
		}
	}

	public Integer getMam30() {
		return mam30;
	}

	@AliasMapping("mam30")
	public void setMam30(Integer mam30) {
		if (!compareObj(this.mam30, mam30)) {
			this.mam30 = mam30;
			modified = true;
		}
	}

	public Integer getDangrikaipan() {
		return dangrikaipan;
	}

	@AliasMapping("dangrikaipan")
	public void setDangrikaipan(Integer dangrikaipan) {
		if (!compareObj(this.dangrikaipan, dangrikaipan)) {
			this.dangrikaipan = dangrikaipan;
			modified = true;
		}
	}

	public Integer getDangrishoupan() {
		return dangrishoupan;
	}

	@AliasMapping("dangrishoupan")
	public void setDangrishoupan(Integer dangrishoupan) {
		if (!compareObj(this.dangrishoupan, dangrishoupan)) {
			this.dangrishoupan = dangrishoupan;
			modified = true;
		}
	}

	public Integer getShangwuzuigao() {
		return shangwuzuigao;
	}

	@AliasMapping("shangwuzuigao")
	public void setShangwuzuigao(Integer shangwuzuigao) {
		if (!compareObj(this.shangwuzuigao, shangwuzuigao)) {
			this.shangwuzuigao = shangwuzuigao;
			modified = true;
		}
	}

	public Integer getShangwuzuidi() {
		return shangwuzuidi;
	}

	@AliasMapping("shangwuzuidi")
	public void setShangwuzuidi(Integer shangwuzuidi) {
		if (!compareObj(this.shangwuzuidi, shangwuzuidi)) {
			this.shangwuzuidi = shangwuzuidi;
			modified = true;
		}
	}

	public Integer getXiawuzuigao() {
		return xiawuzuigao;
	}

	@AliasMapping("xiawuzuigao")
	public void setXiawuzuigao(Integer xiawuzuigao) {
		if (!compareObj(this.xiawuzuigao, xiawuzuigao)) {
			this.xiawuzuigao = xiawuzuigao;
			modified = true;
		}
	}

	public Integer getXiawuzuidi() {
		return xiawuzuidi;
	}

	@AliasMapping("xiawuzuidi")
	public void setXiawuzuidi(Integer xiawuzuidi) {
		if (!compareObj(this.xiawuzuidi, xiawuzuidi)) {
			this.xiawuzuidi = xiawuzuidi;
			modified = true;
		}
	}

	public Double getPianlilv12() {
		return pianlilv12;
	}

	@AliasMapping("pianlilv12")
	public void setPianlilv12(Double pianlilv12) {
		if (!compareObj(this.pianlilv12, pianlilv12)) {
			this.pianlilv12 = pianlilv12;
			modified = true;
		}
	}

	public Double getPianlilv32() {
		return pianlilv32;
	}

	@AliasMapping("pianlilv32")
	public void setPianlilv32(Double pianlilv32) {
		if (!compareObj(this.pianlilv32, pianlilv32)) {
			this.pianlilv32 = pianlilv32;
			modified = true;
		}
	}

	public Double getPianlilv55() {
		return pianlilv55;
	}

	@AliasMapping("pianlilv55")
	public void setPianlilv55(Double pianlilv55) {
		if (!compareObj(this.pianlilv55, pianlilv55)) {
			this.pianlilv55 = pianlilv55;
			modified = true;
		}
	}

	public Double getPianlilv64() {
		return pianlilv64;
	}

	@AliasMapping("pianlilv64")
	public void setPianlilv64(Double pianlilv64) {
		if (!compareObj(this.pianlilv64, pianlilv64)) {
			this.pianlilv64 = pianlilv64;
			modified = true;
		}
	}

	public Double getPianlilv89() {
		return pianlilv89;
	}

	@AliasMapping("pianlilv89")
	public void setPianlilv89(Double pianlilv89) {
		if (!compareObj(this.pianlilv89, pianlilv89)) {
			this.pianlilv89 = pianlilv89;
			modified = true;
		}
	}

	public Double getPianlilv120() {
		return pianlilv120;
	}

	@AliasMapping("pianlilv120")
	public void setPianlilv120(Double pianlilv120) {
		if (!compareObj(this.pianlilv120, pianlilv120)) {
			this.pianlilv120 = pianlilv120;
			modified = true;
		}
	}

	public Integer getShoupanpingchangjia() {
		return shoupanpingchangjia;
	}

	@AliasMapping("shoupanpingchangjia")
	public void setShoupanpingchangjia(Integer shoupanpingchangjia) {
		if (!compareObj(this.shoupanpingchangjia, shoupanpingchangjia)) {
			this.shoupanpingchangjia = shoupanpingchangjia;
			modified = true;
		}
	}

	public Double getGeyehouyi() {
		return geyehouyi;
	}

	@AliasMapping("geyehouyi")
	public void setGeyehouyi(Double geyehouyi) {
		if (!compareObj(this.geyehouyi, geyehouyi)) {
			this.geyehouyi = geyehouyi;
			modified = true;
		}
	}

	public String findPkColumn() {
		return "trade_id";
	}

	private TradeRecord closeTrade;

	public TradeRecord getCloseTrade() {
		try {
			if (closeTrade == null) {
				closeTrade = new TradeRecordCriteria().findByTradeIndex(
						this.getTradeIndex() + 1).getUniqueBean();
			}
			return closeTrade;
		} catch (Exception e) {
		}
		return null;
	}
}