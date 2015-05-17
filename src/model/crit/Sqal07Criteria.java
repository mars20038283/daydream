package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal07;

public class Sqal07Criteria extends SqlCriteria<Sqal07> {

	public static final String TABLE_NAME  = "sqal07";

	public Sqal07Criteria() {
		super(Sqal07.class);
	}

	public Sqal07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal07.class);
	}

	public void save(Sqal07 sqal07) throws MarsException {
		super.save(sqal07);
	}

	public void update(Sqal07 sqal07) throws MarsException {
		super.update(sqal07);
	}

	public void delete(Sqal07 sqal07) throws MarsException {
		super.delete(sqal07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}