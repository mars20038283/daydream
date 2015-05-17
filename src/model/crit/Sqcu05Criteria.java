package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu05;

public class Sqcu05Criteria extends SqlCriteria<Sqcu05> {

	public static final String TABLE_NAME  = "sqcu05";

	public Sqcu05Criteria() {
		super(Sqcu05.class);
	}

	public Sqcu05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu05.class);
	}

	public void save(Sqcu05 sqcu05) throws MarsException {
		super.save(sqcu05);
	}

	public void update(Sqcu05 sqcu05) throws MarsException {
		super.update(sqcu05);
	}

	public void delete(Sqcu05 sqcu05) throws MarsException {
		super.delete(sqcu05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}