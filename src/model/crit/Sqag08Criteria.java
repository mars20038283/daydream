package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag08;

public class Sqag08Criteria extends SqlCriteria<Sqag08> {

	public static final String TABLE_NAME  = "sqag08";

	public Sqag08Criteria() {
		super(Sqag08.class);
	}

	public Sqag08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag08.class);
	}

	public void save(Sqag08 sqag08) throws MarsException {
		super.save(sqag08);
	}

	public void update(Sqag08 sqag08) throws MarsException {
		super.update(sqag08);
	}

	public void delete(Sqag08 sqag08) throws MarsException {
		super.delete(sqag08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}