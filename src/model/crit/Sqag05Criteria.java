package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag05;

public class Sqag05Criteria extends SqlCriteria<Sqag05> {

	public static final String TABLE_NAME  = "sqag05";

	public Sqag05Criteria() {
		super(Sqag05.class);
	}

	public Sqag05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag05.class);
	}

	public void save(Sqag05 sqag05) throws MarsException {
		super.save(sqag05);
	}

	public void update(Sqag05 sqag05) throws MarsException {
		super.update(sqag05);
	}

	public void delete(Sqag05 sqag05) throws MarsException {
		super.delete(sqag05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}