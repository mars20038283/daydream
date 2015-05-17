package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqznvi;

public class SqznviCriteria extends SqlCriteria<Sqznvi> {

	public static final String TABLE_NAME  = "sqznvi";

	public SqznviCriteria() {
		super(Sqznvi.class);
	}

	public SqznviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqznvi.class);
	}

	public void save(Sqznvi sqznvi) throws MarsException {
		super.save(sqznvi);
	}

	public void update(Sqznvi sqznvi) throws MarsException {
		super.update(sqznvi);
	}

	public void delete(Sqznvi sqznvi) throws MarsException {
		super.delete(sqznvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqznviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqznviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqznviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqznviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqznviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqznviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqznviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqznviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqznviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqznviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqznviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqznviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqznviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqznviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqznviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}