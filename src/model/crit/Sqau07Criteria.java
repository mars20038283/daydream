package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau07;

public class Sqau07Criteria extends SqlCriteria<Sqau07> {

	public static final String TABLE_NAME  = "sqau07";

	public Sqau07Criteria() {
		super(Sqau07.class);
	}

	public Sqau07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau07.class);
	}

	public void save(Sqau07 sqau07) throws MarsException {
		super.save(sqau07);
	}

	public void update(Sqau07 sqau07) throws MarsException {
		super.update(sqau07);
	}

	public void delete(Sqau07 sqau07) throws MarsException {
		super.delete(sqau07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}