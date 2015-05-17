package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm05;

public class Dlm05Criteria extends SqlCriteria<Dlm05> {

	public static final String TABLE_NAME  = "dlm05";

	public Dlm05Criteria() {
		super(Dlm05.class);
	}

	public Dlm05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm05.class);
	}

	public void save(Dlm05 dlm05) throws MarsException {
		super.save(dlm05);
	}

	public void update(Dlm05 dlm05) throws MarsException {
		super.update(dlm05);
	}

	public void delete(Dlm05 dlm05) throws MarsException {
		super.delete(dlm05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}