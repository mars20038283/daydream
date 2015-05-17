package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu08;

public class Sqcu08Criteria extends SqlCriteria<Sqcu08> {

	public static final String TABLE_NAME  = "sqcu08";

	public Sqcu08Criteria() {
		super(Sqcu08.class);
	}

	public Sqcu08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu08.class);
	}

	public void save(Sqcu08 sqcu08) throws MarsException {
		super.save(sqcu08);
	}

	public void update(Sqcu08 sqcu08) throws MarsException {
		super.update(sqcu08);
	}

	public void delete(Sqcu08 sqcu08) throws MarsException {
		super.delete(sqcu08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}