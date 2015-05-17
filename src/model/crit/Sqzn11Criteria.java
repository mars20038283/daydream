package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn11;

public class Sqzn11Criteria extends SqlCriteria<Sqzn11> {

	public static final String TABLE_NAME  = "sqzn11";

	public Sqzn11Criteria() {
		super(Sqzn11.class);
	}

	public Sqzn11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn11.class);
	}

	public void save(Sqzn11 sqzn11) throws MarsException {
		super.save(sqzn11);
	}

	public void update(Sqzn11 sqzn11) throws MarsException {
		super.update(sqzn11);
	}

	public void delete(Sqzn11 sqzn11) throws MarsException {
		super.delete(sqzn11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}