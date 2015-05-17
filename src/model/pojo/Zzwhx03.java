package model.pojo;

import java.util.Date;

import com.marswork.core.common.data.MarsBean;
import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.dataaccess.beansupport.annotation.AliasMapping;
import com.marswork.dataaccess.beansupport.annotation.PrimaryKey;

@AliasMapping("zzwhx03")
public class Zzwhx03 extends MarsBean {

	private static final long serialVersionUID = 1L;

	private String dataId;

	private Date date;

	private Double kaipan;

	private Double zuigao;

	private Double zuidi;

	private Double shoupan;

	private Integer chengjiao;

	private Integer chicang;

	
	public String getDataId() {
		return dataId;
	}

	@PrimaryKey
	@AliasMapping("DATA_ID")
	public void setDataId(String dataId) {
		if(BasicUtils.isTrimBlank(this.dataId)){
			this.dataId = dataId;
		}
	}

	public String findPkValue(){
		return dataId;
	}

	public void evaluatePkValue(String pkId){
		setDataId(pkId);
	}
	
	public Date getDate() {
		return date;
	}


	@AliasMapping("DATE")
	public void setDate(Date date) {
		if(!compareObj(this.date, date)){
			this.date = date;
			modified=true;
		}
	}
	
	public Double getKaipan() {
		return kaipan;
	}


	@AliasMapping("KAIPAN")
	public void setKaipan(Double kaipan) {
		if(!compareObj(this.kaipan, kaipan)){
			this.kaipan = kaipan;
			modified=true;
		}
	}
	
	public Double getZuigao() {
		return zuigao;
	}


	@AliasMapping("ZUIGAO")
	public void setZuigao(Double zuigao) {
		if(!compareObj(this.zuigao, zuigao)){
			this.zuigao = zuigao;
			modified=true;
		}
	}
	
	public Double getZuidi() {
		return zuidi;
	}


	@AliasMapping("ZUIDI")
	public void setZuidi(Double zuidi) {
		if(!compareObj(this.zuidi, zuidi)){
			this.zuidi = zuidi;
			modified=true;
		}
	}
	
	public Double getShoupan() {
		return shoupan;
	}


	@AliasMapping("SHOUPAN")
	public void setShoupan(Double shoupan) {
		if(!compareObj(this.shoupan, shoupan)){
			this.shoupan = shoupan;
			modified=true;
		}
	}
	
	public Integer getChengjiao() {
		return chengjiao;
	}


	@AliasMapping("CHENGJIAO")
	public void setChengjiao(Integer chengjiao) {
		if(!compareObj(this.chengjiao, chengjiao)){
			this.chengjiao = chengjiao;
			modified=true;
		}
	}
	
	public Integer getChicang() {
		return chicang;
	}


	@AliasMapping("CHICANG")
	public void setChicang(Integer chicang) {
		if(!compareObj(this.chicang, chicang)){
			this.chicang = chicang;
			modified=true;
		}
	}

	public String findPkColumn(){
		return "DATA_ID";
	}


}