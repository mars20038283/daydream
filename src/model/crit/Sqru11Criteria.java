package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru11;

public class Sqru11Criteria extends SqlCriteria<Sqru11> {

	public static final String TABLE_NAME  = "sqru11";

	public Sqru11Criteria() {
		super(Sqru11.class);
	}

	public Sqru11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru11.class);
	}

	public void save(Sqru11 sqru11) throws MarsException {
		super.save(sqru11);
	}

	public void update(Sqru11 sqru11) throws MarsException {
		super.update(sqru11);
	}

	public void delete(Sqru11 sqru11) throws MarsException {
		super.delete(sqru11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}