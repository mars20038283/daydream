package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm09;

public class Dljm09Criteria extends SqlCriteria<Dljm09> {

	public static final String TABLE_NAME  = "dljm09";

	public Dljm09Criteria() {
		super(Dljm09.class);
	}

	public Dljm09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm09.class);
	}

	public void save(Dljm09 dljm09) throws MarsException {
		super.save(dljm09);
	}

	public void update(Dljm09 dljm09) throws MarsException {
		super.update(dljm09);
	}

	public void delete(Dljm09 dljm09) throws MarsException {
		super.delete(dljm09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}