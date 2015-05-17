package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau10;

public class Sqau10Criteria extends SqlCriteria<Sqau10> {

	public static final String TABLE_NAME  = "sqau10";

	public Sqau10Criteria() {
		super(Sqau10.class);
	}

	public Sqau10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau10.class);
	}

	public void save(Sqau10 sqau10) throws MarsException {
		super.save(sqau10);
	}

	public void update(Sqau10 sqau10) throws MarsException {
		super.update(sqau10);
	}

	public void delete(Sqau10 sqau10) throws MarsException {
		super.delete(sqau10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}