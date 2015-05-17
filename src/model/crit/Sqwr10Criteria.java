package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr10;

public class Sqwr10Criteria extends SqlCriteria<Sqwr10> {

	public static final String TABLE_NAME  = "sqwr10";

	public Sqwr10Criteria() {
		super(Sqwr10.class);
	}

	public Sqwr10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr10.class);
	}

	public void save(Sqwr10 sqwr10) throws MarsException {
		super.save(sqwr10);
	}

	public void update(Sqwr10 sqwr10) throws MarsException {
		super.update(sqwr10);
	}

	public void delete(Sqwr10 sqwr10) throws MarsException {
		super.delete(sqwr10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}