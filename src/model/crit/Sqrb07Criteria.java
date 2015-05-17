package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb07;

public class Sqrb07Criteria extends SqlCriteria<Sqrb07> {

	public static final String TABLE_NAME  = "sqrb07";

	public Sqrb07Criteria() {
		super(Sqrb07.class);
	}

	public Sqrb07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb07.class);
	}

	public void save(Sqrb07 sqrb07) throws MarsException {
		super.save(sqrb07);
	}

	public void update(Sqrb07 sqrb07) throws MarsException {
		super.update(sqrb07);
	}

	public void delete(Sqrb07 sqrb07) throws MarsException {
		super.delete(sqrb07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}