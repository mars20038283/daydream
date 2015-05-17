package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm01;

public class Zzpm01Criteria extends SqlCriteria<Zzpm01> {

	public static final String TABLE_NAME  = "zzpm01";

	public Zzpm01Criteria() {
		super(Zzpm01.class);
	}

	public Zzpm01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm01.class);
	}

	public void save(Zzpm01 zzpm01) throws MarsException {
		super.save(zzpm01);
	}

	public void update(Zzpm01 zzpm01) throws MarsException {
		super.update(zzpm01);
	}

	public void delete(Zzpm01 zzpm01) throws MarsException {
		super.delete(zzpm01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}