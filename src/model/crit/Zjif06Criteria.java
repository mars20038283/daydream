package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif06;

public class Zjif06Criteria extends SqlCriteria<Zjif06> {

	public static final String TABLE_NAME  = "zjif06";

	public Zjif06Criteria() {
		super(Zjif06.class);
	}

	public Zjif06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif06.class);
	}

	public void save(Zjif06 zjif06) throws MarsException {
		super.save(zjif06);
	}

	public void update(Zjif06 zjif06) throws MarsException {
		super.update(zjif06);
	}

	public void delete(Zjif06 zjif06) throws MarsException {
		super.delete(zjif06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}