package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay01;

public class Dlay01Criteria extends SqlCriteria<Dlay01> {

	public static final String TABLE_NAME  = "dlay01";

	public Dlay01Criteria() {
		super(Dlay01.class);
	}

	public Dlay01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay01.class);
	}

	public void save(Dlay01 dlay01) throws MarsException {
		super.save(dlay01);
	}

	public void update(Dlay01 dlay01) throws MarsException {
		super.update(dlay01);
	}

	public void delete(Dlay01 dlay01) throws MarsException {
		super.delete(dlay01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}