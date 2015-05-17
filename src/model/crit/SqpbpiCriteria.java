package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpbpi;

public class SqpbpiCriteria extends SqlCriteria<Sqpbpi> {

	public static final String TABLE_NAME  = "sqpbpi";

	public SqpbpiCriteria() {
		super(Sqpbpi.class);
	}

	public SqpbpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpbpi.class);
	}

	public void save(Sqpbpi sqpbpi) throws MarsException {
		super.save(sqpbpi);
	}

	public void update(Sqpbpi sqpbpi) throws MarsException {
		super.update(sqpbpi);
	}

	public void delete(Sqpbpi sqpbpi) throws MarsException {
		super.delete(sqpbpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqpbpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqpbpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqpbpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqpbpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqpbpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqpbpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqpbpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqpbpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqpbpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqpbpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqpbpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqpbpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqpbpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqpbpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqpbpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}