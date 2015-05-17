package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag04;

public class Sqag04Criteria extends SqlCriteria<Sqag04> {

	public static final String TABLE_NAME  = "sqag04";

	public Sqag04Criteria() {
		super(Sqag04.class);
	}

	public Sqag04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag04.class);
	}

	public void save(Sqag04 sqag04) throws MarsException {
		super.save(sqag04);
	}

	public void update(Sqag04 sqag04) throws MarsException {
		super.update(sqag04);
	}

	public void delete(Sqag04 sqag04) throws MarsException {
		super.delete(sqag04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}