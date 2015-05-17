package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr09;

public class Sqwr09Criteria extends SqlCriteria<Sqwr09> {

	public static final String TABLE_NAME  = "sqwr09";

	public Sqwr09Criteria() {
		super(Sqwr09.class);
	}

	public Sqwr09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr09.class);
	}

	public void save(Sqwr09 sqwr09) throws MarsException {
		super.save(sqwr09);
	}

	public void update(Sqwr09 sqwr09) throws MarsException {
		super.update(sqwr09);
	}

	public void delete(Sqwr09 sqwr09) throws MarsException {
		super.delete(sqwr09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}