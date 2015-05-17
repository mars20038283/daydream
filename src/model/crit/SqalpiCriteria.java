package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqalpi;

public class SqalpiCriteria extends SqlCriteria<Sqalpi> {

	public static final String TABLE_NAME  = "sqalpi";

	public SqalpiCriteria() {
		super(Sqalpi.class);
	}

	public SqalpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqalpi.class);
	}

	public void save(Sqalpi sqalpi) throws MarsException {
		super.save(sqalpi);
	}

	public void update(Sqalpi sqalpi) throws MarsException {
		super.update(sqalpi);
	}

	public void delete(Sqalpi sqalpi) throws MarsException {
		super.delete(sqalpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqalpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqalpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqalpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqalpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqalpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqalpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqalpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqalpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqalpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqalpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqalpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqalpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqalpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqalpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqalpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}