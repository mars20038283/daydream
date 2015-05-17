package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb05;

public class Sqpb05Criteria extends SqlCriteria<Sqpb05> {

	public static final String TABLE_NAME  = "sqpb05";

	public Sqpb05Criteria() {
		super(Sqpb05.class);
	}

	public Sqpb05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb05.class);
	}

	public void save(Sqpb05 sqpb05) throws MarsException {
		super.save(sqpb05);
	}

	public void update(Sqpb05 sqpb05) throws MarsException {
		super.update(sqpb05);
	}

	public void delete(Sqpb05 sqpb05) throws MarsException {
		super.delete(sqpb05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}