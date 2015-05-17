package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlbmi;

public class DlbmiCriteria extends SqlCriteria<Dlbmi> {

	public static final String TABLE_NAME  = "dlbmi";

	public DlbmiCriteria() {
		super(Dlbmi.class);
	}

	public DlbmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlbmi.class);
	}

	public void save(Dlbmi dlbmi) throws MarsException {
		super.save(dlbmi);
	}

	public void update(Dlbmi dlbmi) throws MarsException {
		super.update(dlbmi);
	}

	public void delete(Dlbmi dlbmi) throws MarsException {
		super.delete(dlbmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlbmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlbmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlbmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlbmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlbmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlbmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlbmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlbmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlbmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlbmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlbmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlbmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlbmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlbmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlbmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}