package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu06;

public class Sqfu06Criteria extends SqlCriteria<Sqfu06> {

	public static final String TABLE_NAME  = "sqfu06";

	public Sqfu06Criteria() {
		super(Sqfu06.class);
	}

	public Sqfu06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu06.class);
	}

	public void save(Sqfu06 sqfu06) throws MarsException {
		super.save(sqfu06);
	}

	public void update(Sqfu06 sqfu06) throws MarsException {
		super.update(sqfu06);
	}

	public void delete(Sqfu06 sqfu06) throws MarsException {
		super.delete(sqfu06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}