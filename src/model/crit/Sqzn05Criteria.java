package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn05;

public class Sqzn05Criteria extends SqlCriteria<Sqzn05> {

	public static final String TABLE_NAME  = "sqzn05";

	public Sqzn05Criteria() {
		super(Sqzn05.class);
	}

	public Sqzn05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn05.class);
	}

	public void save(Sqzn05 sqzn05) throws MarsException {
		super.save(sqzn05);
	}

	public void update(Sqzn05 sqzn05) throws MarsException {
		super.update(sqzn05);
	}

	public void delete(Sqzn05 sqzn05) throws MarsException {
		super.delete(sqzn05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}