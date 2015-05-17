package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly07;

public class Dly07Criteria extends SqlCriteria<Dly07> {

	public static final String TABLE_NAME  = "dly07";

	public Dly07Criteria() {
		super(Dly07.class);
	}

	public Dly07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly07.class);
	}

	public void save(Dly07 dly07) throws MarsException {
		super.save(dly07);
	}

	public void update(Dly07 dly07) throws MarsException {
		super.update(dly07);
	}

	public void delete(Dly07 dly07) throws MarsException {
		super.delete(dly07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}