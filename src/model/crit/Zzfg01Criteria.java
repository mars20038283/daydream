package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg01;

public class Zzfg01Criteria extends SqlCriteria<Zzfg01> {

	public static final String TABLE_NAME  = "zzfg01";

	public Zzfg01Criteria() {
		super(Zzfg01.class);
	}

	public Zzfg01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg01.class);
	}

	public void save(Zzfg01 zzfg01) throws MarsException {
		super.save(zzfg01);
	}

	public void update(Zzfg01 zzfg01) throws MarsException {
		super.update(zzfg01);
	}

	public void delete(Zzfg01 zzfg01) throws MarsException {
		super.delete(zzfg01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}