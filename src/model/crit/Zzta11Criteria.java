package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta11;

public class Zzta11Criteria extends SqlCriteria<Zzta11> {

	public static final String TABLE_NAME  = "zzta11";

	public Zzta11Criteria() {
		super(Zzta11.class);
	}

	public Zzta11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta11.class);
	}

	public void save(Zzta11 zzta11) throws MarsException {
		super.save(zzta11);
	}

	public void update(Zzta11 zzta11) throws MarsException {
		super.update(zzta11);
	}

	public void delete(Zzta11 zzta11) throws MarsException {
		super.delete(zzta11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}