package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr02;

public class Sqwr02Criteria extends SqlCriteria<Sqwr02> {

	public static final String TABLE_NAME  = "sqwr02";

	public Sqwr02Criteria() {
		super(Sqwr02.class);
	}

	public Sqwr02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr02.class);
	}

	public void save(Sqwr02 sqwr02) throws MarsException {
		super.save(sqwr02);
	}

	public void update(Sqwr02 sqwr02) throws MarsException {
		super.update(sqwr02);
	}

	public void delete(Sqwr02 sqwr02) throws MarsException {
		super.delete(sqwr02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}