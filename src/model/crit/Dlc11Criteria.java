package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc11;

public class Dlc11Criteria extends SqlCriteria<Dlc11> {

	public static final String TABLE_NAME  = "dlc11";

	public Dlc11Criteria() {
		super(Dlc11.class);
	}

	public Dlc11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc11.class);
	}

	public void save(Dlc11 dlc11) throws MarsException {
		super.save(dlc11);
	}

	public void update(Dlc11 dlc11) throws MarsException {
		super.update(dlc11);
	}

	public void delete(Dlc11 dlc11) throws MarsException {
		super.delete(dlc11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}