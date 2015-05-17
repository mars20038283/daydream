package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv05;

public class Dlv05Criteria extends SqlCriteria<Dlv05> {

	public static final String TABLE_NAME  = "dlv05";

	public Dlv05Criteria() {
		super(Dlv05.class);
	}

	public Dlv05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv05.class);
	}

	public void save(Dlv05 dlv05) throws MarsException {
		super.save(dlv05);
	}

	public void update(Dlv05 dlv05) throws MarsException {
		super.update(dlv05);
	}

	public void delete(Dlv05 dlv05) throws MarsException {
		super.delete(dlv05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}