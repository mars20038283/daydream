package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb05;

public class Dlb05Criteria extends SqlCriteria<Dlb05> {

	public static final String TABLE_NAME  = "dlb05";

	public Dlb05Criteria() {
		super(Dlb05.class);
	}

	public Dlb05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb05.class);
	}

	public void save(Dlb05 dlb05) throws MarsException {
		super.save(dlb05);
	}

	public void update(Dlb05 dlb05) throws MarsException {
		super.update(dlb05);
	}

	public void delete(Dlb05 dlb05) throws MarsException {
		super.delete(dlb05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}