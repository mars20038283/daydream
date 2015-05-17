package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta05;

public class Zzta05Criteria extends SqlCriteria<Zzta05> {

	public static final String TABLE_NAME  = "zzta05";

	public Zzta05Criteria() {
		super(Zzta05.class);
	}

	public Zzta05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta05.class);
	}

	public void save(Zzta05 zzta05) throws MarsException {
		super.save(zzta05);
	}

	public void update(Zzta05 zzta05) throws MarsException {
		super.update(zzta05);
	}

	public void delete(Zzta05 zzta05) throws MarsException {
		super.delete(zzta05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}