package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri09;

public class Zzri09Criteria extends SqlCriteria<Zzri09> {

	public static final String TABLE_NAME  = "zzri09";

	public Zzri09Criteria() {
		super(Zzri09.class);
	}

	public Zzri09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri09.class);
	}

	public void save(Zzri09 zzri09) throws MarsException {
		super.save(zzri09);
	}

	public void update(Zzri09 zzri09) throws MarsException {
		super.update(zzri09);
	}

	public void delete(Zzri09 zzri09) throws MarsException {
		super.delete(zzri09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}