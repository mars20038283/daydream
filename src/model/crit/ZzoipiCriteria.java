package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoipi;

public class ZzoipiCriteria extends SqlCriteria<Zzoipi> {

	public static final String TABLE_NAME  = "zzoipi";

	public ZzoipiCriteria() {
		super(Zzoipi.class);
	}

	public ZzoipiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoipi.class);
	}

	public void save(Zzoipi zzoipi) throws MarsException {
		super.save(zzoipi);
	}

	public void update(Zzoipi zzoipi) throws MarsException {
		super.update(zzoipi);
	}

	public void delete(Zzoipi zzoipi) throws MarsException {
		super.delete(zzoipi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzoipiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzoipiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzoipiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzoipiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzoipiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzoipiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzoipiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzoipiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzoipiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzoipiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzoipiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzoipiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzoipiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzoipiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzoipiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}