package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax05;

public class Dlax05Criteria extends SqlCriteria<Dlax05> {

	public static final String TABLE_NAME  = "dlax05";

	public Dlax05Criteria() {
		super(Dlax05.class);
	}

	public Dlax05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax05.class);
	}

	public void save(Dlax05 dlax05) throws MarsException {
		super.save(dlax05);
	}

	public void update(Dlax05 dlax05) throws MarsException {
		super.update(dlax05);
	}

	public void delete(Dlax05 dlax05) throws MarsException {
		super.delete(dlax05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}