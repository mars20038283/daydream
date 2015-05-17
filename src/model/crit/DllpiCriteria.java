package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dllpi;

public class DllpiCriteria extends SqlCriteria<Dllpi> {

	public static final String TABLE_NAME  = "dllpi";

	public DllpiCriteria() {
		super(Dllpi.class);
	}

	public DllpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dllpi.class);
	}

	public void save(Dllpi dllpi) throws MarsException {
		super.save(dllpi);
	}

	public void update(Dllpi dllpi) throws MarsException {
		super.update(dllpi);
	}

	public void delete(Dllpi dllpi) throws MarsException {
		super.delete(dllpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DllpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DllpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DllpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DllpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DllpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DllpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DllpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DllpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DllpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DllpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DllpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DllpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DllpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DllpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DllpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}