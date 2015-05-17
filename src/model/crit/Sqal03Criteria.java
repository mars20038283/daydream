package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal03;

public class Sqal03Criteria extends SqlCriteria<Sqal03> {

	public static final String TABLE_NAME  = "sqal03";

	public Sqal03Criteria() {
		super(Sqal03.class);
	}

	public Sqal03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal03.class);
	}

	public void save(Sqal03 sqal03) throws MarsException {
		super.save(sqal03);
	}

	public void update(Sqal03 sqal03) throws MarsException {
		super.update(sqal03);
	}

	public void delete(Sqal03 sqal03) throws MarsException {
		super.delete(sqal03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}