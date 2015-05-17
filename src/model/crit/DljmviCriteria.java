package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljmvi;

public class DljmviCriteria extends SqlCriteria<Dljmvi> {

	public static final String TABLE_NAME  = "dljmvi";

	public DljmviCriteria() {
		super(Dljmvi.class);
	}

	public DljmviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljmvi.class);
	}

	public void save(Dljmvi dljmvi) throws MarsException {
		super.save(dljmvi);
	}

	public void update(Dljmvi dljmvi) throws MarsException {
		super.update(dljmvi);
	}

	public void delete(Dljmvi dljmvi) throws MarsException {
		super.delete(dljmvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljmviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljmviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljmviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljmviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljmviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljmviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljmviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljmviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljmviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljmviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljmviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljmviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljmviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljmviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljmviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}