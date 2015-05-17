package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb11;

public class Sqrb11Criteria extends SqlCriteria<Sqrb11> {

	public static final String TABLE_NAME  = "sqrb11";

	public Sqrb11Criteria() {
		super(Sqrb11.class);
	}

	public Sqrb11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb11.class);
	}

	public void save(Sqrb11 sqrb11) throws MarsException {
		super.save(sqrb11);
	}

	public void update(Sqrb11 sqrb11) throws MarsException {
		super.update(sqrb11);
	}

	public void delete(Sqrb11 sqrb11) throws MarsException {
		super.delete(sqrb11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}