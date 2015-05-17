package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx01;

public class Zzsrx01Criteria extends SqlCriteria<Zzsrx01> {

	public static final String TABLE_NAME  = "zzsrx01";

	public Zzsrx01Criteria() {
		super(Zzsrx01.class);
	}

	public Zzsrx01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx01.class);
	}

	public void save(Zzsrx01 zzsrx01) throws MarsException {
		super.save(zzsrx01);
	}

	public void update(Zzsrx01 zzsrx01) throws MarsException {
		super.update(zzsrx01);
	}

	public void delete(Zzsrx01 zzsrx01) throws MarsException {
		super.delete(zzsrx01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}