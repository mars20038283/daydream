package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm01;

public class Dljm01Criteria extends SqlCriteria<Dljm01> {

	public static final String TABLE_NAME  = "dljm01";

	public Dljm01Criteria() {
		super(Dljm01.class);
	}

	public Dljm01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm01.class);
	}

	public void save(Dljm01 dljm01) throws MarsException {
		super.save(dljm01);
	}

	public void update(Dljm01 dljm01) throws MarsException {
		super.update(dljm01);
	}

	public void delete(Dljm01 dljm01) throws MarsException {
		super.delete(dljm01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}