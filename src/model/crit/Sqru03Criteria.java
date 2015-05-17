package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru03;

public class Sqru03Criteria extends SqlCriteria<Sqru03> {

	public static final String TABLE_NAME  = "sqru03";

	public Sqru03Criteria() {
		super(Sqru03.class);
	}

	public Sqru03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru03.class);
	}

	public void save(Sqru03 sqru03) throws MarsException {
		super.save(sqru03);
	}

	public void update(Sqru03 sqru03) throws MarsException {
		super.update(sqru03);
	}

	public void delete(Sqru03 sqru03) throws MarsException {
		super.delete(sqru03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}