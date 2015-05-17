package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm03;

public class Dljm03Criteria extends SqlCriteria<Dljm03> {

	public static final String TABLE_NAME  = "dljm03";

	public Dljm03Criteria() {
		super(Dljm03.class);
	}

	public Dljm03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm03.class);
	}

	public void save(Dljm03 dljm03) throws MarsException {
		super.save(dljm03);
	}

	public void update(Dljm03 dljm03) throws MarsException {
		super.update(dljm03);
	}

	public void delete(Dljm03 dljm03) throws MarsException {
		super.delete(dljm03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}