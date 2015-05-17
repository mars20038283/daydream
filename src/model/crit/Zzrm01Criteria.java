package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm01;

public class Zzrm01Criteria extends SqlCriteria<Zzrm01> {

	public static final String TABLE_NAME  = "zzrm01";

	public Zzrm01Criteria() {
		super(Zzrm01.class);
	}

	public Zzrm01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm01.class);
	}

	public void save(Zzrm01 zzrm01) throws MarsException {
		super.save(zzrm01);
	}

	public void update(Zzrm01 zzrm01) throws MarsException {
		super.update(zzrm01);
	}

	public void delete(Zzrm01 zzrm01) throws MarsException {
		super.delete(zzrm01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}