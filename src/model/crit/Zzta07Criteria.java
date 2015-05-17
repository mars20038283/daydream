package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta07;

public class Zzta07Criteria extends SqlCriteria<Zzta07> {

	public static final String TABLE_NAME  = "zzta07";

	public Zzta07Criteria() {
		super(Zzta07.class);
	}

	public Zzta07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta07.class);
	}

	public void save(Zzta07 zzta07) throws MarsException {
		super.save(zzta07);
	}

	public void update(Zzta07 zzta07) throws MarsException {
		super.update(zzta07);
	}

	public void delete(Zzta07 zzta07) throws MarsException {
		super.delete(zzta07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}