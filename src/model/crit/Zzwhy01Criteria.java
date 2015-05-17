package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy01;

public class Zzwhy01Criteria extends SqlCriteria<Zzwhy01> {

	public static final String TABLE_NAME  = "zzwhy01";

	public Zzwhy01Criteria() {
		super(Zzwhy01.class);
	}

	public Zzwhy01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy01.class);
	}

	public void save(Zzwhy01 zzwhy01) throws MarsException {
		super.save(zzwhy01);
	}

	public void update(Zzwhy01 zzwhy01) throws MarsException {
		super.update(zzwhy01);
	}

	public void delete(Zzwhy01 zzwhy01) throws MarsException {
		super.delete(zzwhy01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}