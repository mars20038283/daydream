package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi03;

public class Zzoi03Criteria extends SqlCriteria<Zzoi03> {

	public static final String TABLE_NAME  = "zzoi03";

	public Zzoi03Criteria() {
		super(Zzoi03.class);
	}

	public Zzoi03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi03.class);
	}

	public void save(Zzoi03 zzoi03) throws MarsException {
		super.save(zzoi03);
	}

	public void update(Zzoi03 zzoi03) throws MarsException {
		super.update(zzoi03);
	}

	public void delete(Zzoi03 zzoi03) throws MarsException {
		super.delete(zzoi03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}