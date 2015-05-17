package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb01;

public class Sqrb01Criteria extends SqlCriteria<Sqrb01> {

	public static final String TABLE_NAME  = "sqrb01";

	public Sqrb01Criteria() {
		super(Sqrb01.class);
	}

	public Sqrb01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb01.class);
	}

	public void save(Sqrb01 sqrb01) throws MarsException {
		super.save(sqrb01);
	}

	public void update(Sqrb01 sqrb01) throws MarsException {
		super.update(sqrb01);
	}

	public void delete(Sqrb01 sqrb01) throws MarsException {
		super.delete(sqrb01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}