package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm11;

public class Zzrm11Criteria extends SqlCriteria<Zzrm11> {

	public static final String TABLE_NAME  = "zzrm11";

	public Zzrm11Criteria() {
		super(Zzrm11.class);
	}

	public Zzrm11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm11.class);
	}

	public void save(Zzrm11 zzrm11) throws MarsException {
		super.save(zzrm11);
	}

	public void update(Zzrm11 zzrm11) throws MarsException {
		super.update(zzrm11);
	}

	public void delete(Zzrm11 zzrm11) throws MarsException {
		super.delete(zzrm11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}