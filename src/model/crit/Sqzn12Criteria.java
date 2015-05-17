package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn12;

public class Sqzn12Criteria extends SqlCriteria<Sqzn12> {

	public static final String TABLE_NAME  = "sqzn12";

	public Sqzn12Criteria() {
		super(Sqzn12.class);
	}

	public Sqzn12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn12.class);
	}

	public void save(Sqzn12 sqzn12) throws MarsException {
		super.save(sqzn12);
	}

	public void update(Sqzn12 sqzn12) throws MarsException {
		super.update(sqzn12);
	}

	public void delete(Sqzn12 sqzn12) throws MarsException {
		super.delete(sqzn12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}