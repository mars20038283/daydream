package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu03;

public class Sqfu03Criteria extends SqlCriteria<Sqfu03> {

	public static final String TABLE_NAME  = "sqfu03";

	public Sqfu03Criteria() {
		super(Sqfu03.class);
	}

	public Sqfu03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu03.class);
	}

	public void save(Sqfu03 sqfu03) throws MarsException {
		super.save(sqfu03);
	}

	public void update(Sqfu03 sqfu03) throws MarsException {
		super.update(sqfu03);
	}

	public void delete(Sqfu03 sqfu03) throws MarsException {
		super.delete(sqfu03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}