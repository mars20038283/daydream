package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn09;

public class Sqzn09Criteria extends SqlCriteria<Sqzn09> {

	public static final String TABLE_NAME  = "sqzn09";

	public Sqzn09Criteria() {
		super(Sqzn09.class);
	}

	public Sqzn09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn09.class);
	}

	public void save(Sqzn09 sqzn09) throws MarsException {
		super.save(sqzn09);
	}

	public void update(Sqzn09 sqzn09) throws MarsException {
		super.update(sqzn09);
	}

	public void delete(Sqzn09 sqzn09) throws MarsException {
		super.delete(sqzn09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}