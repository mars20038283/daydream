package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlmmi;

public class DlmmiCriteria extends SqlCriteria<Dlmmi> {

	public static final String TABLE_NAME  = "dlmmi";

	public DlmmiCriteria() {
		super(Dlmmi.class);
	}

	public DlmmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlmmi.class);
	}

	public void save(Dlmmi dlmmi) throws MarsException {
		super.save(dlmmi);
	}

	public void update(Dlmmi dlmmi) throws MarsException {
		super.update(dlmmi);
	}

	public void delete(Dlmmi dlmmi) throws MarsException {
		super.delete(dlmmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlmmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlmmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlmmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlmmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlmmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlmmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlmmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlmmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlmmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlmmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlmmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlmmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlmmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlmmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlmmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}