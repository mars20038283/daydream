package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn03;

public class Sqzn03Criteria extends SqlCriteria<Sqzn03> {

	public static final String TABLE_NAME  = "sqzn03";

	public Sqzn03Criteria() {
		super(Sqzn03.class);
	}

	public Sqzn03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn03.class);
	}

	public void save(Sqzn03 sqzn03) throws MarsException {
		super.save(sqzn03);
	}

	public void update(Sqzn03 sqzn03) throws MarsException {
		super.update(sqzn03);
	}

	public void delete(Sqzn03 sqzn03) throws MarsException {
		super.delete(sqzn03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}