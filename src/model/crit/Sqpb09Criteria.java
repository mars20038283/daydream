package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb09;

public class Sqpb09Criteria extends SqlCriteria<Sqpb09> {

	public static final String TABLE_NAME  = "sqpb09";

	public Sqpb09Criteria() {
		super(Sqpb09.class);
	}

	public Sqpb09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb09.class);
	}

	public void save(Sqpb09 sqpb09) throws MarsException {
		super.save(sqpb09);
	}

	public void update(Sqpb09 sqpb09) throws MarsException {
		super.update(sqpb09);
	}

	public void delete(Sqpb09 sqpb09) throws MarsException {
		super.delete(sqpb09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}