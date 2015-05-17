package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal02;

public class Sqal02Criteria extends SqlCriteria<Sqal02> {

	public static final String TABLE_NAME  = "sqal02";

	public Sqal02Criteria() {
		super(Sqal02.class);
	}

	public Sqal02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal02.class);
	}

	public void save(Sqal02 sqal02) throws MarsException {
		super.save(sqal02);
	}

	public void update(Sqal02 sqal02) throws MarsException {
		super.update(sqal02);
	}

	public void delete(Sqal02 sqal02) throws MarsException {
		super.delete(sqal02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}