package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru08;

public class Sqru08Criteria extends SqlCriteria<Sqru08> {

	public static final String TABLE_NAME  = "sqru08";

	public Sqru08Criteria() {
		super(Sqru08.class);
	}

	public Sqru08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru08.class);
	}

	public void save(Sqru08 sqru08) throws MarsException {
		super.save(sqru08);
	}

	public void update(Sqru08 sqru08) throws MarsException {
		super.update(sqru08);
	}

	public void delete(Sqru08 sqru08) throws MarsException {
		super.delete(sqru08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}