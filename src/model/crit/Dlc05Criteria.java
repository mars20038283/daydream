package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc05;

public class Dlc05Criteria extends SqlCriteria<Dlc05> {

	public static final String TABLE_NAME  = "dlc05";

	public Dlc05Criteria() {
		super(Dlc05.class);
	}

	public Dlc05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc05.class);
	}

	public void save(Dlc05 dlc05) throws MarsException {
		super.save(dlc05);
	}

	public void update(Dlc05 dlc05) throws MarsException {
		super.update(dlc05);
	}

	public void delete(Dlc05 dlc05) throws MarsException {
		super.delete(dlc05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}