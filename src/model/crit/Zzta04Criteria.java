package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta04;

public class Zzta04Criteria extends SqlCriteria<Zzta04> {

	public static final String TABLE_NAME  = "zzta04";

	public Zzta04Criteria() {
		super(Zzta04.class);
	}

	public Zzta04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta04.class);
	}

	public void save(Zzta04 zzta04) throws MarsException {
		super.save(zzta04);
	}

	public void update(Zzta04 zzta04) throws MarsException {
		super.update(zzta04);
	}

	public void delete(Zzta04 zzta04) throws MarsException {
		super.delete(zzta04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}