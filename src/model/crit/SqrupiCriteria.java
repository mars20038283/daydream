package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrupi;

public class SqrupiCriteria extends SqlCriteria<Sqrupi> {

	public static final String TABLE_NAME  = "sqrupi";

	public SqrupiCriteria() {
		super(Sqrupi.class);
	}

	public SqrupiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrupi.class);
	}

	public void save(Sqrupi sqrupi) throws MarsException {
		super.save(sqrupi);
	}

	public void update(Sqrupi sqrupi) throws MarsException {
		super.update(sqrupi);
	}

	public void delete(Sqrupi sqrupi) throws MarsException {
		super.delete(sqrupi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqrupiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqrupiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqrupiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqrupiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqrupiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqrupiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqrupiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqrupiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqrupiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqrupiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqrupiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqrupiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqrupiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqrupiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqrupiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}