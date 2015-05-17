package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg10;

public class Zzfg10Criteria extends SqlCriteria<Zzfg10> {

	public static final String TABLE_NAME  = "zzfg10";

	public Zzfg10Criteria() {
		super(Zzfg10.class);
	}

	public Zzfg10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg10.class);
	}

	public void save(Zzfg10 zzfg10) throws MarsException {
		super.save(zzfg10);
	}

	public void update(Zzfg10 zzfg10) throws MarsException {
		super.update(zzfg10);
	}

	public void delete(Zzfg10 zzfg10) throws MarsException {
		super.delete(zzfg10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}