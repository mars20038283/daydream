package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfgvi;

public class ZzfgviCriteria extends SqlCriteria<Zzfgvi> {

	public static final String TABLE_NAME  = "zzfgvi";

	public ZzfgviCriteria() {
		super(Zzfgvi.class);
	}

	public ZzfgviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfgvi.class);
	}

	public void save(Zzfgvi zzfgvi) throws MarsException {
		super.save(zzfgvi);
	}

	public void update(Zzfgvi zzfgvi) throws MarsException {
		super.update(zzfgvi);
	}

	public void delete(Zzfgvi zzfgvi) throws MarsException {
		super.delete(zzfgvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzfgviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzfgviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzfgviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzfgviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzfgviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzfgviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzfgviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzfgviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzfgviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzfgviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzfgviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzfgviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzfgviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzfgviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzfgviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}