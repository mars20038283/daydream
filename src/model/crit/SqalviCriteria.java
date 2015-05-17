package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqalvi;

public class SqalviCriteria extends SqlCriteria<Sqalvi> {

	public static final String TABLE_NAME  = "sqalvi";

	public SqalviCriteria() {
		super(Sqalvi.class);
	}

	public SqalviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqalvi.class);
	}

	public void save(Sqalvi sqalvi) throws MarsException {
		super.save(sqalvi);
	}

	public void update(Sqalvi sqalvi) throws MarsException {
		super.update(sqalvi);
	}

	public void delete(Sqalvi sqalvi) throws MarsException {
		super.delete(sqalvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqalviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqalviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqalviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqalviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqalviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqalviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqalviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqalviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqalviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqalviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqalviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqalviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqalviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqalviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqalviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}