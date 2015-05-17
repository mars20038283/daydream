package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb05;

public class Sqrb05Criteria extends SqlCriteria<Sqrb05> {

	public static final String TABLE_NAME  = "sqrb05";

	public Sqrb05Criteria() {
		super(Sqrb05.class);
	}

	public Sqrb05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb05.class);
	}

	public void save(Sqrb05 sqrb05) throws MarsException {
		super.save(sqrb05);
	}

	public void update(Sqrb05 sqrb05) throws MarsException {
		super.update(sqrb05);
	}

	public void delete(Sqrb05 sqrb05) throws MarsException {
		super.delete(sqrb05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}