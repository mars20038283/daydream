package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfupi;

public class SqfupiCriteria extends SqlCriteria<Sqfupi> {

	public static final String TABLE_NAME  = "sqfupi";

	public SqfupiCriteria() {
		super(Sqfupi.class);
	}

	public SqfupiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfupi.class);
	}

	public void save(Sqfupi sqfupi) throws MarsException {
		super.save(sqfupi);
	}

	public void update(Sqfupi sqfupi) throws MarsException {
		super.update(sqfupi);
	}

	public void delete(Sqfupi sqfupi) throws MarsException {
		super.delete(sqfupi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqfupiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqfupiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqfupiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqfupiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqfupiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqfupiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqfupiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqfupiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqfupiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqfupiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqfupiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqfupiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqfupiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqfupiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqfupiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}