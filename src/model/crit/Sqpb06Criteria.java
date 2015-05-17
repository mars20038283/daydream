package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb06;

public class Sqpb06Criteria extends SqlCriteria<Sqpb06> {

	public static final String TABLE_NAME  = "sqpb06";

	public Sqpb06Criteria() {
		super(Sqpb06.class);
	}

	public Sqpb06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb06.class);
	}

	public void save(Sqpb06 sqpb06) throws MarsException {
		super.save(sqpb06);
	}

	public void update(Sqpb06 sqpb06) throws MarsException {
		super.update(sqpb06);
	}

	public void delete(Sqpb06 sqpb06) throws MarsException {
		super.delete(sqpb06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}