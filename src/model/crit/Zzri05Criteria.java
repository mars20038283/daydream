package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri05;

public class Zzri05Criteria extends SqlCriteria<Zzri05> {

	public static final String TABLE_NAME  = "zzri05";

	public Zzri05Criteria() {
		super(Zzri05.class);
	}

	public Zzri05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri05.class);
	}

	public void save(Zzri05 zzri05) throws MarsException {
		super.save(zzri05);
	}

	public void update(Zzri05 zzri05) throws MarsException {
		super.update(zzri05);
	}

	public void delete(Zzri05 zzri05) throws MarsException {
		super.delete(zzri05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}