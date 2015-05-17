package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrbmi;

public class SqrbmiCriteria extends SqlCriteria<Sqrbmi> {

	public static final String TABLE_NAME  = "sqrbmi";

	public SqrbmiCriteria() {
		super(Sqrbmi.class);
	}

	public SqrbmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrbmi.class);
	}

	public void save(Sqrbmi sqrbmi) throws MarsException {
		super.save(sqrbmi);
	}

	public void update(Sqrbmi sqrbmi) throws MarsException {
		super.update(sqrbmi);
	}

	public void delete(Sqrbmi sqrbmi) throws MarsException {
		super.delete(sqrbmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqrbmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqrbmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqrbmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqrbmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqrbmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqrbmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqrbmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqrbmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqrbmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqrbmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqrbmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqrbmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqrbmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqrbmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqrbmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}