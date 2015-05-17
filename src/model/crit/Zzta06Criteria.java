package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta06;

public class Zzta06Criteria extends SqlCriteria<Zzta06> {

	public static final String TABLE_NAME  = "zzta06";

	public Zzta06Criteria() {
		super(Zzta06.class);
	}

	public Zzta06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta06.class);
	}

	public void save(Zzta06 zzta06) throws MarsException {
		super.save(zzta06);
	}

	public void update(Zzta06 zzta06) throws MarsException {
		super.update(zzta06);
	}

	public void delete(Zzta06 zzta06) throws MarsException {
		super.delete(zzta06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}