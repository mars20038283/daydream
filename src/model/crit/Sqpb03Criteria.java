package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb03;

public class Sqpb03Criteria extends SqlCriteria<Sqpb03> {

	public static final String TABLE_NAME  = "sqpb03";

	public Sqpb03Criteria() {
		super(Sqpb03.class);
	}

	public Sqpb03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb03.class);
	}

	public void save(Sqpb03 sqpb03) throws MarsException {
		super.save(sqpb03);
	}

	public void update(Sqpb03 sqpb03) throws MarsException {
		super.update(sqpb03);
	}

	public void delete(Sqpb03 sqpb03) throws MarsException {
		super.delete(sqpb03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}