package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru06;

public class Sqru06Criteria extends SqlCriteria<Sqru06> {

	public static final String TABLE_NAME  = "sqru06";

	public Sqru06Criteria() {
		super(Sqru06.class);
	}

	public Sqru06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru06.class);
	}

	public void save(Sqru06 sqru06) throws MarsException {
		super.save(sqru06);
	}

	public void update(Sqru06 sqru06) throws MarsException {
		super.update(sqru06);
	}

	public void delete(Sqru06 sqru06) throws MarsException {
		super.delete(sqru06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}