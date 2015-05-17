package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme09;

public class Zzme09Criteria extends SqlCriteria<Zzme09> {

	public static final String TABLE_NAME  = "zzme09";

	public Zzme09Criteria() {
		super(Zzme09.class);
	}

	public Zzme09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme09.class);
	}

	public void save(Zzme09 zzme09) throws MarsException {
		super.save(zzme09);
	}

	public void update(Zzme09 zzme09) throws MarsException {
		super.update(zzme09);
	}

	public void delete(Zzme09 zzme09) throws MarsException {
		super.delete(zzme09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}