package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zztapi;

public class ZztapiCriteria extends SqlCriteria<Zztapi> {

	public static final String TABLE_NAME  = "zztapi";

	public ZztapiCriteria() {
		super(Zztapi.class);
	}

	public ZztapiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zztapi.class);
	}

	public void save(Zztapi zztapi) throws MarsException {
		super.save(zztapi);
	}

	public void update(Zztapi zztapi) throws MarsException {
		super.update(zztapi);
	}

	public void delete(Zztapi zztapi) throws MarsException {
		super.delete(zztapi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZztapiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZztapiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZztapiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZztapiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZztapiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZztapiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZztapiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZztapiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZztapiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZztapiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZztapiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZztapiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZztapiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZztapiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZztapiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}