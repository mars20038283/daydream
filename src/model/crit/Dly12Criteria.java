package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly12;

public class Dly12Criteria extends SqlCriteria<Dly12> {

	public static final String TABLE_NAME  = "dly12";

	public Dly12Criteria() {
		super(Dly12.class);
	}

	public Dly12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly12.class);
	}

	public void save(Dly12 dly12) throws MarsException {
		super.save(dly12);
	}

	public void update(Dly12 dly12) throws MarsException {
		super.update(dly12);
	}

	public void delete(Dly12 dly12) throws MarsException {
		super.delete(dly12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}