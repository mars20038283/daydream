package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu10;

public class Sqfu10Criteria extends SqlCriteria<Sqfu10> {

	public static final String TABLE_NAME  = "sqfu10";

	public Sqfu10Criteria() {
		super(Sqfu10.class);
	}

	public Sqfu10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu10.class);
	}

	public void save(Sqfu10 sqfu10) throws MarsException {
		super.save(sqfu10);
	}

	public void update(Sqfu10 sqfu10) throws MarsException {
		super.update(sqfu10);
	}

	public void delete(Sqfu10 sqfu10) throws MarsException {
		super.delete(sqfu10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}