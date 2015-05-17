package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry05;

public class Zzsry05Criteria extends SqlCriteria<Zzsry05> {

	public static final String TABLE_NAME  = "zzsry05";

	public Zzsry05Criteria() {
		super(Zzsry05.class);
	}

	public Zzsry05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry05.class);
	}

	public void save(Zzsry05 zzsry05) throws MarsException {
		super.save(zzsry05);
	}

	public void update(Zzsry05 zzsry05) throws MarsException {
		super.update(zzsry05);
	}

	public void delete(Zzsry05 zzsry05) throws MarsException {
		super.delete(zzsry05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}