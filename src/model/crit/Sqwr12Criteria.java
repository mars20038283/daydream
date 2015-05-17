package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr12;

public class Sqwr12Criteria extends SqlCriteria<Sqwr12> {

	public static final String TABLE_NAME  = "sqwr12";

	public Sqwr12Criteria() {
		super(Sqwr12.class);
	}

	public Sqwr12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr12.class);
	}

	public void save(Sqwr12 sqwr12) throws MarsException {
		super.save(sqwr12);
	}

	public void update(Sqwr12 sqwr12) throws MarsException {
		super.update(sqwr12);
	}

	public void delete(Sqwr12 sqwr12) throws MarsException {
		super.delete(sqwr12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}