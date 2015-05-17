package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr04;

public class Sqwr04Criteria extends SqlCriteria<Sqwr04> {

	public static final String TABLE_NAME  = "sqwr04";

	public Sqwr04Criteria() {
		super(Sqwr04.class);
	}

	public Sqwr04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr04.class);
	}

	public void save(Sqwr04 sqwr04) throws MarsException {
		super.save(sqwr04);
	}

	public void update(Sqwr04 sqwr04) throws MarsException {
		super.update(sqwr04);
	}

	public void delete(Sqwr04 sqwr04) throws MarsException {
		super.delete(sqwr04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}