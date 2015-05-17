package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau04;

public class Sqau04Criteria extends SqlCriteria<Sqau04> {

	public static final String TABLE_NAME  = "sqau04";

	public Sqau04Criteria() {
		super(Sqau04.class);
	}

	public Sqau04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau04.class);
	}

	public void save(Sqau04 sqau04) throws MarsException {
		super.save(sqau04);
	}

	public void update(Sqau04 sqau04) throws MarsException {
		super.update(sqau04);
	}

	public void delete(Sqau04 sqau04) throws MarsException {
		super.delete(sqau04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}