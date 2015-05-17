package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqcu04;

public class Sqcu04Criteria extends SqlCriteria<Sqcu04> {

	public static final String TABLE_NAME  = "sqcu04";

	public Sqcu04Criteria() {
		super(Sqcu04.class);
	}

	public Sqcu04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqcu04.class);
	}

	public void save(Sqcu04 sqcu04) throws MarsException {
		super.save(sqcu04);
	}

	public void update(Sqcu04 sqcu04) throws MarsException {
		super.update(sqcu04);
	}

	public void delete(Sqcu04 sqcu04) throws MarsException {
		super.delete(sqcu04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqcu04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqcu04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqcu04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqcu04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqcu04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqcu04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqcu04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqcu04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqcu04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqcu04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqcu04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqcu04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqcu04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqcu04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqcu04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}