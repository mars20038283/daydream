package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme06;

public class Zzme06Criteria extends SqlCriteria<Zzme06> {

	public static final String TABLE_NAME  = "zzme06";

	public Zzme06Criteria() {
		super(Zzme06.class);
	}

	public Zzme06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme06.class);
	}

	public void save(Zzme06 zzme06) throws MarsException {
		super.save(zzme06);
	}

	public void update(Zzme06 zzme06) throws MarsException {
		super.update(zzme06);
	}

	public void delete(Zzme06 zzme06) throws MarsException {
		super.delete(zzme06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}