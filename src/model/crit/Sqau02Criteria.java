package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau02;

public class Sqau02Criteria extends SqlCriteria<Sqau02> {

	public static final String TABLE_NAME  = "sqau02";

	public Sqau02Criteria() {
		super(Sqau02.class);
	}

	public Sqau02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau02.class);
	}

	public void save(Sqau02 sqau02) throws MarsException {
		super.save(sqau02);
	}

	public void update(Sqau02 sqau02) throws MarsException {
		super.update(sqau02);
	}

	public void delete(Sqau02 sqau02) throws MarsException {
		super.delete(sqau02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}