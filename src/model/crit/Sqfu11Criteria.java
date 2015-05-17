package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu11;

public class Sqfu11Criteria extends SqlCriteria<Sqfu11> {

	public static final String TABLE_NAME  = "sqfu11";

	public Sqfu11Criteria() {
		super(Sqfu11.class);
	}

	public Sqfu11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu11.class);
	}

	public void save(Sqfu11 sqfu11) throws MarsException {
		super.save(sqfu11);
	}

	public void update(Sqfu11 sqfu11) throws MarsException {
		super.update(sqfu11);
	}

	public void delete(Sqfu11 sqfu11) throws MarsException {
		super.delete(sqfu11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}