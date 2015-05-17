package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfuvi;

public class SqfuviCriteria extends SqlCriteria<Sqfuvi> {

	public static final String TABLE_NAME  = "sqfuvi";

	public SqfuviCriteria() {
		super(Sqfuvi.class);
	}

	public SqfuviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfuvi.class);
	}

	public void save(Sqfuvi sqfuvi) throws MarsException {
		super.save(sqfuvi);
	}

	public void update(Sqfuvi sqfuvi) throws MarsException {
		super.update(sqfuvi);
	}

	public void delete(Sqfuvi sqfuvi) throws MarsException {
		super.delete(sqfuvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqfuviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqfuviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqfuviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqfuviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqfuviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqfuviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqfuviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqfuviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqfuviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqfuviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqfuviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqfuviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqfuviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqfuviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqfuviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}