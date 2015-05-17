package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu09;

public class Sqcu09Criteria extends SqlCriteria<Sqcu09> {

	public static final String TABLE_NAME  = "sqcu09";

	public Sqcu09Criteria() {
		super(Sqcu09.class);
	}

	public Sqcu09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu09.class);
	}

	public void save(Sqcu09 sqcu09) throws MarsException {
		super.save(sqcu09);
	}

	public void update(Sqcu09 sqcu09) throws MarsException {
		super.update(sqcu09);
	}

	public void delete(Sqcu09 sqcu09) throws MarsException {
		super.delete(sqcu09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}