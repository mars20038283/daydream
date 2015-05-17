package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm11;

public class Dljm11Criteria extends SqlCriteria<Dljm11> {

	public static final String TABLE_NAME  = "dljm11";

	public Dljm11Criteria() {
		super(Dljm11.class);
	}

	public Dljm11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm11.class);
	}

	public void save(Dljm11 dljm11) throws MarsException {
		super.save(dljm11);
	}

	public void update(Dljm11 dljm11) throws MarsException {
		super.update(dljm11);
	}

	public void delete(Dljm11 dljm11) throws MarsException {
		super.delete(dljm11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}