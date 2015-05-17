package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc03;

public class Dlc03Criteria extends SqlCriteria<Dlc03> {

	public static final String TABLE_NAME  = "dlc03";

	public Dlc03Criteria() {
		super(Dlc03.class);
	}

	public Dlc03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc03.class);
	}

	public void save(Dlc03 dlc03) throws MarsException {
		super.save(dlc03);
	}

	public void update(Dlc03 dlc03) throws MarsException {
		super.update(dlc03);
	}

	public void delete(Dlc03 dlc03) throws MarsException {
		super.delete(dlc03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}