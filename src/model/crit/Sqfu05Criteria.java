package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu05;

public class Sqfu05Criteria extends SqlCriteria<Sqfu05> {

	public static final String TABLE_NAME  = "sqfu05";

	public Sqfu05Criteria() {
		super(Sqfu05.class);
	}

	public Sqfu05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu05.class);
	}

	public void save(Sqfu05 sqfu05) throws MarsException {
		super.save(sqfu05);
	}

	public void update(Sqfu05 sqfu05) throws MarsException {
		super.update(sqfu05);
	}

	public void delete(Sqfu05 sqfu05) throws MarsException {
		super.delete(sqfu05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}