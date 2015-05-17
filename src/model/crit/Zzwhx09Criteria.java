package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx09;

public class Zzwhx09Criteria extends SqlCriteria<Zzwhx09> {

	public static final String TABLE_NAME  = "zzwhx09";

	public Zzwhx09Criteria() {
		super(Zzwhx09.class);
	}

	public Zzwhx09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx09.class);
	}

	public void save(Zzwhx09 zzwhx09) throws MarsException {
		super.save(zzwhx09);
	}

	public void update(Zzwhx09 zzwhx09) throws MarsException {
		super.update(zzwhx09);
	}

	public void delete(Zzwhx09 zzwhx09) throws MarsException {
		super.delete(zzwhx09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}