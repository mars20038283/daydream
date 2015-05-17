package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag09;

public class Sqag09Criteria extends SqlCriteria<Sqag09> {

	public static final String TABLE_NAME  = "sqag09";

	public Sqag09Criteria() {
		super(Sqag09.class);
	}

	public Sqag09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag09.class);
	}

	public void save(Sqag09 sqag09) throws MarsException {
		super.save(sqag09);
	}

	public void update(Sqag09 sqag09) throws MarsException {
		super.update(sqag09);
	}

	public void delete(Sqag09 sqag09) throws MarsException {
		super.delete(sqag09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}