package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm07;

public class Zzrm07Criteria extends SqlCriteria<Zzrm07> {

	public static final String TABLE_NAME  = "zzrm07";

	public Zzrm07Criteria() {
		super(Zzrm07.class);
	}

	public Zzrm07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm07.class);
	}

	public void save(Zzrm07 zzrm07) throws MarsException {
		super.save(zzrm07);
	}

	public void update(Zzrm07 zzrm07) throws MarsException {
		super.update(zzrm07);
	}

	public void delete(Zzrm07 zzrm07) throws MarsException {
		super.delete(zzrm07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}