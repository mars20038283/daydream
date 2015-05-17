package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly09;

public class Dly09Criteria extends SqlCriteria<Dly09> {

	public static final String TABLE_NAME  = "dly09";

	public Dly09Criteria() {
		super(Dly09.class);
	}

	public Dly09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly09.class);
	}

	public void save(Dly09 dly09) throws MarsException {
		super.save(dly09);
	}

	public void update(Dly09 dly09) throws MarsException {
		super.update(dly09);
	}

	public void delete(Dly09 dly09) throws MarsException {
		super.delete(dly09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}