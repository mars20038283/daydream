package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx11;

public class Zzsrx11Criteria extends SqlCriteria<Zzsrx11> {

	public static final String TABLE_NAME  = "zzsrx11";

	public Zzsrx11Criteria() {
		super(Zzsrx11.class);
	}

	public Zzsrx11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx11.class);
	}

	public void save(Zzsrx11 zzsrx11) throws MarsException {
		super.save(zzsrx11);
	}

	public void update(Zzsrx11 zzsrx11) throws MarsException {
		super.update(zzsrx11);
	}

	public void delete(Zzsrx11 zzsrx11) throws MarsException {
		super.delete(zzsrx11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}