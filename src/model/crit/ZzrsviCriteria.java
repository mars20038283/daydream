package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrsvi;

public class ZzrsviCriteria extends SqlCriteria<Zzrsvi> {

	public static final String TABLE_NAME  = "zzrsvi";

	public ZzrsviCriteria() {
		super(Zzrsvi.class);
	}

	public ZzrsviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrsvi.class);
	}

	public void save(Zzrsvi zzrsvi) throws MarsException {
		super.save(zzrsvi);
	}

	public void update(Zzrsvi zzrsvi) throws MarsException {
		super.update(zzrsvi);
	}

	public void delete(Zzrsvi zzrsvi) throws MarsException {
		super.delete(zzrsvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrsviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrsviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrsviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrsviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrsviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrsviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrsviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrsviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrsviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrsviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrsviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrsviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrsviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrsviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrsviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}