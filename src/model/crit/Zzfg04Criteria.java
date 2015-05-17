package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg04;

public class Zzfg04Criteria extends SqlCriteria<Zzfg04> {

	public static final String TABLE_NAME  = "zzfg04";

	public Zzfg04Criteria() {
		super(Zzfg04.class);
	}

	public Zzfg04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg04.class);
	}

	public void save(Zzfg04 zzfg04) throws MarsException {
		super.save(zzfg04);
	}

	public void update(Zzfg04 zzfg04) throws MarsException {
		super.update(zzfg04);
	}

	public void delete(Zzfg04 zzfg04) throws MarsException {
		super.delete(zzfg04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}