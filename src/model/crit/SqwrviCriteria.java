package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwrvi;

public class SqwrviCriteria extends SqlCriteria<Sqwrvi> {

	public static final String TABLE_NAME  = "sqwrvi";

	public SqwrviCriteria() {
		super(Sqwrvi.class);
	}

	public SqwrviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwrvi.class);
	}

	public void save(Sqwrvi sqwrvi) throws MarsException {
		super.save(sqwrvi);
	}

	public void update(Sqwrvi sqwrvi) throws MarsException {
		super.update(sqwrvi);
	}

	public void delete(Sqwrvi sqwrvi) throws MarsException {
		super.delete(sqwrvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqwrviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqwrviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqwrviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqwrviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqwrviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqwrviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqwrviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqwrviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqwrviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqwrviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqwrviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqwrviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqwrviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqwrviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqwrviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}