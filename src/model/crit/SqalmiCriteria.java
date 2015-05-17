package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqalmi;

public class SqalmiCriteria extends SqlCriteria<Sqalmi> {

	public static final String TABLE_NAME  = "sqalmi";

	public SqalmiCriteria() {
		super(Sqalmi.class);
	}

	public SqalmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqalmi.class);
	}

	public void save(Sqalmi sqalmi) throws MarsException {
		super.save(sqalmi);
	}

	public void update(Sqalmi sqalmi) throws MarsException {
		super.update(sqalmi);
	}

	public void delete(Sqalmi sqalmi) throws MarsException {
		super.delete(sqalmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqalmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqalmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqalmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqalmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqalmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqalmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqalmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqalmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqalmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqalmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqalmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqalmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqalmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqalmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqalmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}