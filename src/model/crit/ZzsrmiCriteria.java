package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzsrmi;

public class ZzsrmiCriteria extends SqlCriteria<Zzsrmi> {

	public static final String TABLE_NAME  = "zzsrmi";

	public ZzsrmiCriteria() {
		super(Zzsrmi.class);
	}

	public ZzsrmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzsrmi.class);
	}

	public void save(Zzsrmi zzsrmi) throws MarsException {
		super.save(zzsrmi);
	}

	public void update(Zzsrmi zzsrmi) throws MarsException {
		super.update(zzsrmi);
	}

	public void delete(Zzsrmi zzsrmi) throws MarsException {
		super.delete(zzsrmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzsrmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzsrmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzsrmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzsrmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzsrmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzsrmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzsrmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzsrmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzsrmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzsrmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzsrmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzsrmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzsrmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzsrmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzsrmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}