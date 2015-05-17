package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr07;

public class Sqwr07Criteria extends SqlCriteria<Sqwr07> {

	public static final String TABLE_NAME  = "sqwr07";

	public Sqwr07Criteria() {
		super(Sqwr07.class);
	}

	public Sqwr07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr07.class);
	}

	public void save(Sqwr07 sqwr07) throws MarsException {
		super.save(sqwr07);
	}

	public void update(Sqwr07 sqwr07) throws MarsException {
		super.update(sqwr07);
	}

	public void delete(Sqwr07 sqwr07) throws MarsException {
		super.delete(sqwr07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}