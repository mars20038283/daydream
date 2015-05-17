package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj06;

public class Dlj06Criteria extends SqlCriteria<Dlj06> {

	public static final String TABLE_NAME  = "dlj06";

	public Dlj06Criteria() {
		super(Dlj06.class);
	}

	public Dlj06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj06.class);
	}

	public void save(Dlj06 dlj06) throws MarsException {
		super.save(dlj06);
	}

	public void update(Dlj06 dlj06) throws MarsException {
		super.update(dlj06);
	}

	public void delete(Dlj06 dlj06) throws MarsException {
		super.delete(dlj06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}