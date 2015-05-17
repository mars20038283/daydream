package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn06;

public class Sqzn06Criteria extends SqlCriteria<Sqzn06> {

	public static final String TABLE_NAME  = "sqzn06";

	public Sqzn06Criteria() {
		super(Sqzn06.class);
	}

	public Sqzn06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn06.class);
	}

	public void save(Sqzn06 sqzn06) throws MarsException {
		super.save(sqzn06);
	}

	public void update(Sqzn06 sqzn06) throws MarsException {
		super.update(sqzn06);
	}

	public void delete(Sqzn06 sqzn06) throws MarsException {
		super.delete(sqzn06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}