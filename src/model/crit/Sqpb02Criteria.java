package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb02;

public class Sqpb02Criteria extends SqlCriteria<Sqpb02> {

	public static final String TABLE_NAME  = "sqpb02";

	public Sqpb02Criteria() {
		super(Sqpb02.class);
	}

	public Sqpb02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb02.class);
	}

	public void save(Sqpb02 sqpb02) throws MarsException {
		super.save(sqpb02);
	}

	public void update(Sqpb02 sqpb02) throws MarsException {
		super.update(sqpb02);
	}

	public void delete(Sqpb02 sqpb02) throws MarsException {
		super.delete(sqpb02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}