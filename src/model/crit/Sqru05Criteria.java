package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru05;

public class Sqru05Criteria extends SqlCriteria<Sqru05> {

	public static final String TABLE_NAME  = "sqru05";

	public Sqru05Criteria() {
		super(Sqru05.class);
	}

	public Sqru05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru05.class);
	}

	public void save(Sqru05 sqru05) throws MarsException {
		super.save(sqru05);
	}

	public void update(Sqru05 sqru05) throws MarsException {
		super.update(sqru05);
	}

	public void delete(Sqru05 sqru05) throws MarsException {
		super.delete(sqru05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}