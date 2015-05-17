package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb04;

public class Sqpb04Criteria extends SqlCriteria<Sqpb04> {

	public static final String TABLE_NAME  = "sqpb04";

	public Sqpb04Criteria() {
		super(Sqpb04.class);
	}

	public Sqpb04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb04.class);
	}

	public void save(Sqpb04 sqpb04) throws MarsException {
		super.save(sqpb04);
	}

	public void update(Sqpb04 sqpb04) throws MarsException {
		super.update(sqpb04);
	}

	public void delete(Sqpb04 sqpb04) throws MarsException {
		super.delete(sqpb04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}