package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn02;

public class Sqzn02Criteria extends SqlCriteria<Sqzn02> {

	public static final String TABLE_NAME  = "sqzn02";

	public Sqzn02Criteria() {
		super(Sqzn02.class);
	}

	public Sqzn02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn02.class);
	}

	public void save(Sqzn02 sqzn02) throws MarsException {
		super.save(sqzn02);
	}

	public void update(Sqzn02 sqzn02) throws MarsException {
		super.update(sqzn02);
	}

	public void delete(Sqzn02 sqzn02) throws MarsException {
		super.delete(sqzn02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}