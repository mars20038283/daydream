package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal06;

public class Sqal06Criteria extends SqlCriteria<Sqal06> {

	public static final String TABLE_NAME  = "sqal06";

	public Sqal06Criteria() {
		super(Sqal06.class);
	}

	public Sqal06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal06.class);
	}

	public void save(Sqal06 sqal06) throws MarsException {
		super.save(sqal06);
	}

	public void update(Sqal06 sqal06) throws MarsException {
		super.update(sqal06);
	}

	public void delete(Sqal06 sqal06) throws MarsException {
		super.delete(sqal06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}