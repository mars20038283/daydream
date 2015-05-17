package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu06;

public class Sqcu06Criteria extends SqlCriteria<Sqcu06> {

	public static final String TABLE_NAME  = "sqcu06";

	public Sqcu06Criteria() {
		super(Sqcu06.class);
	}

	public Sqcu06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu06.class);
	}

	public void save(Sqcu06 sqcu06) throws MarsException {
		super.save(sqcu06);
	}

	public void update(Sqcu06 sqcu06) throws MarsException {
		super.update(sqcu06);
	}

	public void delete(Sqcu06 sqcu06) throws MarsException {
		super.delete(sqcu06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}