package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzmevi;

public class ZzmeviCriteria extends SqlCriteria<Zzmevi> {

	public static final String TABLE_NAME  = "zzmevi";

	public ZzmeviCriteria() {
		super(Zzmevi.class);
	}

	public ZzmeviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzmevi.class);
	}

	public void save(Zzmevi zzmevi) throws MarsException {
		super.save(zzmevi);
	}

	public void update(Zzmevi zzmevi) throws MarsException {
		super.update(zzmevi);
	}

	public void delete(Zzmevi zzmevi) throws MarsException {
		super.delete(zzmevi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzmeviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzmeviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzmeviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzmeviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzmeviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzmeviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzmeviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzmeviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzmeviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzmeviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzmeviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzmeviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzmeviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzmeviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzmeviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}