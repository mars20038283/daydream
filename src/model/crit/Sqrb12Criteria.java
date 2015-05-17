package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb12;

public class Sqrb12Criteria extends SqlCriteria<Sqrb12> {

	public static final String TABLE_NAME  = "sqrb12";

	public Sqrb12Criteria() {
		super(Sqrb12.class);
	}

	public Sqrb12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb12.class);
	}

	public void save(Sqrb12 sqrb12) throws MarsException {
		super.save(sqrb12);
	}

	public void update(Sqrb12 sqrb12) throws MarsException {
		super.update(sqrb12);
	}

	public void delete(Sqrb12 sqrb12) throws MarsException {
		super.delete(sqrb12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}