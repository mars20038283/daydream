package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru01;

public class Sqru01Criteria extends SqlCriteria<Sqru01> {

	public static final String TABLE_NAME  = "sqru01";

	public Sqru01Criteria() {
		super(Sqru01.class);
	}

	public Sqru01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru01.class);
	}

	public void save(Sqru01 sqru01) throws MarsException {
		super.save(sqru01);
	}

	public void update(Sqru01 sqru01) throws MarsException {
		super.update(sqru01);
	}

	public void delete(Sqru01 sqru01) throws MarsException {
		super.delete(sqru01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}