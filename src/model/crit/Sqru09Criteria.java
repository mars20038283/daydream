package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru09;

public class Sqru09Criteria extends SqlCriteria<Sqru09> {

	public static final String TABLE_NAME  = "sqru09";

	public Sqru09Criteria() {
		super(Sqru09.class);
	}

	public Sqru09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru09.class);
	}

	public void save(Sqru09 sqru09) throws MarsException {
		super.save(sqru09);
	}

	public void update(Sqru09 sqru09) throws MarsException {
		super.update(sqru09);
	}

	public void delete(Sqru09 sqru09) throws MarsException {
		super.delete(sqru09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}