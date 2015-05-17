package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg05;

public class Zzfg05Criteria extends SqlCriteria<Zzfg05> {

	public static final String TABLE_NAME  = "zzfg05";

	public Zzfg05Criteria() {
		super(Zzfg05.class);
	}

	public Zzfg05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg05.class);
	}

	public void save(Zzfg05 zzfg05) throws MarsException {
		super.save(zzfg05);
	}

	public void update(Zzfg05 zzfg05) throws MarsException {
		super.update(zzfg05);
	}

	public void delete(Zzfg05 zzfg05) throws MarsException {
		super.delete(zzfg05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}