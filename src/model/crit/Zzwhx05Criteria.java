package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx05;

public class Zzwhx05Criteria extends SqlCriteria<Zzwhx05> {

	public static final String TABLE_NAME  = "zzwhx05";

	public Zzwhx05Criteria() {
		super(Zzwhx05.class);
	}

	public Zzwhx05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx05.class);
	}

	public void save(Zzwhx05 zzwhx05) throws MarsException {
		super.save(zzwhx05);
	}

	public void update(Zzwhx05 zzwhx05) throws MarsException {
		super.update(zzwhx05);
	}

	public void delete(Zzwhx05 zzwhx05) throws MarsException {
		super.delete(zzwhx05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}