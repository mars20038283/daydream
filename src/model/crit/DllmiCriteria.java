package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dllmi;

public class DllmiCriteria extends SqlCriteria<Dllmi> {

	public static final String TABLE_NAME  = "dllmi";

	public DllmiCriteria() {
		super(Dllmi.class);
	}

	public DllmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dllmi.class);
	}

	public void save(Dllmi dllmi) throws MarsException {
		super.save(dllmi);
	}

	public void update(Dllmi dllmi) throws MarsException {
		super.update(dllmi);
	}

	public void delete(Dllmi dllmi) throws MarsException {
		super.delete(dllmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DllmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DllmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DllmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DllmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DllmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DllmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DllmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DllmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DllmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DllmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DllmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DllmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DllmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DllmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DllmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}