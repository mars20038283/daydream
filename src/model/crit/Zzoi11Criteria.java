package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi11;

public class Zzoi11Criteria extends SqlCriteria<Zzoi11> {

	public static final String TABLE_NAME  = "zzoi11";

	public Zzoi11Criteria() {
		super(Zzoi11.class);
	}

	public Zzoi11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi11.class);
	}

	public void save(Zzoi11 zzoi11) throws MarsException {
		super.save(zzoi11);
	}

	public void update(Zzoi11 zzoi11) throws MarsException {
		super.update(zzoi11);
	}

	public void delete(Zzoi11 zzoi11) throws MarsException {
		super.delete(zzoi11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}