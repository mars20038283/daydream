package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll01;

public class Dll01Criteria extends SqlCriteria<Dll01> {

	public static final String TABLE_NAME  = "dll01";

	public Dll01Criteria() {
		super(Dll01.class);
	}

	public Dll01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll01.class);
	}

	public void save(Dll01 dll01) throws MarsException {
		super.save(dll01);
	}

	public void update(Dll01 dll01) throws MarsException {
		super.update(dll01);
	}

	public void delete(Dll01 dll01) throws MarsException {
		super.delete(dll01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}