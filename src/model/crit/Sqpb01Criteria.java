package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb01;

public class Sqpb01Criteria extends SqlCriteria<Sqpb01> {

	public static final String TABLE_NAME  = "sqpb01";

	public Sqpb01Criteria() {
		super(Sqpb01.class);
	}

	public Sqpb01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb01.class);
	}

	public void save(Sqpb01 sqpb01) throws MarsException {
		super.save(sqpb01);
	}

	public void update(Sqpb01 sqpb01) throws MarsException {
		super.update(sqpb01);
	}

	public void delete(Sqpb01 sqpb01) throws MarsException {
		super.delete(sqpb01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}