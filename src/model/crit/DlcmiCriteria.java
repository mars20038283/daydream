package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlcmi;

public class DlcmiCriteria extends SqlCriteria<Dlcmi> {

	public static final String TABLE_NAME  = "dlcmi";

	public DlcmiCriteria() {
		super(Dlcmi.class);
	}

	public DlcmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlcmi.class);
	}

	public void save(Dlcmi dlcmi) throws MarsException {
		super.save(dlcmi);
	}

	public void update(Dlcmi dlcmi) throws MarsException {
		super.update(dlcmi);
	}

	public void delete(Dlcmi dlcmi) throws MarsException {
		super.delete(dlcmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlcmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlcmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlcmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlcmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlcmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlcmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlcmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlcmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlcmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlcmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlcmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlcmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlcmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlcmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlcmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}