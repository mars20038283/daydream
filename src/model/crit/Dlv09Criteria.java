package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv09;

public class Dlv09Criteria extends SqlCriteria<Dlv09> {

	public static final String TABLE_NAME  = "dlv09";

	public Dlv09Criteria() {
		super(Dlv09.class);
	}

	public Dlv09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv09.class);
	}

	public void save(Dlv09 dlv09) throws MarsException {
		super.save(dlv09);
	}

	public void update(Dlv09 dlv09) throws MarsException {
		super.update(dlv09);
	}

	public void delete(Dlv09 dlv09) throws MarsException {
		super.delete(dlv09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}