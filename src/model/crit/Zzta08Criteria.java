package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta08;

public class Zzta08Criteria extends SqlCriteria<Zzta08> {

	public static final String TABLE_NAME  = "zzta08";

	public Zzta08Criteria() {
		super(Zzta08.class);
	}

	public Zzta08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta08.class);
	}

	public void save(Zzta08 zzta08) throws MarsException {
		super.save(zzta08);
	}

	public void update(Zzta08 zzta08) throws MarsException {
		super.update(zzta08);
	}

	public void delete(Zzta08 zzta08) throws MarsException {
		super.delete(zzta08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}