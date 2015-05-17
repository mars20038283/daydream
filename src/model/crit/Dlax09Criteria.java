package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax09;

public class Dlax09Criteria extends SqlCriteria<Dlax09> {

	public static final String TABLE_NAME  = "dlax09";

	public Dlax09Criteria() {
		super(Dlax09.class);
	}

	public Dlax09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax09.class);
	}

	public void save(Dlax09 dlax09) throws MarsException {
		super.save(dlax09);
	}

	public void update(Dlax09 dlax09) throws MarsException {
		super.update(dlax09);
	}

	public void delete(Dlax09 dlax09) throws MarsException {
		super.delete(dlax09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}