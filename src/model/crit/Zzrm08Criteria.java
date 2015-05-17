package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm08;

public class Zzrm08Criteria extends SqlCriteria<Zzrm08> {

	public static final String TABLE_NAME  = "zzrm08";

	public Zzrm08Criteria() {
		super(Zzrm08.class);
	}

	public Zzrm08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm08.class);
	}

	public void save(Zzrm08 zzrm08) throws MarsException {
		super.save(zzrm08);
	}

	public void update(Zzrm08 zzrm08) throws MarsException {
		super.update(zzrm08);
	}

	public void delete(Zzrm08 zzrm08) throws MarsException {
		super.delete(zzrm08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}