package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll03;

public class Dll03Criteria extends SqlCriteria<Dll03> {

	public static final String TABLE_NAME  = "dll03";

	public Dll03Criteria() {
		super(Dll03.class);
	}

	public Dll03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll03.class);
	}

	public void save(Dll03 dll03) throws MarsException {
		super.save(dll03);
	}

	public void update(Dll03 dll03) throws MarsException {
		super.update(dll03);
	}

	public void delete(Dll03 dll03) throws MarsException {
		super.delete(dll03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}