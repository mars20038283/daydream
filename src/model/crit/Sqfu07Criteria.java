package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu07;

public class Sqfu07Criteria extends SqlCriteria<Sqfu07> {

	public static final String TABLE_NAME  = "sqfu07";

	public Sqfu07Criteria() {
		super(Sqfu07.class);
	}

	public Sqfu07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu07.class);
	}

	public void save(Sqfu07 sqfu07) throws MarsException {
		super.save(sqfu07);
	}

	public void update(Sqfu07 sqfu07) throws MarsException {
		super.update(sqfu07);
	}

	public void delete(Sqfu07 sqfu07) throws MarsException {
		super.delete(sqfu07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}