package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr08;

public class Sqwr08Criteria extends SqlCriteria<Sqwr08> {

	public static final String TABLE_NAME  = "sqwr08";

	public Sqwr08Criteria() {
		super(Sqwr08.class);
	}

	public Sqwr08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr08.class);
	}

	public void save(Sqwr08 sqwr08) throws MarsException {
		super.save(sqwr08);
	}

	public void update(Sqwr08 sqwr08) throws MarsException {
		super.update(sqwr08);
	}

	public void delete(Sqwr08 sqwr08) throws MarsException {
		super.delete(sqwr08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}