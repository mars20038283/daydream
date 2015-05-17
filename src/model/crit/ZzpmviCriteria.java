package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpmvi;

public class ZzpmviCriteria extends SqlCriteria<Zzpmvi> {

	public static final String TABLE_NAME  = "zzpmvi";

	public ZzpmviCriteria() {
		super(Zzpmvi.class);
	}

	public ZzpmviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpmvi.class);
	}

	public void save(Zzpmvi zzpmvi) throws MarsException {
		super.save(zzpmvi);
	}

	public void update(Zzpmvi zzpmvi) throws MarsException {
		super.update(zzpmvi);
	}

	public void delete(Zzpmvi zzpmvi) throws MarsException {
		super.delete(zzpmvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzpmviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzpmviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzpmviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzpmviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzpmviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzpmviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzpmviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzpmviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzpmviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzpmviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzpmviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzpmviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzpmviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzpmviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzpmviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}