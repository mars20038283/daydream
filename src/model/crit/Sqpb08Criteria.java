package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb08;

public class Sqpb08Criteria extends SqlCriteria<Sqpb08> {

	public static final String TABLE_NAME  = "sqpb08";

	public Sqpb08Criteria() {
		super(Sqpb08.class);
	}

	public Sqpb08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb08.class);
	}

	public void save(Sqpb08 sqpb08) throws MarsException {
		super.save(sqpb08);
	}

	public void update(Sqpb08 sqpb08) throws MarsException {
		super.update(sqpb08);
	}

	public void delete(Sqpb08 sqpb08) throws MarsException {
		super.delete(sqpb08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}