package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg09;

public class Zzfg09Criteria extends SqlCriteria<Zzfg09> {

	public static final String TABLE_NAME  = "zzfg09";

	public Zzfg09Criteria() {
		super(Zzfg09.class);
	}

	public Zzfg09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg09.class);
	}

	public void save(Zzfg09 zzfg09) throws MarsException {
		super.save(zzfg09);
	}

	public void update(Zzfg09 zzfg09) throws MarsException {
		super.update(zzfg09);
	}

	public void delete(Zzfg09 zzfg09) throws MarsException {
		super.delete(zzfg09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}