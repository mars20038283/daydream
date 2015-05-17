package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljm04;

public class Dljm04Criteria extends SqlCriteria<Dljm04> {

	public static final String TABLE_NAME  = "dljm04";

	public Dljm04Criteria() {
		super(Dljm04.class);
	}

	public Dljm04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dljm04.class);
	}

	public void save(Dljm04 dljm04) throws MarsException {
		super.save(dljm04);
	}

	public void update(Dljm04 dljm04) throws MarsException {
		super.update(dljm04);
	}

	public void delete(Dljm04 dljm04) throws MarsException {
		super.delete(dljm04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dljm04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dljm04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dljm04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dljm04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dljm04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dljm04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dljm04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dljm04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dljm04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dljm04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dljm04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dljm04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dljm04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dljm04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dljm04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}