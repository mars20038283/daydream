package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry11;

public class Zzsry11Criteria extends SqlCriteria<Zzsry11> {

	public static final String TABLE_NAME  = "zzsry11";

	public Zzsry11Criteria() {
		super(Zzsry11.class);
	}

	public Zzsry11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry11.class);
	}

	public void save(Zzsry11 zzsry11) throws MarsException {
		super.save(zzsry11);
	}

	public void update(Zzsry11 zzsry11) throws MarsException {
		super.update(zzsry11);
	}

	public void delete(Zzsry11 zzsry11) throws MarsException {
		super.delete(zzsry11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}