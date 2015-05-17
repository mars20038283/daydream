package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly05;

public class Dly05Criteria extends SqlCriteria<Dly05> {

	public static final String TABLE_NAME  = "dly05";

	public Dly05Criteria() {
		super(Dly05.class);
	}

	public Dly05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly05.class);
	}

	public void save(Dly05 dly05) throws MarsException {
		super.save(dly05);
	}

	public void update(Dly05 dly05) throws MarsException {
		super.update(dly05);
	}

	public void delete(Dly05 dly05) throws MarsException {
		super.delete(dly05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}