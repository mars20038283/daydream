package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll06;

public class Dll06Criteria extends SqlCriteria<Dll06> {

	public static final String TABLE_NAME  = "dll06";

	public Dll06Criteria() {
		super(Dll06.class);
	}

	public Dll06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll06.class);
	}

	public void save(Dll06 dll06) throws MarsException {
		super.save(dll06);
	}

	public void update(Dll06 dll06) throws MarsException {
		super.update(dll06);
	}

	public void delete(Dll06 dll06) throws MarsException {
		super.delete(dll06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}