package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau05;

public class Sqau05Criteria extends SqlCriteria<Sqau05> {

	public static final String TABLE_NAME  = "sqau05";

	public Sqau05Criteria() {
		super(Sqau05.class);
	}

	public Sqau05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau05.class);
	}

	public void save(Sqau05 sqau05) throws MarsException {
		super.save(sqau05);
	}

	public void update(Sqau05 sqau05) throws MarsException {
		super.update(sqau05);
	}

	public void delete(Sqau05 sqau05) throws MarsException {
		super.delete(sqau05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}