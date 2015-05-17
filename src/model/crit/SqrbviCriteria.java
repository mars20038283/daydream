package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrbvi;

public class SqrbviCriteria extends SqlCriteria<Sqrbvi> {

	public static final String TABLE_NAME  = "sqrbvi";

	public SqrbviCriteria() {
		super(Sqrbvi.class);
	}

	public SqrbviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrbvi.class);
	}

	public void save(Sqrbvi sqrbvi) throws MarsException {
		super.save(sqrbvi);
	}

	public void update(Sqrbvi sqrbvi) throws MarsException {
		super.update(sqrbvi);
	}

	public void delete(Sqrbvi sqrbvi) throws MarsException {
		super.delete(sqrbvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqrbviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqrbviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqrbviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqrbviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqrbviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqrbviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqrbviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqrbviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqrbviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqrbviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqrbviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqrbviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqrbviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqrbviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqrbviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}