package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqpb11;

public class Sqpb11Criteria extends SqlCriteria<Sqpb11> {

	public static final String TABLE_NAME  = "sqpb11";

	public Sqpb11Criteria() {
		super(Sqpb11.class);
	}

	public Sqpb11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqpb11.class);
	}

	public void save(Sqpb11 sqpb11) throws MarsException {
		super.save(sqpb11);
	}

	public void update(Sqpb11 sqpb11) throws MarsException {
		super.update(sqpb11);
	}

	public void delete(Sqpb11 sqpb11) throws MarsException {
		super.delete(sqpb11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqpb11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqpb11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqpb11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqpb11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqpb11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqpb11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqpb11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqpb11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqpb11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqpb11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqpb11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqpb11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqpb11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqpb11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqpb11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}