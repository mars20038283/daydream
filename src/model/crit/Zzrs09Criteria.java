package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrs09;

public class Zzrs09Criteria extends SqlCriteria<Zzrs09> {

	public static final String TABLE_NAME  = "zzrs09";

	public Zzrs09Criteria() {
		super(Zzrs09.class);
	}

	public Zzrs09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrs09.class);
	}

	public void save(Zzrs09 zzrs09) throws MarsException {
		super.save(zzrs09);
	}

	public void update(Zzrs09 zzrs09) throws MarsException {
		super.update(zzrs09);
	}

	public void delete(Zzrs09 zzrs09) throws MarsException {
		super.delete(zzrs09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrs09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrs09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrs09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrs09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrs09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrs09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrs09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrs09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrs09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrs09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrs09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrs09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrs09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrs09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrs09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}