package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta02;

public class Zzta02Criteria extends SqlCriteria<Zzta02> {

	public static final String TABLE_NAME  = "zzta02";

	public Zzta02Criteria() {
		super(Zzta02.class);
	}

	public Zzta02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta02.class);
	}

	public void save(Zzta02 zzta02) throws MarsException {
		super.save(zzta02);
	}

	public void update(Zzta02 zzta02) throws MarsException {
		super.update(zzta02);
	}

	public void delete(Zzta02 zzta02) throws MarsException {
		super.delete(zzta02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}