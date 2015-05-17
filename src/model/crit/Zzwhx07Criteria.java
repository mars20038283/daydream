package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx07;

public class Zzwhx07Criteria extends SqlCriteria<Zzwhx07> {

	public static final String TABLE_NAME  = "zzwhx07";

	public Zzwhx07Criteria() {
		super(Zzwhx07.class);
	}

	public Zzwhx07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx07.class);
	}

	public void save(Zzwhx07 zzwhx07) throws MarsException {
		super.save(zzwhx07);
	}

	public void update(Zzwhx07 zzwhx07) throws MarsException {
		super.update(zzwhx07);
	}

	public void delete(Zzwhx07 zzwhx07) throws MarsException {
		super.delete(zzwhx07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}