package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay11;

public class Dlay11Criteria extends SqlCriteria<Dlay11> {

	public static final String TABLE_NAME  = "dlay11";

	public Dlay11Criteria() {
		super(Dlay11.class);
	}

	public Dlay11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay11.class);
	}

	public void save(Dlay11 dlay11) throws MarsException {
		super.save(dlay11);
	}

	public void update(Dlay11 dlay11) throws MarsException {
		super.update(dlay11);
	}

	public void delete(Dlay11 dlay11) throws MarsException {
		super.delete(dlay11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}