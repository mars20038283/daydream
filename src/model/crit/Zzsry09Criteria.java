package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry09;

public class Zzsry09Criteria extends SqlCriteria<Zzsry09> {

	public static final String TABLE_NAME  = "zzsry09";

	public Zzsry09Criteria() {
		super(Zzsry09.class);
	}

	public Zzsry09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry09.class);
	}

	public void save(Zzsry09 zzsry09) throws MarsException {
		super.save(zzsry09);
	}

	public void update(Zzsry09 zzsry09) throws MarsException {
		super.update(zzsry09);
	}

	public void delete(Zzsry09 zzsry09) throws MarsException {
		super.delete(zzsry09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}