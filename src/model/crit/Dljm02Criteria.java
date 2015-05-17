package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm02;

public class Dljm02Criteria extends SqlCriteria<Dljm02> {

	public static final String TABLE_NAME  = "dljm02";

	public Dljm02Criteria() {
		super(Dljm02.class);
	}

	public Dljm02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm02.class);
	}

	public void save(Dljm02 dljm02) throws MarsException {
		super.save(dljm02);
	}

	public void update(Dljm02 dljm02) throws MarsException {
		super.update(dljm02);
	}

	public void delete(Dljm02 dljm02) throws MarsException {
		super.delete(dljm02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}