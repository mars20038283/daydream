package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme02;

public class Zzme02Criteria extends SqlCriteria<Zzme02> {

	public static final String TABLE_NAME  = "zzme02";

	public Zzme02Criteria() {
		super(Zzme02.class);
	}

	public Zzme02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme02.class);
	}

	public void save(Zzme02 zzme02) throws MarsException {
		super.save(zzme02);
	}

	public void update(Zzme02 zzme02) throws MarsException {
		super.update(zzme02);
	}

	public void delete(Zzme02 zzme02) throws MarsException {
		super.delete(zzme02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}