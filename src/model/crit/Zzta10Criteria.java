package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta10;

public class Zzta10Criteria extends SqlCriteria<Zzta10> {

	public static final String TABLE_NAME  = "zzta10";

	public Zzta10Criteria() {
		super(Zzta10.class);
	}

	public Zzta10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta10.class);
	}

	public void save(Zzta10 zzta10) throws MarsException {
		super.save(zzta10);
	}

	public void update(Zzta10 zzta10) throws MarsException {
		super.update(zzta10);
	}

	public void delete(Zzta10 zzta10) throws MarsException {
		super.delete(zzta10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}