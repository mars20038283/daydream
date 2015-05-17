package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsry03;

public class Zzsry03Criteria extends SqlCriteria<Zzsry03> {

	public static final String TABLE_NAME  = "zzsry03";

	public Zzsry03Criteria() {
		super(Zzsry03.class);
	}

	public Zzsry03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsry03.class);
	}

	public void save(Zzsry03 zzsry03) throws MarsException {
		super.save(zzsry03);
	}

	public void update(Zzsry03 zzsry03) throws MarsException {
		super.update(zzsry03);
	}

	public void delete(Zzsry03 zzsry03) throws MarsException {
		super.delete(zzsry03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzsry03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzsry03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzsry03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzsry03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzsry03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzsry03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzsry03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzsry03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzsry03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzsry03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzsry03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzsry03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzsry03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzsry03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzsry03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}