package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv11;

public class Dlv11Criteria extends SqlCriteria<Dlv11> {

	public static final String TABLE_NAME  = "dlv11";

	public Dlv11Criteria() {
		super(Dlv11.class);
	}

	public Dlv11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv11.class);
	}

	public void save(Dlv11 dlv11) throws MarsException {
		super.save(dlv11);
	}

	public void update(Dlv11 dlv11) throws MarsException {
		super.update(dlv11);
	}

	public void delete(Dlv11 dlv11) throws MarsException {
		super.delete(dlv11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}