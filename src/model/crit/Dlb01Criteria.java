package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb01;

public class Dlb01Criteria extends SqlCriteria<Dlb01> {

	public static final String TABLE_NAME  = "dlb01";

	public Dlb01Criteria() {
		super(Dlb01.class);
	}

	public Dlb01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb01.class);
	}

	public void save(Dlb01 dlb01) throws MarsException {
		super.save(dlb01);
	}

	public void update(Dlb01 dlb01) throws MarsException {
		super.update(dlb01);
	}

	public void delete(Dlb01 dlb01) throws MarsException {
		super.delete(dlb01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}