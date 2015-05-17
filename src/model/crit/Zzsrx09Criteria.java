package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx09;

public class Zzsrx09Criteria extends SqlCriteria<Zzsrx09> {

	public static final String TABLE_NAME  = "zzsrx09";

	public Zzsrx09Criteria() {
		super(Zzsrx09.class);
	}

	public Zzsrx09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx09.class);
	}

	public void save(Zzsrx09 zzsrx09) throws MarsException {
		super.save(zzsrx09);
	}

	public void update(Zzsrx09 zzsrx09) throws MarsException {
		super.update(zzsrx09);
	}

	public void delete(Zzsrx09 zzsrx09) throws MarsException {
		super.delete(zzsrx09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}