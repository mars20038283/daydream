package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau08;

public class Sqau08Criteria extends SqlCriteria<Sqau08> {

	public static final String TABLE_NAME  = "sqau08";

	public Sqau08Criteria() {
		super(Sqau08.class);
	}

	public Sqau08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau08.class);
	}

	public void save(Sqau08 sqau08) throws MarsException {
		super.save(sqau08);
	}

	public void update(Sqau08 sqau08) throws MarsException {
		super.update(sqau08);
	}

	public void delete(Sqau08 sqau08) throws MarsException {
		super.delete(sqau08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}