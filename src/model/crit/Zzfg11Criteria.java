package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg11;

public class Zzfg11Criteria extends SqlCriteria<Zzfg11> {

	public static final String TABLE_NAME  = "zzfg11";

	public Zzfg11Criteria() {
		super(Zzfg11.class);
	}

	public Zzfg11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg11.class);
	}

	public void save(Zzfg11 zzfg11) throws MarsException {
		super.save(zzfg11);
	}

	public void update(Zzfg11 zzfg11) throws MarsException {
		super.update(zzfg11);
	}

	public void delete(Zzfg11 zzfg11) throws MarsException {
		super.delete(zzfg11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}