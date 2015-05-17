package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv06;

public class Dlv06Criteria extends SqlCriteria<Dlv06> {

	public static final String TABLE_NAME  = "dlv06";

	public Dlv06Criteria() {
		super(Dlv06.class);
	}

	public Dlv06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv06.class);
	}

	public void save(Dlv06 dlv06) throws MarsException {
		super.save(dlv06);
	}

	public void update(Dlv06 dlv06) throws MarsException {
		super.update(dlv06);
	}

	public void delete(Dlv06 dlv06) throws MarsException {
		super.delete(dlv06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}