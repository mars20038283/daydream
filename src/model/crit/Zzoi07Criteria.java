package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi07;

public class Zzoi07Criteria extends SqlCriteria<Zzoi07> {

	public static final String TABLE_NAME  = "zzoi07";

	public Zzoi07Criteria() {
		super(Zzoi07.class);
	}

	public Zzoi07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi07.class);
	}

	public void save(Zzoi07 zzoi07) throws MarsException {
		super.save(zzoi07);
	}

	public void update(Zzoi07 zzoi07) throws MarsException {
		super.update(zzoi07);
	}

	public void delete(Zzoi07 zzoi07) throws MarsException {
		super.delete(zzoi07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}