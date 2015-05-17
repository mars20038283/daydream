package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx07;

public class Zzsrx07Criteria extends SqlCriteria<Zzsrx07> {

	public static final String TABLE_NAME  = "zzsrx07";

	public Zzsrx07Criteria() {
		super(Zzsrx07.class);
	}

	public Zzsrx07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx07.class);
	}

	public void save(Zzsrx07 zzsrx07) throws MarsException {
		super.save(zzsrx07);
	}

	public void update(Zzsrx07 zzsrx07) throws MarsException {
		super.update(zzsrx07);
	}

	public void delete(Zzsrx07 zzsrx07) throws MarsException {
		super.delete(zzsrx07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}