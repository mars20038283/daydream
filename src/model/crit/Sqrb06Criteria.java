package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb06;

public class Sqrb06Criteria extends SqlCriteria<Sqrb06> {

	public static final String TABLE_NAME  = "sqrb06";

	public Sqrb06Criteria() {
		super(Sqrb06.class);
	}

	public Sqrb06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb06.class);
	}

	public void save(Sqrb06 sqrb06) throws MarsException {
		super.save(sqrb06);
	}

	public void update(Sqrb06 sqrb06) throws MarsException {
		super.update(sqrb06);
	}

	public void delete(Sqrb06 sqrb06) throws MarsException {
		super.delete(sqrb06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}