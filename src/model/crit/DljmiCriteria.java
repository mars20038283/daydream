package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljmi;

public class DljmiCriteria extends SqlCriteria<Dljmi> {

	public static final String TABLE_NAME  = "dljmi";

	public DljmiCriteria() {
		super(Dljmi.class);
	}

	public DljmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljmi.class);
	}

	public void save(Dljmi dljmi) throws MarsException {
		super.save(dljmi);
	}

	public void update(Dljmi dljmi) throws MarsException {
		super.update(dljmi);
	}

	public void delete(Dljmi dljmi) throws MarsException {
		super.delete(dljmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}