package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm01;

public class Dlm01Criteria extends SqlCriteria<Dlm01> {

	public static final String TABLE_NAME  = "dlm01";

	public Dlm01Criteria() {
		super(Dlm01.class);
	}

	public Dlm01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm01.class);
	}

	public void save(Dlm01 dlm01) throws MarsException {
		super.save(dlm01);
	}

	public void update(Dlm01 dlm01) throws MarsException {
		super.update(dlm01);
	}

	public void delete(Dlm01 dlm01) throws MarsException {
		super.delete(dlm01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}