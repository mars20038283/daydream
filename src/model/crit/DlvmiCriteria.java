package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlvmi;

public class DlvmiCriteria extends SqlCriteria<Dlvmi> {

	public static final String TABLE_NAME  = "dlvmi";

	public DlvmiCriteria() {
		super(Dlvmi.class);
	}

	public DlvmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlvmi.class);
	}

	public void save(Dlvmi dlvmi) throws MarsException {
		super.save(dlvmi);
	}

	public void update(Dlvmi dlvmi) throws MarsException {
		super.update(dlvmi);
	}

	public void delete(Dlvmi dlvmi) throws MarsException {
		super.delete(dlvmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlvmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlvmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlvmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlvmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlvmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlvmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlvmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlvmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlvmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlvmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlvmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlvmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlvmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlvmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlvmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}