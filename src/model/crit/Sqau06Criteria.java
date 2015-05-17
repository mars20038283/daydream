package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau06;

public class Sqau06Criteria extends SqlCriteria<Sqau06> {

	public static final String TABLE_NAME  = "sqau06";

	public Sqau06Criteria() {
		super(Sqau06.class);
	}

	public Sqau06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau06.class);
	}

	public void save(Sqau06 sqau06) throws MarsException {
		super.save(sqau06);
	}

	public void update(Sqau06 sqau06) throws MarsException {
		super.update(sqau06);
	}

	public void delete(Sqau06 sqau06) throws MarsException {
		super.delete(sqau06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}