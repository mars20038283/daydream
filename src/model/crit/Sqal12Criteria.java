package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal12;

public class Sqal12Criteria extends SqlCriteria<Sqal12> {

	public static final String TABLE_NAME  = "sqal12";

	public Sqal12Criteria() {
		super(Sqal12.class);
	}

	public Sqal12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal12.class);
	}

	public void save(Sqal12 sqal12) throws MarsException {
		super.save(sqal12);
	}

	public void update(Sqal12 sqal12) throws MarsException {
		super.update(sqal12);
	}

	public void delete(Sqal12 sqal12) throws MarsException {
		super.delete(sqal12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}