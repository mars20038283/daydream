package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf01;

public class Zzcf01Criteria extends SqlCriteria<Zzcf01> {

	public static final String TABLE_NAME  = "zzcf01";

	public Zzcf01Criteria() {
		super(Zzcf01.class);
	}

	public Zzcf01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf01.class);
	}

	public void save(Zzcf01 zzcf01) throws MarsException {
		super.save(zzcf01);
	}

	public void update(Zzcf01 zzcf01) throws MarsException {
		super.update(zzcf01);
	}

	public void delete(Zzcf01 zzcf01) throws MarsException {
		super.delete(zzcf01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}