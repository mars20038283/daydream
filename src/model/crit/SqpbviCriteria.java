package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpbvi;

public class SqpbviCriteria extends SqlCriteria<Sqpbvi> {

	public static final String TABLE_NAME  = "sqpbvi";

	public SqpbviCriteria() {
		super(Sqpbvi.class);
	}

	public SqpbviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpbvi.class);
	}

	public void save(Sqpbvi sqpbvi) throws MarsException {
		super.save(sqpbvi);
	}

	public void update(Sqpbvi sqpbvi) throws MarsException {
		super.update(sqpbvi);
	}

	public void delete(Sqpbvi sqpbvi) throws MarsException {
		super.delete(sqpbvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqpbviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqpbviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqpbviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqpbviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqpbviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqpbviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqpbviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqpbviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqpbviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqpbviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqpbviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqpbviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqpbviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqpbviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqpbviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}