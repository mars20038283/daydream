package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm11;

public class Dlm11Criteria extends SqlCriteria<Dlm11> {

	public static final String TABLE_NAME  = "dlm11";

	public Dlm11Criteria() {
		super(Dlm11.class);
	}

	public Dlm11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm11.class);
	}

	public void save(Dlm11 dlm11) throws MarsException {
		super.save(dlm11);
	}

	public void update(Dlm11 dlm11) throws MarsException {
		super.update(dlm11);
	}

	public void delete(Dlm11 dlm11) throws MarsException {
		super.delete(dlm11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}