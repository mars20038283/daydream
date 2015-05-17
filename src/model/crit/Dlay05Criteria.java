package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay05;

public class Dlay05Criteria extends SqlCriteria<Dlay05> {

	public static final String TABLE_NAME  = "dlay05";

	public Dlay05Criteria() {
		super(Dlay05.class);
	}

	public Dlay05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay05.class);
	}

	public void save(Dlay05 dlay05) throws MarsException {
		super.save(dlay05);
	}

	public void update(Dlay05 dlay05) throws MarsException {
		super.update(dlay05);
	}

	public void delete(Dlay05 dlay05) throws MarsException {
		super.delete(dlay05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}