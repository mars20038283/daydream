package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy05;

public class Zzwhy05Criteria extends SqlCriteria<Zzwhy05> {

	public static final String TABLE_NAME  = "zzwhy05";

	public Zzwhy05Criteria() {
		super(Zzwhy05.class);
	}

	public Zzwhy05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy05.class);
	}

	public void save(Zzwhy05 zzwhy05) throws MarsException {
		super.save(zzwhy05);
	}

	public void update(Zzwhy05 zzwhy05) throws MarsException {
		super.update(zzwhy05);
	}

	public void delete(Zzwhy05 zzwhy05) throws MarsException {
		super.delete(zzwhy05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}