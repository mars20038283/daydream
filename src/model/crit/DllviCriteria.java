package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dllvi;

public class DllviCriteria extends SqlCriteria<Dllvi> {

	public static final String TABLE_NAME  = "dllvi";

	public DllviCriteria() {
		super(Dllvi.class);
	}

	public DllviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dllvi.class);
	}

	public void save(Dllvi dllvi) throws MarsException {
		super.save(dllvi);
	}

	public void update(Dllvi dllvi) throws MarsException {
		super.update(dllvi);
	}

	public void delete(Dllvi dllvi) throws MarsException {
		super.delete(dllvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DllviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DllviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DllviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DllviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DllviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DllviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DllviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DllviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DllviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DllviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DllviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DllviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DllviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DllviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DllviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}