package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme03;

public class Zzme03Criteria extends SqlCriteria<Zzme03> {

	public static final String TABLE_NAME  = "zzme03";

	public Zzme03Criteria() {
		super(Zzme03.class);
	}

	public Zzme03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme03.class);
	}

	public void save(Zzme03 zzme03) throws MarsException {
		super.save(zzme03);
	}

	public void update(Zzme03 zzme03) throws MarsException {
		super.update(zzme03);
	}

	public void delete(Zzme03 zzme03) throws MarsException {
		super.delete(zzme03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}