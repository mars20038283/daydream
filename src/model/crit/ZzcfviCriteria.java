package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcfvi;

public class ZzcfviCriteria extends SqlCriteria<Zzcfvi> {

	public static final String TABLE_NAME  = "zzcfvi";

	public ZzcfviCriteria() {
		super(Zzcfvi.class);
	}

	public ZzcfviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcfvi.class);
	}

	public void save(Zzcfvi zzcfvi) throws MarsException {
		super.save(zzcfvi);
	}

	public void update(Zzcfvi zzcfvi) throws MarsException {
		super.update(zzcfvi);
	}

	public void delete(Zzcfvi zzcfvi) throws MarsException {
		super.delete(zzcfvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzcfviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzcfviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzcfviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzcfviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzcfviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzcfviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzcfviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzcfviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzcfviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzcfviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzcfviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzcfviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzcfviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzcfviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzcfviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}