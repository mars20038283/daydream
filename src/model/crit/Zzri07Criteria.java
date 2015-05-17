package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri07;

public class Zzri07Criteria extends SqlCriteria<Zzri07> {

	public static final String TABLE_NAME  = "zzri07";

	public Zzri07Criteria() {
		super(Zzri07.class);
	}

	public Zzri07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri07.class);
	}

	public void save(Zzri07 zzri07) throws MarsException {
		super.save(zzri07);
	}

	public void update(Zzri07 zzri07) throws MarsException {
		super.update(zzri07);
	}

	public void delete(Zzri07 zzri07) throws MarsException {
		super.delete(zzri07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}