package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrpi;

public class ZzsrpiCriteria extends SqlCriteria<Zzsrpi> {

	public static final String TABLE_NAME  = "zzsrpi";

	public ZzsrpiCriteria() {
		super(Zzsrpi.class);
	}

	public ZzsrpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrpi.class);
	}

	public void save(Zzsrpi zzsrpi) throws MarsException {
		super.save(zzsrpi);
	}

	public void update(Zzsrpi zzsrpi) throws MarsException {
		super.update(zzsrpi);
	}

	public void delete(Zzsrpi zzsrpi) throws MarsException {
		super.delete(zzsrpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzsrpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzsrpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzsrpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzsrpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzsrpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzsrpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzsrpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzsrpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzsrpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzsrpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzsrpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzsrpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzsrpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzsrpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzsrpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}