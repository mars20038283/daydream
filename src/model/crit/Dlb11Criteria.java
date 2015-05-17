package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb11;

public class Dlb11Criteria extends SqlCriteria<Dlb11> {

	public static final String TABLE_NAME  = "dlb11";

	public Dlb11Criteria() {
		super(Dlb11.class);
	}

	public Dlb11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb11.class);
	}

	public void save(Dlb11 dlb11) throws MarsException {
		super.save(dlb11);
	}

	public void update(Dlb11 dlb11) throws MarsException {
		super.update(dlb11);
	}

	public void delete(Dlb11 dlb11) throws MarsException {
		super.delete(dlb11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}