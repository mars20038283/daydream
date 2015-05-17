package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlapi;

public class DlapiCriteria extends SqlCriteria<Dlapi> {

	public static final String TABLE_NAME  = "dlapi";

	public DlapiCriteria() {
		super(Dlapi.class);
	}

	public DlapiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlapi.class);
	}

	public void save(Dlapi dlapi) throws MarsException {
		super.save(dlapi);
	}

	public void update(Dlapi dlapi) throws MarsException {
		super.update(dlapi);
	}

	public void delete(Dlapi dlapi) throws MarsException {
		super.delete(dlapi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlapiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlapiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlapiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlapiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlapiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlapiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlapiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlapiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlapiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlapiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlapiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlapiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlapiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlapiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlapiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}