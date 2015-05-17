package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn07;

public class Sqzn07Criteria extends SqlCriteria<Sqzn07> {

	public static final String TABLE_NAME  = "sqzn07";

	public Sqzn07Criteria() {
		super(Sqzn07.class);
	}

	public Sqzn07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn07.class);
	}

	public void save(Sqzn07 sqzn07) throws MarsException {
		super.save(sqzn07);
	}

	public void update(Sqzn07 sqzn07) throws MarsException {
		super.update(sqzn07);
	}

	public void delete(Sqzn07 sqzn07) throws MarsException {
		super.delete(sqzn07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}