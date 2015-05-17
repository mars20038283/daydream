package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal10;

public class Sqal10Criteria extends SqlCriteria<Sqal10> {

	public static final String TABLE_NAME  = "sqal10";

	public Sqal10Criteria() {
		super(Sqal10.class);
	}

	public Sqal10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal10.class);
	}

	public void save(Sqal10 sqal10) throws MarsException {
		super.save(sqal10);
	}

	public void update(Sqal10 sqal10) throws MarsException {
		super.update(sqal10);
	}

	public void delete(Sqal10 sqal10) throws MarsException {
		super.delete(sqal10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}