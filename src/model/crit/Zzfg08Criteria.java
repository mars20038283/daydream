package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg08;

public class Zzfg08Criteria extends SqlCriteria<Zzfg08> {

	public static final String TABLE_NAME  = "zzfg08";

	public Zzfg08Criteria() {
		super(Zzfg08.class);
	}

	public Zzfg08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg08.class);
	}

	public void save(Zzfg08 zzfg08) throws MarsException {
		super.save(zzfg08);
	}

	public void update(Zzfg08 zzfg08) throws MarsException {
		super.update(zzfg08);
	}

	public void delete(Zzfg08 zzfg08) throws MarsException {
		super.delete(zzfg08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}