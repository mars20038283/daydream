package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlpmi;

public class DlpmiCriteria extends SqlCriteria<Dlpmi> {

	public static final String TABLE_NAME  = "dlpmi";

	public DlpmiCriteria() {
		super(Dlpmi.class);
	}

	public DlpmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlpmi.class);
	}

	public void save(Dlpmi dlpmi) throws MarsException {
		super.save(dlpmi);
	}

	public void update(Dlpmi dlpmi) throws MarsException {
		super.update(dlpmi);
	}

	public void delete(Dlpmi dlpmi) throws MarsException {
		super.delete(dlpmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlpmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlpmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlpmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlpmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlpmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlpmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlpmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlpmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlpmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlpmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlpmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlpmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlpmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlpmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlpmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}