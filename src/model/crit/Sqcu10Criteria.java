package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu10;

public class Sqcu10Criteria extends SqlCriteria<Sqcu10> {

	public static final String TABLE_NAME  = "sqcu10";

	public Sqcu10Criteria() {
		super(Sqcu10.class);
	}

	public Sqcu10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu10.class);
	}

	public void save(Sqcu10 sqcu10) throws MarsException {
		super.save(sqcu10);
	}

	public void update(Sqcu10 sqcu10) throws MarsException {
		super.update(sqcu10);
	}

	public void delete(Sqcu10 sqcu10) throws MarsException {
		super.delete(sqcu10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}