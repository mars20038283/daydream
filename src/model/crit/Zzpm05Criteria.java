package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm05;

public class Zzpm05Criteria extends SqlCriteria<Zzpm05> {

	public static final String TABLE_NAME  = "zzpm05";

	public Zzpm05Criteria() {
		super(Zzpm05.class);
	}

	public Zzpm05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm05.class);
	}

	public void save(Zzpm05 zzpm05) throws MarsException {
		super.save(zzpm05);
	}

	public void update(Zzpm05 zzpm05) throws MarsException {
		super.update(zzpm05);
	}

	public void delete(Zzpm05 zzpm05) throws MarsException {
		super.delete(zzpm05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}