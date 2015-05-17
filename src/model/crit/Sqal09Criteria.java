package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal09;

public class Sqal09Criteria extends SqlCriteria<Sqal09> {

	public static final String TABLE_NAME  = "sqal09";

	public Sqal09Criteria() {
		super(Sqal09.class);
	}

	public Sqal09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal09.class);
	}

	public void save(Sqal09 sqal09) throws MarsException {
		super.save(sqal09);
	}

	public void update(Sqal09 sqal09) throws MarsException {
		super.update(sqal09);
	}

	public void delete(Sqal09 sqal09) throws MarsException {
		super.delete(sqal09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}