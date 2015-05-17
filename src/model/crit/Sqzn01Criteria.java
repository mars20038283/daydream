package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn01;

public class Sqzn01Criteria extends SqlCriteria<Sqzn01> {

	public static final String TABLE_NAME  = "sqzn01";

	public Sqzn01Criteria() {
		super(Sqzn01.class);
	}

	public Sqzn01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn01.class);
	}

	public void save(Sqzn01 sqzn01) throws MarsException {
		super.save(sqzn01);
	}

	public void update(Sqzn01 sqzn01) throws MarsException {
		super.update(sqzn01);
	}

	public void delete(Sqzn01 sqzn01) throws MarsException {
		super.delete(sqzn01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}