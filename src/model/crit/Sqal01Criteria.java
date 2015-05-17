package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal01;

public class Sqal01Criteria extends SqlCriteria<Sqal01> {

	public static final String TABLE_NAME  = "sqal01";

	public Sqal01Criteria() {
		super(Sqal01.class);
	}

	public Sqal01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal01.class);
	}

	public void save(Sqal01 sqal01) throws MarsException {
		super.save(sqal01);
	}

	public void update(Sqal01 sqal01) throws MarsException {
		super.update(sqal01);
	}

	public void delete(Sqal01 sqal01) throws MarsException {
		super.delete(sqal01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}