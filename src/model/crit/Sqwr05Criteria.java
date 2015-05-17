package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr05;

public class Sqwr05Criteria extends SqlCriteria<Sqwr05> {

	public static final String TABLE_NAME  = "sqwr05";

	public Sqwr05Criteria() {
		super(Sqwr05.class);
	}

	public Sqwr05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr05.class);
	}

	public void save(Sqwr05 sqwr05) throws MarsException {
		super.save(sqwr05);
	}

	public void update(Sqwr05 sqwr05) throws MarsException {
		super.update(sqwr05);
	}

	public void delete(Sqwr05 sqwr05) throws MarsException {
		super.delete(sqwr05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}