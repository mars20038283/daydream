package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm09;

public class Dlm09Criteria extends SqlCriteria<Dlm09> {

	public static final String TABLE_NAME  = "dlm09";

	public Dlm09Criteria() {
		super(Dlm09.class);
	}

	public Dlm09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm09.class);
	}

	public void save(Dlm09 dlm09) throws MarsException {
		super.save(dlm09);
	}

	public void update(Dlm09 dlm09) throws MarsException {
		super.update(dlm09);
	}

	public void delete(Dlm09 dlm09) throws MarsException {
		super.delete(dlm09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}