package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm07;

public class Dljm07Criteria extends SqlCriteria<Dljm07> {

	public static final String TABLE_NAME  = "dljm07";

	public Dljm07Criteria() {
		super(Dljm07.class);
	}

	public Dljm07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm07.class);
	}

	public void save(Dljm07 dljm07) throws MarsException {
		super.save(dljm07);
	}

	public void update(Dljm07 dljm07) throws MarsException {
		super.update(dljm07);
	}

	public void delete(Dljm07 dljm07) throws MarsException {
		super.delete(dljm07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}