package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx11;

public class Zzwhx11Criteria extends SqlCriteria<Zzwhx11> {

	public static final String TABLE_NAME  = "zzwhx11";

	public Zzwhx11Criteria() {
		super(Zzwhx11.class);
	}

	public Zzwhx11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx11.class);
	}

	public void save(Zzwhx11 zzwhx11) throws MarsException {
		super.save(zzwhx11);
	}

	public void update(Zzwhx11 zzwhx11) throws MarsException {
		super.update(zzwhx11);
	}

	public void delete(Zzwhx11 zzwhx11) throws MarsException {
		super.delete(zzwhx11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}