package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqruvi;

public class SqruviCriteria extends SqlCriteria<Sqruvi> {

	public static final String TABLE_NAME  = "sqruvi";

	public SqruviCriteria() {
		super(Sqruvi.class);
	}

	public SqruviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqruvi.class);
	}

	public void save(Sqruvi sqruvi) throws MarsException {
		super.save(sqruvi);
	}

	public void update(Sqruvi sqruvi) throws MarsException {
		super.update(sqruvi);
	}

	public void delete(Sqruvi sqruvi) throws MarsException {
		super.delete(sqruvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqruviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqruviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqruviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqruviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqruviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqruviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqruviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqruviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqruviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqruviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqruviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqruviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqruviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqruviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqruviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}