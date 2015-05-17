package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm09;

public class Zzrm09Criteria extends SqlCriteria<Zzrm09> {

	public static final String TABLE_NAME  = "zzrm09";

	public Zzrm09Criteria() {
		super(Zzrm09.class);
	}

	public Zzrm09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm09.class);
	}

	public void save(Zzrm09 zzrm09) throws MarsException {
		super.save(zzrm09);
	}

	public void update(Zzrm09 zzrm09) throws MarsException {
		super.update(zzrm09);
	}

	public void delete(Zzrm09 zzrm09) throws MarsException {
		super.delete(zzrm09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}