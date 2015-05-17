package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlcvi;

public class DlcviCriteria extends SqlCriteria<Dlcvi> {

	public static final String TABLE_NAME  = "dlcvi";

	public DlcviCriteria() {
		super(Dlcvi.class);
	}

	public DlcviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlcvi.class);
	}

	public void save(Dlcvi dlcvi) throws MarsException {
		super.save(dlcvi);
	}

	public void update(Dlcvi dlcvi) throws MarsException {
		super.update(dlcvi);
	}

	public void delete(Dlcvi dlcvi) throws MarsException {
		super.delete(dlcvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlcviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlcviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlcviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlcviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlcviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlcviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlcviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlcviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlcviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlcviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlcviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlcviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlcviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlcviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlcviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}