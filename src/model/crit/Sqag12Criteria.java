package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag12;

public class Sqag12Criteria extends SqlCriteria<Sqag12> {

	public static final String TABLE_NAME  = "sqag12";

	public Sqag12Criteria() {
		super(Sqag12.class);
	}

	public Sqag12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag12.class);
	}

	public void save(Sqag12 sqag12) throws MarsException {
		super.save(sqag12);
	}

	public void update(Sqag12 sqag12) throws MarsException {
		super.update(sqag12);
	}

	public void delete(Sqag12 sqag12) throws MarsException {
		super.delete(sqag12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}