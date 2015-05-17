package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru10;

public class Sqru10Criteria extends SqlCriteria<Sqru10> {

	public static final String TABLE_NAME  = "sqru10";

	public Sqru10Criteria() {
		super(Sqru10.class);
	}

	public Sqru10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru10.class);
	}

	public void save(Sqru10 sqru10) throws MarsException {
		super.save(sqru10);
	}

	public void update(Sqru10 sqru10) throws MarsException {
		super.update(sqru10);
	}

	public void delete(Sqru10 sqru10) throws MarsException {
		super.delete(sqru10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}