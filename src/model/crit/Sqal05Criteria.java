package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal05;

public class Sqal05Criteria extends SqlCriteria<Sqal05> {

	public static final String TABLE_NAME  = "sqal05";

	public Sqal05Criteria() {
		super(Sqal05.class);
	}

	public Sqal05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal05.class);
	}

	public void save(Sqal05 sqal05) throws MarsException {
		super.save(sqal05);
	}

	public void update(Sqal05 sqal05) throws MarsException {
		super.update(sqal05);
	}

	public void delete(Sqal05 sqal05) throws MarsException {
		super.delete(sqal05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}