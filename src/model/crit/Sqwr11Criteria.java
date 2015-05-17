package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr11;

public class Sqwr11Criteria extends SqlCriteria<Sqwr11> {

	public static final String TABLE_NAME  = "sqwr11";

	public Sqwr11Criteria() {
		super(Sqwr11.class);
	}

	public Sqwr11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr11.class);
	}

	public void save(Sqwr11 sqwr11) throws MarsException {
		super.save(sqwr11);
	}

	public void update(Sqwr11 sqwr11) throws MarsException {
		super.update(sqwr11);
	}

	public void delete(Sqwr11 sqwr11) throws MarsException {
		super.delete(sqwr11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}