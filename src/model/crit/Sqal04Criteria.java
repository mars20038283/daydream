package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqal04;

public class Sqal04Criteria extends SqlCriteria<Sqal04> {

	public static final String TABLE_NAME  = "sqal04";

	public Sqal04Criteria() {
		super(Sqal04.class);
	}

	public Sqal04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqal04.class);
	}

	public void save(Sqal04 sqal04) throws MarsException {
		super.save(sqal04);
	}

	public void update(Sqal04 sqal04) throws MarsException {
		super.update(sqal04);
	}

	public void delete(Sqal04 sqal04) throws MarsException {
		super.delete(sqal04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqal04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqal04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqal04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqal04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqal04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqal04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqal04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqal04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqal04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqal04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqal04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqal04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqal04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqal04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqal04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}