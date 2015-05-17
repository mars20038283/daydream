package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau12;

public class Sqau12Criteria extends SqlCriteria<Sqau12> {

	public static final String TABLE_NAME  = "sqau12";

	public Sqau12Criteria() {
		super(Sqau12.class);
	}

	public Sqau12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau12.class);
	}

	public void save(Sqau12 sqau12) throws MarsException {
		super.save(sqau12);
	}

	public void update(Sqau12 sqau12) throws MarsException {
		super.update(sqau12);
	}

	public void delete(Sqau12 sqau12) throws MarsException {
		super.delete(sqau12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}