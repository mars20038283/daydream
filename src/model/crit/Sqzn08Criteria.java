package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn08;

public class Sqzn08Criteria extends SqlCriteria<Sqzn08> {

	public static final String TABLE_NAME  = "sqzn08";

	public Sqzn08Criteria() {
		super(Sqzn08.class);
	}

	public Sqzn08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn08.class);
	}

	public void save(Sqzn08 sqzn08) throws MarsException {
		super.save(sqzn08);
	}

	public void update(Sqzn08 sqzn08) throws MarsException {
		super.update(sqzn08);
	}

	public void delete(Sqzn08 sqzn08) throws MarsException {
		super.delete(sqzn08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}