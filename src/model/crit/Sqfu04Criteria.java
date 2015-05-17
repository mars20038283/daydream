package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqfu04;

public class Sqfu04Criteria extends SqlCriteria<Sqfu04> {

	public static final String TABLE_NAME  = "sqfu04";

	public Sqfu04Criteria() {
		super(Sqfu04.class);
	}

	public Sqfu04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqfu04.class);
	}

	public void save(Sqfu04 sqfu04) throws MarsException {
		super.save(sqfu04);
	}

	public void update(Sqfu04 sqfu04) throws MarsException {
		super.update(sqfu04);
	}

	public void delete(Sqfu04 sqfu04) throws MarsException {
		super.delete(sqfu04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqfu04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqfu04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqfu04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqfu04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqfu04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqfu04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqfu04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqfu04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqfu04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqfu04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqfu04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqfu04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqfu04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqfu04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqfu04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}