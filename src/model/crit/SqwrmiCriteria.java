package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwrmi;

public class SqwrmiCriteria extends SqlCriteria<Sqwrmi> {

	public static final String TABLE_NAME  = "sqwrmi";

	public SqwrmiCriteria() {
		super(Sqwrmi.class);
	}

	public SqwrmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwrmi.class);
	}

	public void save(Sqwrmi sqwrmi) throws MarsException {
		super.save(sqwrmi);
	}

	public void update(Sqwrmi sqwrmi) throws MarsException {
		super.update(sqwrmi);
	}

	public void delete(Sqwrmi sqwrmi) throws MarsException {
		super.delete(sqwrmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqwrmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqwrmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqwrmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqwrmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqwrmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqwrmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqwrmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqwrmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqwrmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqwrmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqwrmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqwrmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqwrmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqwrmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqwrmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}