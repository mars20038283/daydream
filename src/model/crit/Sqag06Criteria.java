package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag06;

public class Sqag06Criteria extends SqlCriteria<Sqag06> {

	public static final String TABLE_NAME  = "sqag06";

	public Sqag06Criteria() {
		super(Sqag06.class);
	}

	public Sqag06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag06.class);
	}

	public void save(Sqag06 sqag06) throws MarsException {
		super.save(sqag06);
	}

	public void update(Sqag06 sqag06) throws MarsException {
		super.update(sqag06);
	}

	public void delete(Sqag06 sqag06) throws MarsException {
		super.delete(sqag06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}