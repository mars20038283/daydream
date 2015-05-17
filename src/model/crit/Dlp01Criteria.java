package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp01;

public class Dlp01Criteria extends SqlCriteria<Dlp01> {

	public static final String TABLE_NAME  = "dlp01";

	public Dlp01Criteria() {
		super(Dlp01.class);
	}

	public Dlp01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp01.class);
	}

	public void save(Dlp01 dlp01) throws MarsException {
		super.save(dlp01);
	}

	public void update(Dlp01 dlp01) throws MarsException {
		super.update(dlp01);
	}

	public void delete(Dlp01 dlp01) throws MarsException {
		super.delete(dlp01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}