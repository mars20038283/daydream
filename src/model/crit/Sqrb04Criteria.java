package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb04;

public class Sqrb04Criteria extends SqlCriteria<Sqrb04> {

	public static final String TABLE_NAME  = "sqrb04";

	public Sqrb04Criteria() {
		super(Sqrb04.class);
	}

	public Sqrb04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb04.class);
	}

	public void save(Sqrb04 sqrb04) throws MarsException {
		super.save(sqrb04);
	}

	public void update(Sqrb04 sqrb04) throws MarsException {
		super.update(sqrb04);
	}

	public void delete(Sqrb04 sqrb04) throws MarsException {
		super.delete(sqrb04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}