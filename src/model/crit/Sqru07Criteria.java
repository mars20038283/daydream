package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqru07;

public class Sqru07Criteria extends SqlCriteria<Sqru07> {

	public static final String TABLE_NAME  = "sqru07";

	public Sqru07Criteria() {
		super(Sqru07.class);
	}

	public Sqru07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqru07.class);
	}

	public void save(Sqru07 sqru07) throws MarsException {
		super.save(sqru07);
	}

	public void update(Sqru07 sqru07) throws MarsException {
		super.update(sqru07);
	}

	public void delete(Sqru07 sqru07) throws MarsException {
		super.delete(sqru07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqru07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqru07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqru07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqru07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqru07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqru07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqru07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqru07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqru07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqru07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqru07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqru07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqru07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqru07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqru07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}