package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqag07;

public class Sqag07Criteria extends SqlCriteria<Sqag07> {

	public static final String TABLE_NAME  = "sqag07";

	public Sqag07Criteria() {
		super(Sqag07.class);
	}

	public Sqag07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqag07.class);
	}

	public void save(Sqag07 sqag07) throws MarsException {
		super.save(sqag07);
	}

	public void update(Sqag07 sqag07) throws MarsException {
		super.update(sqag07);
	}

	public void delete(Sqag07 sqag07) throws MarsException {
		super.delete(sqag07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqag07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqag07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqag07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqag07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqag07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqag07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqag07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqag07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqag07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqag07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqag07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqag07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqag07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqag07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqag07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}