package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx01;

public class Zzwhx01Criteria extends SqlCriteria<Zzwhx01> {

	public static final String TABLE_NAME  = "zzwhx01";

	public Zzwhx01Criteria() {
		super(Zzwhx01.class);
	}

	public Zzwhx01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx01.class);
	}

	public void save(Zzwhx01 zzwhx01) throws MarsException {
		super.save(zzwhx01);
	}

	public void update(Zzwhx01 zzwhx01) throws MarsException {
		super.update(zzwhx01);
	}

	public void delete(Zzwhx01 zzwhx01) throws MarsException {
		super.delete(zzwhx01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}