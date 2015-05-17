package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqzn04;

public class Sqzn04Criteria extends SqlCriteria<Sqzn04> {

	public static final String TABLE_NAME  = "sqzn04";

	public Sqzn04Criteria() {
		super(Sqzn04.class);
	}

	public Sqzn04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqzn04.class);
	}

	public void save(Sqzn04 sqzn04) throws MarsException {
		super.save(sqzn04);
	}

	public void update(Sqzn04 sqzn04) throws MarsException {
		super.update(sqzn04);
	}

	public void delete(Sqzn04 sqzn04) throws MarsException {
		super.delete(sqzn04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqzn04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqzn04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqzn04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqzn04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqzn04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqzn04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqzn04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqzn04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqzn04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqzn04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqzn04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqzn04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqzn04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqzn04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqzn04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}