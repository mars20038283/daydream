package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm10;

public class Dljm10Criteria extends SqlCriteria<Dljm10> {

	public static final String TABLE_NAME  = "dljm10";

	public Dljm10Criteria() {
		super(Dljm10.class);
	}

	public Dljm10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm10.class);
	}

	public void save(Dljm10 dljm10) throws MarsException {
		super.save(dljm10);
	}

	public void update(Dljm10 dljm10) throws MarsException {
		super.update(dljm10);
	}

	public void delete(Dljm10 dljm10) throws MarsException {
		super.delete(dljm10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}