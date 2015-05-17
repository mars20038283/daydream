package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal11;

public class Sqal11Criteria extends SqlCriteria<Sqal11> {

	public static final String TABLE_NAME  = "sqal11";

	public Sqal11Criteria() {
		super(Sqal11.class);
	}

	public Sqal11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal11.class);
	}

	public void save(Sqal11 sqal11) throws MarsException {
		super.save(sqal11);
	}

	public void update(Sqal11 sqal11) throws MarsException {
		super.update(sqal11);
	}

	public void delete(Sqal11 sqal11) throws MarsException {
		super.delete(sqal11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}