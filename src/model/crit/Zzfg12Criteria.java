package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg12;

public class Zzfg12Criteria extends SqlCriteria<Zzfg12> {

	public static final String TABLE_NAME  = "zzfg12";

	public Zzfg12Criteria() {
		super(Zzfg12.class);
	}

	public Zzfg12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg12.class);
	}

	public void save(Zzfg12 zzfg12) throws MarsException {
		super.save(zzfg12);
	}

	public void update(Zzfg12 zzfg12) throws MarsException {
		super.update(zzfg12);
	}

	public void delete(Zzfg12 zzfg12) throws MarsException {
		super.delete(zzfg12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}