package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu01;

public class Sqcu01Criteria extends SqlCriteria<Sqcu01> {

	public static final String TABLE_NAME  = "sqcu01";

	public Sqcu01Criteria() {
		super(Sqcu01.class);
	}

	public Sqcu01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu01.class);
	}

	public void save(Sqcu01 sqcu01) throws MarsException {
		super.save(sqcu01);
	}

	public void update(Sqcu01 sqcu01) throws MarsException {
		super.update(sqcu01);
	}

	public void delete(Sqcu01 sqcu01) throws MarsException {
		super.delete(sqcu01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}