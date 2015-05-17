package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr06;

public class Sqwr06Criteria extends SqlCriteria<Sqwr06> {

	public static final String TABLE_NAME  = "sqwr06";

	public Sqwr06Criteria() {
		super(Sqwr06.class);
	}

	public Sqwr06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr06.class);
	}

	public void save(Sqwr06 sqwr06) throws MarsException {
		super.save(sqwr06);
	}

	public void update(Sqwr06 sqwr06) throws MarsException {
		super.update(sqwr06);
	}

	public void delete(Sqwr06 sqwr06) throws MarsException {
		super.delete(sqwr06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}