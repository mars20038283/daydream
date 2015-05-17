package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu02;

public class Sqfu02Criteria extends SqlCriteria<Sqfu02> {

	public static final String TABLE_NAME  = "sqfu02";

	public Sqfu02Criteria() {
		super(Sqfu02.class);
	}

	public Sqfu02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu02.class);
	}

	public void save(Sqfu02 sqfu02) throws MarsException {
		super.save(sqfu02);
	}

	public void update(Sqfu02 sqfu02) throws MarsException {
		super.update(sqfu02);
	}

	public void delete(Sqfu02 sqfu02) throws MarsException {
		super.delete(sqfu02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}