package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlpvi;

public class DlpviCriteria extends SqlCriteria<Dlpvi> {

	public static final String TABLE_NAME  = "dlpvi";

	public DlpviCriteria() {
		super(Dlpvi.class);
	}

	public DlpviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlpvi.class);
	}

	public void save(Dlpvi dlpvi) throws MarsException {
		super.save(dlpvi);
	}

	public void update(Dlpvi dlpvi) throws MarsException {
		super.update(dlpvi);
	}

	public void delete(Dlpvi dlpvi) throws MarsException {
		super.delete(dlpvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlpviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlpviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlpviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlpviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlpviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlpviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlpviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlpviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlpviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlpviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlpviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlpviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlpviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlpviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlpviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}