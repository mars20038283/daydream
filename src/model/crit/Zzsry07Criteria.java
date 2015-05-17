package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry07;

public class Zzsry07Criteria extends SqlCriteria<Zzsry07> {

	public static final String TABLE_NAME  = "zzsry07";

	public Zzsry07Criteria() {
		super(Zzsry07.class);
	}

	public Zzsry07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry07.class);
	}

	public void save(Zzsry07 zzsry07) throws MarsException {
		super.save(zzsry07);
	}

	public void update(Zzsry07 zzsry07) throws MarsException {
		super.update(zzsry07);
	}

	public void delete(Zzsry07 zzsry07) throws MarsException {
		super.delete(zzsry07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}