package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay09;

public class Dlay09Criteria extends SqlCriteria<Dlay09> {

	public static final String TABLE_NAME  = "dlay09";

	public Dlay09Criteria() {
		super(Dlay09.class);
	}

	public Dlay09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay09.class);
	}

	public void save(Dlay09 dlay09) throws MarsException {
		super.save(dlay09);
	}

	public void update(Dlay09 dlay09) throws MarsException {
		super.update(dlay09);
	}

	public void delete(Dlay09 dlay09) throws MarsException {
		super.delete(dlay09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}