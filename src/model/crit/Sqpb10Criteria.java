package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb10;

public class Sqpb10Criteria extends SqlCriteria<Sqpb10> {

	public static final String TABLE_NAME  = "sqpb10";

	public Sqpb10Criteria() {
		super(Sqpb10.class);
	}

	public Sqpb10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb10.class);
	}

	public void save(Sqpb10 sqpb10) throws MarsException {
		super.save(sqpb10);
	}

	public void update(Sqpb10 sqpb10) throws MarsException {
		super.update(sqpb10);
	}

	public void delete(Sqpb10 sqpb10) throws MarsException {
		super.delete(sqpb10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}