package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm08;

public class Dljm08Criteria extends SqlCriteria<Dljm08> {

	public static final String TABLE_NAME  = "dljm08";

	public Dljm08Criteria() {
		super(Dljm08.class);
	}

	public Dljm08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm08.class);
	}

	public void save(Dljm08 dljm08) throws MarsException {
		super.save(dljm08);
	}

	public void update(Dljm08 dljm08) throws MarsException {
		super.update(dljm08);
	}

	public void delete(Dljm08 dljm08) throws MarsException {
		super.delete(dljm08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}