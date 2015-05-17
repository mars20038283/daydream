package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlmvi;

public class DlmviCriteria extends SqlCriteria<Dlmvi> {

	public static final String TABLE_NAME  = "dlmvi";

	public DlmviCriteria() {
		super(Dlmvi.class);
	}

	public DlmviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlmvi.class);
	}

	public void save(Dlmvi dlmvi) throws MarsException {
		super.save(dlmvi);
	}

	public void update(Dlmvi dlmvi) throws MarsException {
		super.update(dlmvi);
	}

	public void delete(Dlmvi dlmvi) throws MarsException {
		super.delete(dlmvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlmviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlmviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlmviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlmviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlmviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlmviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlmviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlmviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlmviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlmviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlmviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlmviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlmviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlmviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlmviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}