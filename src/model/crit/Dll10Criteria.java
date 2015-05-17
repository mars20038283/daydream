package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll10;

public class Dll10Criteria extends SqlCriteria<Dll10> {

	public static final String TABLE_NAME  = "dll10";

	public Dll10Criteria() {
		super(Dll10.class);
	}

	public Dll10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll10.class);
	}

	public void save(Dll10 dll10) throws MarsException {
		super.save(dll10);
	}

	public void update(Dll10 dll10) throws MarsException {
		super.update(dll10);
	}

	public void delete(Dll10 dll10) throws MarsException {
		super.delete(dll10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}