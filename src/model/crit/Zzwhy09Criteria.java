package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy09;

public class Zzwhy09Criteria extends SqlCriteria<Zzwhy09> {

	public static final String TABLE_NAME  = "zzwhy09";

	public Zzwhy09Criteria() {
		super(Zzwhy09.class);
	}

	public Zzwhy09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy09.class);
	}

	public void save(Zzwhy09 zzwhy09) throws MarsException {
		super.save(zzwhy09);
	}

	public void update(Zzwhy09 zzwhy09) throws MarsException {
		super.update(zzwhy09);
	}

	public void delete(Zzwhy09 zzwhy09) throws MarsException {
		super.delete(zzwhy09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}