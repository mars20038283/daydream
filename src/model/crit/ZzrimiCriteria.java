package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrimi;

public class ZzrimiCriteria extends SqlCriteria<Zzrimi> {

	public static final String TABLE_NAME  = "zzrimi";

	public ZzrimiCriteria() {
		super(Zzrimi.class);
	}

	public ZzrimiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrimi.class);
	}

	public void save(Zzrimi zzrimi) throws MarsException {
		super.save(zzrimi);
	}

	public void update(Zzrimi zzrimi) throws MarsException {
		super.update(zzrimi);
	}

	public void delete(Zzrimi zzrimi) throws MarsException {
		super.delete(zzrimi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrimiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrimiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrimiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrimiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrimiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrimiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrimiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrimiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrimiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrimiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrimiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrimiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrimiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrimiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrimiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}