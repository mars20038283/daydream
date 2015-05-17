package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi01;

public class Zzoi01Criteria extends SqlCriteria<Zzoi01> {

	public static final String TABLE_NAME  = "zzoi01";

	public Zzoi01Criteria() {
		super(Zzoi01.class);
	}

	public Zzoi01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi01.class);
	}

	public void save(Zzoi01 zzoi01) throws MarsException {
		super.save(zzoi01);
	}

	public void update(Zzoi01 zzoi01) throws MarsException {
		super.update(zzoi01);
	}

	public void delete(Zzoi01 zzoi01) throws MarsException {
		super.delete(zzoi01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}