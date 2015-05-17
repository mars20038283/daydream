package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme01;

public class Zzme01Criteria extends SqlCriteria<Zzme01> {

	public static final String TABLE_NAME  = "zzme01";

	public Zzme01Criteria() {
		super(Zzme01.class);
	}

	public Zzme01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme01.class);
	}

	public void save(Zzme01 zzme01) throws MarsException {
		super.save(zzme01);
	}

	public void update(Zzme01 zzme01) throws MarsException {
		super.update(zzme01);
	}

	public void delete(Zzme01 zzme01) throws MarsException {
		super.delete(zzme01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}