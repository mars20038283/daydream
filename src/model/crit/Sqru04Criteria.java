package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru04;

public class Sqru04Criteria extends SqlCriteria<Sqru04> {

	public static final String TABLE_NAME  = "sqru04";

	public Sqru04Criteria() {
		super(Sqru04.class);
	}

	public Sqru04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru04.class);
	}

	public void save(Sqru04 sqru04) throws MarsException {
		super.save(sqru04);
	}

	public void update(Sqru04 sqru04) throws MarsException {
		super.update(sqru04);
	}

	public void delete(Sqru04 sqru04) throws MarsException {
		super.delete(sqru04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}