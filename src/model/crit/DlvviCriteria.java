package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlvvi;

public class DlvviCriteria extends SqlCriteria<Dlvvi> {

	public static final String TABLE_NAME  = "dlvvi";

	public DlvviCriteria() {
		super(Dlvvi.class);
	}

	public DlvviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlvvi.class);
	}

	public void save(Dlvvi dlvvi) throws MarsException {
		super.save(dlvvi);
	}

	public void update(Dlvvi dlvvi) throws MarsException {
		super.update(dlvvi);
	}

	public void delete(Dlvvi dlvvi) throws MarsException {
		super.delete(dlvvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlvviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlvviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlvviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlvviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlvviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlvviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlvviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlvviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlvviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlvviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlvviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlvviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlvviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlvviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlvviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}