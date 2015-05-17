package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau09;

public class Sqau09Criteria extends SqlCriteria<Sqau09> {

	public static final String TABLE_NAME  = "sqau09";

	public Sqau09Criteria() {
		super(Sqau09.class);
	}

	public Sqau09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau09.class);
	}

	public void save(Sqau09 sqau09) throws MarsException {
		super.save(sqau09);
	}

	public void update(Sqau09 sqau09) throws MarsException {
		super.update(sqau09);
	}

	public void delete(Sqau09 sqau09) throws MarsException {
		super.delete(sqau09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}