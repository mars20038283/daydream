package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag10;

public class Sqag10Criteria extends SqlCriteria<Sqag10> {

	public static final String TABLE_NAME  = "sqag10";

	public Sqag10Criteria() {
		super(Sqag10.class);
	}

	public Sqag10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag10.class);
	}

	public void save(Sqag10 sqag10) throws MarsException {
		super.save(sqag10);
	}

	public void update(Sqag10 sqag10) throws MarsException {
		super.update(sqag10);
	}

	public void delete(Sqag10 sqag10) throws MarsException {
		super.delete(sqag10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}