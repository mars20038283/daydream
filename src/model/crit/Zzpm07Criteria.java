package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm07;

public class Zzpm07Criteria extends SqlCriteria<Zzpm07> {

	public static final String TABLE_NAME  = "zzpm07";

	public Zzpm07Criteria() {
		super(Zzpm07.class);
	}

	public Zzpm07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm07.class);
	}

	public void save(Zzpm07 zzpm07) throws MarsException {
		super.save(zzpm07);
	}

	public void update(Zzpm07 zzpm07) throws MarsException {
		super.update(zzpm07);
	}

	public void delete(Zzpm07 zzpm07) throws MarsException {
		super.delete(zzpm07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}