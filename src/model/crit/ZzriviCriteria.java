package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrivi;

public class ZzriviCriteria extends SqlCriteria<Zzrivi> {

	public static final String TABLE_NAME  = "zzrivi";

	public ZzriviCriteria() {
		super(Zzrivi.class);
	}

	public ZzriviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrivi.class);
	}

	public void save(Zzrivi zzrivi) throws MarsException {
		super.save(zzrivi);
	}

	public void update(Zzrivi zzrivi) throws MarsException {
		super.update(zzrivi);
	}

	public void delete(Zzrivi zzrivi) throws MarsException {
		super.delete(zzrivi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzriviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzriviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzriviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzriviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzriviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzriviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzriviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzriviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzriviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzriviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzriviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzriviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzriviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzriviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzriviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}