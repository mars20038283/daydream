package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau01;

public class Sqau01Criteria extends SqlCriteria<Sqau01> {

	public static final String TABLE_NAME  = "sqau01";

	public Sqau01Criteria() {
		super(Sqau01.class);
	}

	public Sqau01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau01.class);
	}

	public void save(Sqau01 sqau01) throws MarsException {
		super.save(sqau01);
	}

	public void update(Sqau01 sqau01) throws MarsException {
		super.update(sqau01);
	}

	public void delete(Sqau01 sqau01) throws MarsException {
		super.delete(sqau01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}