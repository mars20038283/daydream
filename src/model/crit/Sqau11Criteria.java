package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau11;

public class Sqau11Criteria extends SqlCriteria<Sqau11> {

	public static final String TABLE_NAME  = "sqau11";

	public Sqau11Criteria() {
		super(Sqau11.class);
	}

	public Sqau11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau11.class);
	}

	public void save(Sqau11 sqau11) throws MarsException {
		super.save(sqau11);
	}

	public void update(Sqau11 sqau11) throws MarsException {
		super.update(sqau11);
	}

	public void delete(Sqau11 sqau11) throws MarsException {
		super.delete(sqau11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}