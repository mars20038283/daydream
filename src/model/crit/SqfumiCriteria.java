package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfumi;

public class SqfumiCriteria extends SqlCriteria<Sqfumi> {

	public static final String TABLE_NAME  = "sqfumi";

	public SqfumiCriteria() {
		super(Sqfumi.class);
	}

	public SqfumiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfumi.class);
	}

	public void save(Sqfumi sqfumi) throws MarsException {
		super.save(sqfumi);
	}

	public void update(Sqfumi sqfumi) throws MarsException {
		super.update(sqfumi);
	}

	public void delete(Sqfumi sqfumi) throws MarsException {
		super.delete(sqfumi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqfumiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqfumiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqfumiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqfumiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqfumiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqfumiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqfumiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqfumiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqfumiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqfumiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqfumiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqfumiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqfumiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqfumiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqfumiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}