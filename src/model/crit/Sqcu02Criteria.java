package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu02;

public class Sqcu02Criteria extends SqlCriteria<Sqcu02> {

	public static final String TABLE_NAME  = "sqcu02";

	public Sqcu02Criteria() {
		super(Sqcu02.class);
	}

	public Sqcu02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu02.class);
	}

	public void save(Sqcu02 sqcu02) throws MarsException {
		super.save(sqcu02);
	}

	public void update(Sqcu02 sqcu02) throws MarsException {
		super.update(sqcu02);
	}

	public void delete(Sqcu02 sqcu02) throws MarsException {
		super.delete(sqcu02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}