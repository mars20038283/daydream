package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlbvi;

public class DlbviCriteria extends SqlCriteria<Dlbvi> {

	public static final String TABLE_NAME  = "dlbvi";

	public DlbviCriteria() {
		super(Dlbvi.class);
	}

	public DlbviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlbvi.class);
	}

	public void save(Dlbvi dlbvi) throws MarsException {
		super.save(dlbvi);
	}

	public void update(Dlbvi dlbvi) throws MarsException {
		super.update(dlbvi);
	}

	public void delete(Dlbvi dlbvi) throws MarsException {
		super.delete(dlbvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlbviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlbviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlbviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlbviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlbviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlbviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlbviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlbviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlbviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlbviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlbviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlbviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlbviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlbviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlbviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}