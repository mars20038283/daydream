package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwrpi;

public class SqwrpiCriteria extends SqlCriteria<Sqwrpi> {

	public static final String TABLE_NAME  = "sqwrpi";

	public SqwrpiCriteria() {
		super(Sqwrpi.class);
	}

	public SqwrpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwrpi.class);
	}

	public void save(Sqwrpi sqwrpi) throws MarsException {
		super.save(sqwrpi);
	}

	public void update(Sqwrpi sqwrpi) throws MarsException {
		super.update(sqwrpi);
	}

	public void delete(Sqwrpi sqwrpi) throws MarsException {
		super.delete(sqwrpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqwrpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqwrpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqwrpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqwrpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqwrpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqwrpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqwrpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqwrpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqwrpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqwrpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqwrpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqwrpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqwrpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqwrpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqwrpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}