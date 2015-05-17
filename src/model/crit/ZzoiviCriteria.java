package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoivi;

public class ZzoiviCriteria extends SqlCriteria<Zzoivi> {

	public static final String TABLE_NAME  = "zzoivi";

	public ZzoiviCriteria() {
		super(Zzoivi.class);
	}

	public ZzoiviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoivi.class);
	}

	public void save(Zzoivi zzoivi) throws MarsException {
		super.save(zzoivi);
	}

	public void update(Zzoivi zzoivi) throws MarsException {
		super.update(zzoivi);
	}

	public void delete(Zzoivi zzoivi) throws MarsException {
		super.delete(zzoivi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzoiviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzoiviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzoiviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzoiviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzoiviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzoiviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzoiviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzoiviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzoiviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzoiviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzoiviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzoiviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzoiviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzoiviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzoiviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}