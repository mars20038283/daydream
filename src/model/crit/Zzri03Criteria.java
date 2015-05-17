package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri03;

public class Zzri03Criteria extends SqlCriteria<Zzri03> {

	public static final String TABLE_NAME  = "zzri03";

	public Zzri03Criteria() {
		super(Zzri03.class);
	}

	public Zzri03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri03.class);
	}

	public void save(Zzri03 zzri03) throws MarsException {
		super.save(zzri03);
	}

	public void update(Zzri03 zzri03) throws MarsException {
		super.update(zzri03);
	}

	public void delete(Zzri03 zzri03) throws MarsException {
		super.delete(zzri03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}