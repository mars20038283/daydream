package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay07;

public class Dlay07Criteria extends SqlCriteria<Dlay07> {

	public static final String TABLE_NAME  = "dlay07";

	public Dlay07Criteria() {
		super(Dlay07.class);
	}

	public Dlay07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay07.class);
	}

	public void save(Dlay07 dlay07) throws MarsException {
		super.save(dlay07);
	}

	public void update(Dlay07 dlay07) throws MarsException {
		super.update(dlay07);
	}

	public void delete(Dlay07 dlay07) throws MarsException {
		super.delete(dlay07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}