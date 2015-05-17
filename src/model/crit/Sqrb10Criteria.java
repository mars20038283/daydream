package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb10;

public class Sqrb10Criteria extends SqlCriteria<Sqrb10> {

	public static final String TABLE_NAME  = "sqrb10";

	public Sqrb10Criteria() {
		super(Sqrb10.class);
	}

	public Sqrb10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb10.class);
	}

	public void save(Sqrb10 sqrb10) throws MarsException {
		super.save(sqrb10);
	}

	public void update(Sqrb10 sqrb10) throws MarsException {
		super.update(sqrb10);
	}

	public void delete(Sqrb10 sqrb10) throws MarsException {
		super.delete(sqrb10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}