package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfg03;

public class Zzfg03Criteria extends SqlCriteria<Zzfg03> {

	public static final String TABLE_NAME  = "zzfg03";

	public Zzfg03Criteria() {
		super(Zzfg03.class);
	}

	public Zzfg03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfg03.class);
	}

	public void save(Zzfg03 zzfg03) throws MarsException {
		super.save(zzfg03);
	}

	public void update(Zzfg03 zzfg03) throws MarsException {
		super.update(zzfg03);
	}

	public void delete(Zzfg03 zzfg03) throws MarsException {
		super.delete(zzfg03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzfg03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzfg03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzfg03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzfg03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzfg03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzfg03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzfg03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzfg03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzfg03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzfg03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzfg03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzfg03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzfg03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzfg03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzfg03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}