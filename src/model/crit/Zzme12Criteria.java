package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme12;

public class Zzme12Criteria extends SqlCriteria<Zzme12> {

	public static final String TABLE_NAME  = "zzme12";

	public Zzme12Criteria() {
		super(Zzme12.class);
	}

	public Zzme12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme12.class);
	}

	public void save(Zzme12 zzme12) throws MarsException {
		super.save(zzme12);
	}

	public void update(Zzme12 zzme12) throws MarsException {
		super.update(zzme12);
	}

	public void delete(Zzme12 zzme12) throws MarsException {
		super.delete(zzme12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}