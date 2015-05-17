package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme05;

public class Zzme05Criteria extends SqlCriteria<Zzme05> {

	public static final String TABLE_NAME  = "zzme05";

	public Zzme05Criteria() {
		super(Zzme05.class);
	}

	public Zzme05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme05.class);
	}

	public void save(Zzme05 zzme05) throws MarsException {
		super.save(zzme05);
	}

	public void update(Zzme05 zzme05) throws MarsException {
		super.update(zzme05);
	}

	public void delete(Zzme05 zzme05) throws MarsException {
		super.delete(zzme05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}