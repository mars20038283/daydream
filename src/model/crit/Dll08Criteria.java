package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll08;

public class Dll08Criteria extends SqlCriteria<Dll08> {

	public static final String TABLE_NAME  = "dll08";

	public Dll08Criteria() {
		super(Dll08.class);
	}

	public Dll08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll08.class);
	}

	public void save(Dll08 dll08) throws MarsException {
		super.save(dll08);
	}

	public void update(Dll08 dll08) throws MarsException {
		super.update(dll08);
	}

	public void delete(Dll08 dll08) throws MarsException {
		super.delete(dll08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}