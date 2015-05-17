package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag03;

public class Sqag03Criteria extends SqlCriteria<Sqag03> {

	public static final String TABLE_NAME  = "sqag03";

	public Sqag03Criteria() {
		super(Sqag03.class);
	}

	public Sqag03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag03.class);
	}

	public void save(Sqag03 sqag03) throws MarsException {
		super.save(sqag03);
	}

	public void update(Sqag03 sqag03) throws MarsException {
		super.update(sqag03);
	}

	public void delete(Sqag03 sqag03) throws MarsException {
		super.delete(sqag03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}