package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax07;

public class Dlax07Criteria extends SqlCriteria<Dlax07> {

	public static final String TABLE_NAME  = "dlax07";

	public Dlax07Criteria() {
		super(Dlax07.class);
	}

	public Dlax07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax07.class);
	}

	public void save(Dlax07 dlax07) throws MarsException {
		super.save(dlax07);
	}

	public void update(Dlax07 dlax07) throws MarsException {
		super.update(dlax07);
	}

	public void delete(Dlax07 dlax07) throws MarsException {
		super.delete(dlax07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}