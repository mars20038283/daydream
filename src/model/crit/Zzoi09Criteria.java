package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi09;

public class Zzoi09Criteria extends SqlCriteria<Zzoi09> {

	public static final String TABLE_NAME  = "zzoi09";

	public Zzoi09Criteria() {
		super(Zzoi09.class);
	}

	public Zzoi09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi09.class);
	}

	public void save(Zzoi09 zzoi09) throws MarsException {
		super.save(zzoi09);
	}

	public void update(Zzoi09 zzoi09) throws MarsException {
		super.update(zzoi09);
	}

	public void delete(Zzoi09 zzoi09) throws MarsException {
		super.delete(zzoi09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}