package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlavi;

public class DlaviCriteria extends SqlCriteria<Dlavi> {

	public static final String TABLE_NAME  = "dlavi";

	public DlaviCriteria() {
		super(Dlavi.class);
	}

	public DlaviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlavi.class);
	}

	public void save(Dlavi dlavi) throws MarsException {
		super.save(dlavi);
	}

	public void update(Dlavi dlavi) throws MarsException {
		super.update(dlavi);
	}

	public void delete(Dlavi dlavi) throws MarsException {
		super.delete(dlavi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlaviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlaviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlaviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlaviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlaviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlaviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlaviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlaviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlaviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlaviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlaviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlaviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlaviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlaviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlaviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}