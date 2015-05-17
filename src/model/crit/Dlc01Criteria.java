package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc01;

public class Dlc01Criteria extends SqlCriteria<Dlc01> {

	public static final String TABLE_NAME  = "dlc01";

	public Dlc01Criteria() {
		super(Dlc01.class);
	}

	public Dlc01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc01.class);
	}

	public void save(Dlc01 dlc01) throws MarsException {
		super.save(dlc01);
	}

	public void update(Dlc01 dlc01) throws MarsException {
		super.update(dlc01);
	}

	public void delete(Dlc01 dlc01) throws MarsException {
		super.delete(dlc01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}