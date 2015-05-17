package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqaumi;

public class SqaumiCriteria extends SqlCriteria<Sqaumi> {

	public static final String TABLE_NAME  = "sqaumi";

	public SqaumiCriteria() {
		super(Sqaumi.class);
	}

	public SqaumiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqaumi.class);
	}

	public void save(Sqaumi sqaumi) throws MarsException {
		super.save(sqaumi);
	}

	public void update(Sqaumi sqaumi) throws MarsException {
		super.update(sqaumi);
	}

	public void delete(Sqaumi sqaumi) throws MarsException {
		super.delete(sqaumi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqaumiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqaumiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqaumiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqaumiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqaumiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqaumiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqaumiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqaumiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqaumiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqaumiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqaumiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqaumiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqaumiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqaumiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqaumiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}