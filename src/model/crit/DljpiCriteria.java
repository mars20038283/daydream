package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljpi;

public class DljpiCriteria extends SqlCriteria<Dljpi> {

	public static final String TABLE_NAME  = "dljpi";

	public DljpiCriteria() {
		super(Dljpi.class);
	}

	public DljpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljpi.class);
	}

	public void save(Dljpi dljpi) throws MarsException {
		super.save(dljpi);
	}

	public void update(Dljpi dljpi) throws MarsException {
		super.update(dljpi);
	}

	public void delete(Dljpi dljpi) throws MarsException {
		super.delete(dljpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}