package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb07;

public class Sqpb07Criteria extends SqlCriteria<Sqpb07> {

	public static final String TABLE_NAME  = "sqpb07";

	public Sqpb07Criteria() {
		super(Sqpb07.class);
	}

	public Sqpb07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb07.class);
	}

	public void save(Sqpb07 sqpb07) throws MarsException {
		super.save(sqpb07);
	}

	public void update(Sqpb07 sqpb07) throws MarsException {
		super.update(sqpb07);
	}

	public void delete(Sqpb07 sqpb07) throws MarsException {
		super.delete(sqpb07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}