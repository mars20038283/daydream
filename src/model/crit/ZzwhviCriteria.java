package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhvi;

public class ZzwhviCriteria extends SqlCriteria<Zzwhvi> {

	public static final String TABLE_NAME  = "zzwhvi";

	public ZzwhviCriteria() {
		super(Zzwhvi.class);
	}

	public ZzwhviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhvi.class);
	}

	public void save(Zzwhvi zzwhvi) throws MarsException {
		super.save(zzwhvi);
	}

	public void update(Zzwhvi zzwhvi) throws MarsException {
		super.update(zzwhvi);
	}

	public void delete(Zzwhvi zzwhvi) throws MarsException {
		super.delete(zzwhvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzwhviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzwhviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzwhviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzwhviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzwhviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzwhviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzwhviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzwhviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzwhviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzwhviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzwhviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzwhviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzwhviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzwhviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzwhviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}