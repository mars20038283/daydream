package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcumi;

public class SqcumiCriteria extends SqlCriteria<Sqcumi> {

	public static final String TABLE_NAME  = "sqcumi";

	public SqcumiCriteria() {
		super(Sqcumi.class);
	}

	public SqcumiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcumi.class);
	}

	public void save(Sqcumi sqcumi) throws MarsException {
		super.save(sqcumi);
	}

	public void update(Sqcumi sqcumi) throws MarsException {
		super.update(sqcumi);
	}

	public void delete(Sqcumi sqcumi) throws MarsException {
		super.delete(sqcumi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqcumiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqcumiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqcumiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqcumiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqcumiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqcumiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqcumiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqcumiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqcumiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqcumiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqcumiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqcumiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqcumiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqcumiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqcumiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}