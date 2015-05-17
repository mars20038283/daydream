package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu03;

public class Sqcu03Criteria extends SqlCriteria<Sqcu03> {

	public static final String TABLE_NAME  = "sqcu03";

	public Sqcu03Criteria() {
		super(Sqcu03.class);
	}

	public Sqcu03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu03.class);
	}

	public void save(Sqcu03 sqcu03) throws MarsException {
		super.save(sqcu03);
	}

	public void update(Sqcu03 sqcu03) throws MarsException {
		super.update(sqcu03);
	}

	public void delete(Sqcu03 sqcu03) throws MarsException {
		super.delete(sqcu03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}