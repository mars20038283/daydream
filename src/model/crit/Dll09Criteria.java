package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll09;

public class Dll09Criteria extends SqlCriteria<Dll09> {

	public static final String TABLE_NAME  = "dll09";

	public Dll09Criteria() {
		super(Dll09.class);
	}

	public Dll09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll09.class);
	}

	public void save(Dll09 dll09) throws MarsException {
		super.save(dll09);
	}

	public void update(Dll09 dll09) throws MarsException {
		super.update(dll09);
	}

	public void delete(Dll09 dll09) throws MarsException {
		super.delete(dll09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}