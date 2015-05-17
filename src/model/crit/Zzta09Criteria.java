package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta09;

public class Zzta09Criteria extends SqlCriteria<Zzta09> {

	public static final String TABLE_NAME  = "zzta09";

	public Zzta09Criteria() {
		super(Zzta09.class);
	}

	public Zzta09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta09.class);
	}

	public void save(Zzta09 zzta09) throws MarsException {
		super.save(zzta09);
	}

	public void update(Zzta09 zzta09) throws MarsException {
		super.update(zzta09);
	}

	public void delete(Zzta09 zzta09) throws MarsException {
		super.delete(zzta09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}