package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu12;

public class Sqfu12Criteria extends SqlCriteria<Sqfu12> {

	public static final String TABLE_NAME  = "sqfu12";

	public Sqfu12Criteria() {
		super(Sqfu12.class);
	}

	public Sqfu12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu12.class);
	}

	public void save(Sqfu12 sqfu12) throws MarsException {
		super.save(sqfu12);
	}

	public void update(Sqfu12 sqfu12) throws MarsException {
		super.update(sqfu12);
	}

	public void delete(Sqfu12 sqfu12) throws MarsException {
		super.delete(sqfu12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}