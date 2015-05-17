package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrmvi;

public class ZzrmviCriteria extends SqlCriteria<Zzrmvi> {

	public static final String TABLE_NAME  = "zzrmvi";

	public ZzrmviCriteria() {
		super(Zzrmvi.class);
	}

	public ZzrmviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrmvi.class);
	}

	public void save(Zzrmvi zzrmvi) throws MarsException {
		super.save(zzrmvi);
	}

	public void update(Zzrmvi zzrmvi) throws MarsException {
		super.update(zzrmvi);
	}

	public void delete(Zzrmvi zzrmvi) throws MarsException {
		super.delete(zzrmvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrmviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrmviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrmviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrmviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrmviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrmviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrmviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrmviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrmviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrmviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrmviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrmviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrmviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrmviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrmviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}