package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrvi;

public class ZzsrviCriteria extends SqlCriteria<Zzsrvi> {

	public static final String TABLE_NAME  = "zzsrvi";

	public ZzsrviCriteria() {
		super(Zzsrvi.class);
	}

	public ZzsrviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrvi.class);
	}

	public void save(Zzsrvi zzsrvi) throws MarsException {
		super.save(zzsrvi);
	}

	public void update(Zzsrvi zzsrvi) throws MarsException {
		super.update(zzsrvi);
	}

	public void delete(Zzsrvi zzsrvi) throws MarsException {
		super.delete(zzsrvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzsrviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzsrviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzsrviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzsrviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzsrviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzsrviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzsrviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzsrviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzsrviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzsrviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzsrviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzsrviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzsrviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzsrviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzsrviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}