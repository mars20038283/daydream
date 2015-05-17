package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljvi;

public class DljviCriteria extends SqlCriteria<Dljvi> {

	public static final String TABLE_NAME  = "dljvi";

	public DljviCriteria() {
		super(Dljvi.class);
	}

	public DljviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljvi.class);
	}

	public void save(Dljvi dljvi) throws MarsException {
		super.save(dljvi);
	}

	public void update(Dljvi dljvi) throws MarsException {
		super.update(dljvi);
	}

	public void delete(Dljvi dljvi) throws MarsException {
		super.delete(dljvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}