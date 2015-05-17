package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb02;

public class Sqrb02Criteria extends SqlCriteria<Sqrb02> {

	public static final String TABLE_NAME  = "sqrb02";

	public Sqrb02Criteria() {
		super(Sqrb02.class);
	}

	public Sqrb02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb02.class);
	}

	public void save(Sqrb02 sqrb02) throws MarsException {
		super.save(sqrb02);
	}

	public void update(Sqrb02 sqrb02) throws MarsException {
		super.update(sqrb02);
	}

	public void delete(Sqrb02 sqrb02) throws MarsException {
		super.delete(sqrb02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}