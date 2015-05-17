package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag11;

public class Sqag11Criteria extends SqlCriteria<Sqag11> {

	public static final String TABLE_NAME  = "sqag11";

	public Sqag11Criteria() {
		super(Sqag11.class);
	}

	public Sqag11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag11.class);
	}

	public void save(Sqag11 sqag11) throws MarsException {
		super.save(sqag11);
	}

	public void update(Sqag11 sqag11) throws MarsException {
		super.update(sqag11);
	}

	public void delete(Sqag11 sqag11) throws MarsException {
		super.delete(sqag11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}