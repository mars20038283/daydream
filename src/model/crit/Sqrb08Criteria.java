package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb08;

public class Sqrb08Criteria extends SqlCriteria<Sqrb08> {

	public static final String TABLE_NAME  = "sqrb08";

	public Sqrb08Criteria() {
		super(Sqrb08.class);
	}

	public Sqrb08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb08.class);
	}

	public void save(Sqrb08 sqrb08) throws MarsException {
		super.save(sqrb08);
	}

	public void update(Sqrb08 sqrb08) throws MarsException {
		super.update(sqrb08);
	}

	public void delete(Sqrb08 sqrb08) throws MarsException {
		super.delete(sqrb08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}