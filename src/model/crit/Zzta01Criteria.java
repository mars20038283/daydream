package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta01;

public class Zzta01Criteria extends SqlCriteria<Zzta01> {

	public static final String TABLE_NAME  = "zzta01";

	public Zzta01Criteria() {
		super(Zzta01.class);
	}

	public Zzta01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta01.class);
	}

	public void save(Zzta01 zzta01) throws MarsException {
		super.save(zzta01);
	}

	public void update(Zzta01 zzta01) throws MarsException {
		super.update(zzta01);
	}

	public void delete(Zzta01 zzta01) throws MarsException {
		super.delete(zzta01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}