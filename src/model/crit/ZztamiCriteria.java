package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zztami;

public class ZztamiCriteria extends SqlCriteria<Zztami> {

	public static final String TABLE_NAME  = "zztami";

	public ZztamiCriteria() {
		super(Zztami.class);
	}

	public ZztamiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zztami.class);
	}

	public void save(Zztami zztami) throws MarsException {
		super.save(zztami);
	}

	public void update(Zztami zztami) throws MarsException {
		super.update(zztami);
	}

	public void delete(Zztami zztami) throws MarsException {
		super.delete(zztami);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZztamiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZztamiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZztamiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZztamiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZztamiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZztamiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZztamiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZztamiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZztamiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZztamiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZztamiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZztamiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZztamiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZztamiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZztamiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}