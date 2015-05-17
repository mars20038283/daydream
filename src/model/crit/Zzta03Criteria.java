package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzta03;

public class Zzta03Criteria extends SqlCriteria<Zzta03> {

	public static final String TABLE_NAME  = "zzta03";

	public Zzta03Criteria() {
		super(Zzta03.class);
	}

	public Zzta03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzta03.class);
	}

	public void save(Zzta03 zzta03) throws MarsException {
		super.save(zzta03);
	}

	public void update(Zzta03 zzta03) throws MarsException {
		super.update(zzta03);
	}

	public void delete(Zzta03 zzta03) throws MarsException {
		super.delete(zzta03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzta03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzta03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzta03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzta03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzta03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzta03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzta03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzta03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzta03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzta03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzta03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzta03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzta03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzta03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzta03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}