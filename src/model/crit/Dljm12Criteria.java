package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm12;

public class Dljm12Criteria extends SqlCriteria<Dljm12> {

	public static final String TABLE_NAME  = "dljm12";

	public Dljm12Criteria() {
		super(Dljm12.class);
	}

	public Dljm12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm12.class);
	}

	public void save(Dljm12 dljm12) throws MarsException {
		super.save(dljm12);
	}

	public void update(Dljm12 dljm12) throws MarsException {
		super.update(dljm12);
	}

	public void delete(Dljm12 dljm12) throws MarsException {
		super.delete(dljm12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}