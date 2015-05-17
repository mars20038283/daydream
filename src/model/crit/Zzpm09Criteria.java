package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm09;

public class Zzpm09Criteria extends SqlCriteria<Zzpm09> {

	public static final String TABLE_NAME  = "zzpm09";

	public Zzpm09Criteria() {
		super(Zzpm09.class);
	}

	public Zzpm09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm09.class);
	}

	public void save(Zzpm09 zzpm09) throws MarsException {
		super.save(zzpm09);
	}

	public void update(Zzpm09 zzpm09) throws MarsException {
		super.update(zzpm09);
	}

	public void delete(Zzpm09 zzpm09) throws MarsException {
		super.delete(zzpm09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}