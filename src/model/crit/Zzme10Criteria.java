package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme10;

public class Zzme10Criteria extends SqlCriteria<Zzme10> {

	public static final String TABLE_NAME  = "zzme10";

	public Zzme10Criteria() {
		super(Zzme10.class);
	}

	public Zzme10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme10.class);
	}

	public void save(Zzme10 zzme10) throws MarsException {
		super.save(zzme10);
	}

	public void update(Zzme10 zzme10) throws MarsException {
		super.update(zzme10);
	}

	public void delete(Zzme10 zzme10) throws MarsException {
		super.delete(zzme10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}