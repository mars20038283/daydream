package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu07;

public class Sqcu07Criteria extends SqlCriteria<Sqcu07> {

	public static final String TABLE_NAME  = "sqcu07";

	public Sqcu07Criteria() {
		super(Sqcu07.class);
	}

	public Sqcu07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu07.class);
	}

	public void save(Sqcu07 sqcu07) throws MarsException {
		super.save(sqcu07);
	}

	public void update(Sqcu07 sqcu07) throws MarsException {
		super.update(sqcu07);
	}

	public void delete(Sqcu07 sqcu07) throws MarsException {
		super.delete(sqcu07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}