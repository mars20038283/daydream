package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc09;

public class Dlc09Criteria extends SqlCriteria<Dlc09> {

	public static final String TABLE_NAME  = "dlc09";

	public Dlc09Criteria() {
		super(Dlc09.class);
	}

	public Dlc09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc09.class);
	}

	public void save(Dlc09 dlc09) throws MarsException {
		super.save(dlc09);
	}

	public void update(Dlc09 dlc09) throws MarsException {
		super.update(dlc09);
	}

	public void delete(Dlc09 dlc09) throws MarsException {
		super.delete(dlc09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}