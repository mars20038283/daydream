package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg02;

public class Zzfg02Criteria extends SqlCriteria<Zzfg02> {

	public static final String TABLE_NAME  = "zzfg02";

	public Zzfg02Criteria() {
		super(Zzfg02.class);
	}

	public Zzfg02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg02.class);
	}

	public void save(Zzfg02 zzfg02) throws MarsException {
		super.save(zzfg02);
	}

	public void update(Zzfg02 zzfg02) throws MarsException {
		super.update(zzfg02);
	}

	public void delete(Zzfg02 zzfg02) throws MarsException {
		super.delete(zzfg02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}