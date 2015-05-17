package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy07;

public class Zzwhy07Criteria extends SqlCriteria<Zzwhy07> {

	public static final String TABLE_NAME  = "zzwhy07";

	public Zzwhy07Criteria() {
		super(Zzwhy07.class);
	}

	public Zzwhy07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy07.class);
	}

	public void save(Zzwhy07 zzwhy07) throws MarsException {
		super.save(zzwhy07);
	}

	public void update(Zzwhy07 zzwhy07) throws MarsException {
		super.update(zzwhy07);
	}

	public void delete(Zzwhy07 zzwhy07) throws MarsException {
		super.delete(zzwhy07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}