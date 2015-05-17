package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb09;

public class Sqrb09Criteria extends SqlCriteria<Sqrb09> {

	public static final String TABLE_NAME  = "sqrb09";

	public Sqrb09Criteria() {
		super(Sqrb09.class);
	}

	public Sqrb09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb09.class);
	}

	public void save(Sqrb09 sqrb09) throws MarsException {
		super.save(sqrb09);
	}

	public void update(Sqrb09 sqrb09) throws MarsException {
		super.update(sqrb09);
	}

	public void delete(Sqrb09 sqrb09) throws MarsException {
		super.delete(sqrb09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}