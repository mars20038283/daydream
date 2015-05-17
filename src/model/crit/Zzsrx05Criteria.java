package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx05;

public class Zzsrx05Criteria extends SqlCriteria<Zzsrx05> {

	public static final String TABLE_NAME  = "zzsrx05";

	public Zzsrx05Criteria() {
		super(Zzsrx05.class);
	}

	public Zzsrx05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx05.class);
	}

	public void save(Zzsrx05 zzsrx05) throws MarsException {
		super.save(zzsrx05);
	}

	public void update(Zzsrx05 zzsrx05) throws MarsException {
		super.update(zzsrx05);
	}

	public void delete(Zzsrx05 zzsrx05) throws MarsException {
		super.delete(zzsrx05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}