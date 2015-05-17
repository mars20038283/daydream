package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv02;

public class Dlv02Criteria extends SqlCriteria<Dlv02> {

	public static final String TABLE_NAME  = "dlv02";

	public Dlv02Criteria() {
		super(Dlv02.class);
	}

	public Dlv02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv02.class);
	}

	public void save(Dlv02 dlv02) throws MarsException {
		super.save(dlv02);
	}

	public void update(Dlv02 dlv02) throws MarsException {
		super.update(dlv02);
	}

	public void delete(Dlv02 dlv02) throws MarsException {
		super.delete(dlv02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}