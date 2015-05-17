package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcuvi;

public class SqcuviCriteria extends SqlCriteria<Sqcuvi> {

	public static final String TABLE_NAME  = "sqcuvi";

	public SqcuviCriteria() {
		super(Sqcuvi.class);
	}

	public SqcuviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcuvi.class);
	}

	public void save(Sqcuvi sqcuvi) throws MarsException {
		super.save(sqcuvi);
	}

	public void update(Sqcuvi sqcuvi) throws MarsException {
		super.update(sqcuvi);
	}

	public void delete(Sqcuvi sqcuvi) throws MarsException {
		super.delete(sqcuvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqcuviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqcuviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqcuviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqcuviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqcuviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqcuviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqcuviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqcuviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqcuviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqcuviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqcuviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqcuviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqcuviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqcuviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqcuviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}