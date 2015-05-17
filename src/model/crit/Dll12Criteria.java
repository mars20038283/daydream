package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll12;

public class Dll12Criteria extends SqlCriteria<Dll12> {

	public static final String TABLE_NAME  = "dll12";

	public Dll12Criteria() {
		super(Dll12.class);
	}

	public Dll12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll12.class);
	}

	public void save(Dll12 dll12) throws MarsException {
		super.save(dll12);
	}

	public void update(Dll12 dll12) throws MarsException {
		super.update(dll12);
	}

	public void delete(Dll12 dll12) throws MarsException {
		super.delete(dll12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}