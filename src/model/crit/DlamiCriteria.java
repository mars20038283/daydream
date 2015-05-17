package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlami;

public class DlamiCriteria extends SqlCriteria<Dlami> {

	public static final String TABLE_NAME  = "dlami";

	public DlamiCriteria() {
		super(Dlami.class);
	}

	public DlamiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlami.class);
	}

	public void save(Dlami dlami) throws MarsException {
		super.save(dlami);
	}

	public void update(Dlami dlami) throws MarsException {
		super.update(dlami);
	}

	public void delete(Dlami dlami) throws MarsException {
		super.delete(dlami);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlamiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlamiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlamiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlamiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlamiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlamiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlamiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlamiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlamiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlamiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlamiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlamiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlamiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlamiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlamiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}