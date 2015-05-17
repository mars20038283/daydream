package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal08;

public class Sqal08Criteria extends SqlCriteria<Sqal08> {

	public static final String TABLE_NAME  = "sqal08";

	public Sqal08Criteria() {
		super(Sqal08.class);
	}

	public Sqal08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal08.class);
	}

	public void save(Sqal08 sqal08) throws MarsException {
		super.save(sqal08);
	}

	public void update(Sqal08 sqal08) throws MarsException {
		super.update(sqal08);
	}

	public void delete(Sqal08 sqal08) throws MarsException {
		super.delete(sqal08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}