package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu08;

public class Sqfu08Criteria extends SqlCriteria<Sqfu08> {

	public static final String TABLE_NAME  = "sqfu08";

	public Sqfu08Criteria() {
		super(Sqfu08.class);
	}

	public Sqfu08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu08.class);
	}

	public void save(Sqfu08 sqfu08) throws MarsException {
		super.save(sqfu08);
	}

	public void update(Sqfu08 sqfu08) throws MarsException {
		super.update(sqfu08);
	}

	public void delete(Sqfu08 sqfu08) throws MarsException {
		super.delete(sqfu08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}