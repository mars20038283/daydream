package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag02;

public class Sqag02Criteria extends SqlCriteria<Sqag02> {

	public static final String TABLE_NAME  = "sqag02";

	public Sqag02Criteria() {
		super(Sqag02.class);
	}

	public Sqag02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag02.class);
	}

	public void save(Sqag02 sqag02) throws MarsException {
		super.save(sqag02);
	}

	public void update(Sqag02 sqag02) throws MarsException {
		super.update(sqag02);
	}

	public void delete(Sqag02 sqag02) throws MarsException {
		super.delete(sqag02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}