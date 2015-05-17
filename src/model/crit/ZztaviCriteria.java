package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zztavi;

public class ZztaviCriteria extends SqlCriteria<Zztavi> {

	public static final String TABLE_NAME  = "zztavi";

	public ZztaviCriteria() {
		super(Zztavi.class);
	}

	public ZztaviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zztavi.class);
	}

	public void save(Zztavi zztavi) throws MarsException {
		super.save(zztavi);
	}

	public void update(Zztavi zztavi) throws MarsException {
		super.update(zztavi);
	}

	public void delete(Zztavi zztavi) throws MarsException {
		super.delete(zztavi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZztaviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZztaviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZztaviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZztaviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZztaviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZztaviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZztaviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZztaviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZztaviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZztaviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZztaviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZztaviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZztaviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZztaviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZztaviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}