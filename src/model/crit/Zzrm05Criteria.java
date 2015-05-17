package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm05;

public class Zzrm05Criteria extends SqlCriteria<Zzrm05> {

	public static final String TABLE_NAME  = "zzrm05";

	public Zzrm05Criteria() {
		super(Zzrm05.class);
	}

	public Zzrm05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm05.class);
	}

	public void save(Zzrm05 zzrm05) throws MarsException {
		super.save(zzrm05);
	}

	public void update(Zzrm05 zzrm05) throws MarsException {
		super.update(zzrm05);
	}

	public void delete(Zzrm05 zzrm05) throws MarsException {
		super.delete(zzrm05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}