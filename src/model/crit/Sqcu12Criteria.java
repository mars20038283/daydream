package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu12;

public class Sqcu12Criteria extends SqlCriteria<Sqcu12> {

	public static final String TABLE_NAME  = "sqcu12";

	public Sqcu12Criteria() {
		super(Sqcu12.class);
	}

	public Sqcu12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu12.class);
	}

	public void save(Sqcu12 sqcu12) throws MarsException {
		super.save(sqcu12);
	}

	public void update(Sqcu12 sqcu12) throws MarsException {
		super.update(sqcu12);
	}

	public void delete(Sqcu12 sqcu12) throws MarsException {
		super.delete(sqcu12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}