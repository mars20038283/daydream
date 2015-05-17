package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu11;

public class Sqcu11Criteria extends SqlCriteria<Sqcu11> {

	public static final String TABLE_NAME  = "sqcu11";

	public Sqcu11Criteria() {
		super(Sqcu11.class);
	}

	public Sqcu11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu11.class);
	}

	public void save(Sqcu11 sqcu11) throws MarsException {
		super.save(sqcu11);
	}

	public void update(Sqcu11 sqcu11) throws MarsException {
		super.update(sqcu11);
	}

	public void delete(Sqcu11 sqcu11) throws MarsException {
		super.delete(sqcu11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}