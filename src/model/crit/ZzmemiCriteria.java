package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzmemi;

public class ZzmemiCriteria extends SqlCriteria<Zzmemi> {

	public static final String TABLE_NAME  = "zzmemi";

	public ZzmemiCriteria() {
		super(Zzmemi.class);
	}

	public ZzmemiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzmemi.class);
	}

	public void save(Zzmemi zzmemi) throws MarsException {
		super.save(zzmemi);
	}

	public void update(Zzmemi zzmemi) throws MarsException {
		super.update(zzmemi);
	}

	public void delete(Zzmemi zzmemi) throws MarsException {
		super.delete(zzmemi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzmemiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzmemiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzmemiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzmemiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzmemiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzmemiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzmemiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzmemiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzmemiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzmemiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzmemiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzmemiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzmemiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzmemiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzmemiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}