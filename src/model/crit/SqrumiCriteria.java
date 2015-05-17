package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrumi;

public class SqrumiCriteria extends SqlCriteria<Sqrumi> {

	public static final String TABLE_NAME  = "sqrumi";

	public SqrumiCriteria() {
		super(Sqrumi.class);
	}

	public SqrumiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrumi.class);
	}

	public void save(Sqrumi sqrumi) throws MarsException {
		super.save(sqrumi);
	}

	public void update(Sqrumi sqrumi) throws MarsException {
		super.update(sqrumi);
	}

	public void delete(Sqrumi sqrumi) throws MarsException {
		super.delete(sqrumi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqrumiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqrumiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqrumiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqrumiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqrumiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqrumiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqrumiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqrumiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqrumiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqrumiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqrumiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqrumiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqrumiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqrumiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqrumiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}