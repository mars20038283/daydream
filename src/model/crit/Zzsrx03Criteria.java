package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrx03;

public class Zzsrx03Criteria extends SqlCriteria<Zzsrx03> {

	public static final String TABLE_NAME  = "zzsrx03";

	public Zzsrx03Criteria() {
		super(Zzsrx03.class);
	}

	public Zzsrx03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrx03.class);
	}

	public void save(Zzsrx03 zzsrx03) throws MarsException {
		super.save(zzsrx03);
	}

	public void update(Zzsrx03 zzsrx03) throws MarsException {
		super.update(zzsrx03);
	}

	public void delete(Zzsrx03 zzsrx03) throws MarsException {
		super.delete(zzsrx03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsrx03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsrx03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsrx03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsrx03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsrx03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsrx03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsrx03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsrx03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsrx03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsrx03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsrx03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsrx03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsrx03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsrx03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsrx03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}