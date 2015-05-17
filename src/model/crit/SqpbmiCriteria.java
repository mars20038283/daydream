package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpbmi;

public class SqpbmiCriteria extends SqlCriteria<Sqpbmi> {

	public static final String TABLE_NAME  = "sqpbmi";

	public SqpbmiCriteria() {
		super(Sqpbmi.class);
	}

	public SqpbmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpbmi.class);
	}

	public void save(Sqpbmi sqpbmi) throws MarsException {
		super.save(sqpbmi);
	}

	public void update(Sqpbmi sqpbmi) throws MarsException {
		super.update(sqpbmi);
	}

	public void delete(Sqpbmi sqpbmi) throws MarsException {
		super.delete(sqpbmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqpbmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqpbmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqpbmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqpbmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqpbmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqpbmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqpbmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqpbmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqpbmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqpbmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqpbmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqpbmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqpbmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqpbmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqpbmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}