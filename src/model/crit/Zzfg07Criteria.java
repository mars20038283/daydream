package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg07;

public class Zzfg07Criteria extends SqlCriteria<Zzfg07> {

	public static final String TABLE_NAME  = "zzfg07";

	public Zzfg07Criteria() {
		super(Zzfg07.class);
	}

	public Zzfg07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg07.class);
	}

	public void save(Zzfg07 zzfg07) throws MarsException {
		super.save(zzfg07);
	}

	public void update(Zzfg07 zzfg07) throws MarsException {
		super.update(zzfg07);
	}

	public void delete(Zzfg07 zzfg07) throws MarsException {
		super.delete(zzfg07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}