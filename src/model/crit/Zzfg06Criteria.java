package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg06;

public class Zzfg06Criteria extends SqlCriteria<Zzfg06> {

	public static final String TABLE_NAME  = "zzfg06";

	public Zzfg06Criteria() {
		super(Zzfg06.class);
	}

	public Zzfg06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg06.class);
	}

	public void save(Zzfg06 zzfg06) throws MarsException {
		super.save(zzfg06);
	}

	public void update(Zzfg06 zzfg06) throws MarsException {
		super.update(zzfg06);
	}

	public void delete(Zzfg06 zzfg06) throws MarsException {
		super.delete(zzfg06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}