package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry01;

public class Zzsry01Criteria extends SqlCriteria<Zzsry01> {

	public static final String TABLE_NAME  = "zzsry01";

	public Zzsry01Criteria() {
		super(Zzsry01.class);
	}

	public Zzsry01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry01.class);
	}

	public void save(Zzsry01 zzsry01) throws MarsException {
		super.save(zzsry01);
	}

	public void update(Zzsry01 zzsry01) throws MarsException {
		super.update(zzsry01);
	}

	public void delete(Zzsry01 zzsry01) throws MarsException {
		super.delete(zzsry01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}