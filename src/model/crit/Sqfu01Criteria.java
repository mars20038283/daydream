package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu01;

public class Sqfu01Criteria extends SqlCriteria<Sqfu01> {

	public static final String TABLE_NAME  = "sqfu01";

	public Sqfu01Criteria() {
		super(Sqfu01.class);
	}

	public Sqfu01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu01.class);
	}

	public void save(Sqfu01 sqfu01) throws MarsException {
		super.save(sqfu01);
	}

	public void update(Sqfu01 sqfu01) throws MarsException {
		super.update(sqfu01);
	}

	public void delete(Sqfu01 sqfu01) throws MarsException {
		super.delete(sqfu01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}