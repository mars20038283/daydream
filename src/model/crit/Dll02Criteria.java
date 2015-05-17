package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll02;

public class Dll02Criteria extends SqlCriteria<Dll02> {

	public static final String TABLE_NAME  = "dll02";

	public Dll02Criteria() {
		super(Dll02.class);
	}

	public Dll02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll02.class);
	}

	public void save(Dll02 dll02) throws MarsException {
		super.save(dll02);
	}

	public void update(Dll02 dll02) throws MarsException {
		super.update(dll02);
	}

	public void delete(Dll02 dll02) throws MarsException {
		super.delete(dll02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}