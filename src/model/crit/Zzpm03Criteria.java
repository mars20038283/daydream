package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm03;

public class Zzpm03Criteria extends SqlCriteria<Zzpm03> {

	public static final String TABLE_NAME  = "zzpm03";

	public Zzpm03Criteria() {
		super(Zzpm03.class);
	}

	public Zzpm03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm03.class);
	}

	public void save(Zzpm03 zzpm03) throws MarsException {
		super.save(zzpm03);
	}

	public void update(Zzpm03 zzpm03) throws MarsException {
		super.update(zzpm03);
	}

	public void delete(Zzpm03 zzpm03) throws MarsException {
		super.delete(zzpm03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}