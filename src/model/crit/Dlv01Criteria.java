package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv01;

public class Dlv01Criteria extends SqlCriteria<Dlv01> {

	public static final String TABLE_NAME  = "dlv01";

	public Dlv01Criteria() {
		super(Dlv01.class);
	}

	public Dlv01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv01.class);
	}

	public void save(Dlv01 dlv01) throws MarsException {
		super.save(dlv01);
	}

	public void update(Dlv01 dlv01) throws MarsException {
		super.update(dlv01);
	}

	public void delete(Dlv01 dlv01) throws MarsException {
		super.delete(dlv01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}