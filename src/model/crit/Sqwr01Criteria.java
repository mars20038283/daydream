package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr01;

public class Sqwr01Criteria extends SqlCriteria<Sqwr01> {

	public static final String TABLE_NAME  = "sqwr01";

	public Sqwr01Criteria() {
		super(Sqwr01.class);
	}

	public Sqwr01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr01.class);
	}

	public void save(Sqwr01 sqwr01) throws MarsException {
		super.save(sqwr01);
	}

	public void update(Sqwr01 sqwr01) throws MarsException {
		super.update(sqwr01);
	}

	public void delete(Sqwr01 sqwr01) throws MarsException {
		super.delete(sqwr01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}