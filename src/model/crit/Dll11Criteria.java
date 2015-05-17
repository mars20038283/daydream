package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll11;

public class Dll11Criteria extends SqlCriteria<Dll11> {

	public static final String TABLE_NAME  = "dll11";

	public Dll11Criteria() {
		super(Dll11.class);
	}

	public Dll11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll11.class);
	}

	public void save(Dll11 dll11) throws MarsException {
		super.save(dll11);
	}

	public void update(Dll11 dll11) throws MarsException {
		super.update(dll11);
	}

	public void delete(Dll11 dll11) throws MarsException {
		super.delete(dll11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}