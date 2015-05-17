package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcupi;

public class SqcupiCriteria extends SqlCriteria<Sqcupi> {

	public static final String TABLE_NAME  = "sqcupi";

	public SqcupiCriteria() {
		super(Sqcupi.class);
	}

	public SqcupiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcupi.class);
	}

	public void save(Sqcupi sqcupi) throws MarsException {
		super.save(sqcupi);
	}

	public void update(Sqcupi sqcupi) throws MarsException {
		super.update(sqcupi);
	}

	public void delete(Sqcupi sqcupi) throws MarsException {
		super.delete(sqcupi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqcupiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqcupiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqcupiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqcupiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqcupiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqcupiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqcupiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqcupiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqcupiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqcupiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqcupiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqcupiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqcupiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqcupiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqcupiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}