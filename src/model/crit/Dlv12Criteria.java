package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv12;

public class Dlv12Criteria extends SqlCriteria<Dlv12> {

	public static final String TABLE_NAME  = "dlv12";

	public Dlv12Criteria() {
		super(Dlv12.class);
	}

	public Dlv12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv12.class);
	}

	public void save(Dlv12 dlv12) throws MarsException {
		super.save(dlv12);
	}

	public void update(Dlv12 dlv12) throws MarsException {
		super.update(dlv12);
	}

	public void delete(Dlv12 dlv12) throws MarsException {
		super.delete(dlv12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}