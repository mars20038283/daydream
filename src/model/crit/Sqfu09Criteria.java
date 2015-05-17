package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu09;

public class Sqfu09Criteria extends SqlCriteria<Sqfu09> {

	public static final String TABLE_NAME  = "sqfu09";

	public Sqfu09Criteria() {
		super(Sqfu09.class);
	}

	public Sqfu09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu09.class);
	}

	public void save(Sqfu09 sqfu09) throws MarsException {
		super.save(sqfu09);
	}

	public void update(Sqfu09 sqfu09) throws MarsException {
		super.update(sqfu09);
	}

	public void delete(Sqfu09 sqfu09) throws MarsException {
		super.delete(sqfu09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}