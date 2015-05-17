package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri01;

public class Zzri01Criteria extends SqlCriteria<Zzri01> {

	public static final String TABLE_NAME  = "zzri01";

	public Zzri01Criteria() {
		super(Zzri01.class);
	}

	public Zzri01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri01.class);
	}

	public void save(Zzri01 zzri01) throws MarsException {
		super.save(zzri01);
	}

	public void update(Zzri01 zzri01) throws MarsException {
		super.update(zzri01);
	}

	public void delete(Zzri01 zzri01) throws MarsException {
		super.delete(zzri01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}