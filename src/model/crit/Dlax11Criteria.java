package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax11;

public class Dlax11Criteria extends SqlCriteria<Dlax11> {

	public static final String TABLE_NAME  = "dlax11";

	public Dlax11Criteria() {
		super(Dlax11.class);
	}

	public Dlax11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax11.class);
	}

	public void save(Dlax11 dlax11) throws MarsException {
		super.save(dlax11);
	}

	public void update(Dlax11 dlax11) throws MarsException {
		super.update(dlax11);
	}

	public void delete(Dlax11 dlax11) throws MarsException {
		super.delete(dlax11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}