package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn10;

public class Sqzn10Criteria extends SqlCriteria<Sqzn10> {

	public static final String TABLE_NAME  = "sqzn10";

	public Sqzn10Criteria() {
		super(Sqzn10.class);
	}

	public Sqzn10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn10.class);
	}

	public void save(Sqzn10 sqzn10) throws MarsException {
		super.save(sqzn10);
	}

	public void update(Sqzn10 sqzn10) throws MarsException {
		super.update(sqzn10);
	}

	public void delete(Sqzn10 sqzn10) throws MarsException {
		super.delete(sqzn10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}