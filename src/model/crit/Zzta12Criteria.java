package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta12;

public class Zzta12Criteria extends SqlCriteria<Zzta12> {

	public static final String TABLE_NAME  = "zzta12";

	public Zzta12Criteria() {
		super(Zzta12.class);
	}

	public Zzta12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta12.class);
	}

	public void save(Zzta12 zzta12) throws MarsException {
		super.save(zzta12);
	}

	public void update(Zzta12 zzta12) throws MarsException {
		super.update(zzta12);
	}

	public void delete(Zzta12 zzta12) throws MarsException {
		super.delete(zzta12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}