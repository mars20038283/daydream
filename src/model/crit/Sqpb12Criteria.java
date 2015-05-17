package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb12;

public class Sqpb12Criteria extends SqlCriteria<Sqpb12> {

	public static final String TABLE_NAME  = "sqpb12";

	public Sqpb12Criteria() {
		super(Sqpb12.class);
	}

	public Sqpb12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb12.class);
	}

	public void save(Sqpb12 sqpb12) throws MarsException {
		super.save(sqpb12);
	}

	public void update(Sqpb12 sqpb12) throws MarsException {
		super.update(sqpb12);
	}

	public void delete(Sqpb12 sqpb12) throws MarsException {
		super.delete(sqpb12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}