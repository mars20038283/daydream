package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag01;

public class Sqag01Criteria extends SqlCriteria<Sqag01> {

	public static final String TABLE_NAME  = "sqag01";

	public Sqag01Criteria() {
		super(Sqag01.class);
	}

	public Sqag01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag01.class);
	}

	public void save(Sqag01 sqag01) throws MarsException {
		super.save(sqag01);
	}

	public void update(Sqag01 sqag01) throws MarsException {
		super.update(sqag01);
	}

	public void delete(Sqag01 sqag01) throws MarsException {
		super.delete(sqag01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}