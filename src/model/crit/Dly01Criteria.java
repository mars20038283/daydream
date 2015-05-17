package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly01;

public class Dly01Criteria extends SqlCriteria<Dly01> {

	public static final String TABLE_NAME  = "dly01";

	public Dly01Criteria() {
		super(Dly01.class);
	}

	public Dly01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly01.class);
	}

	public void save(Dly01 dly01) throws MarsException {
		super.save(dly01);
	}

	public void update(Dly01 dly01) throws MarsException {
		super.update(dly01);
	}

	public void delete(Dly01 dly01) throws MarsException {
		super.delete(dly01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}