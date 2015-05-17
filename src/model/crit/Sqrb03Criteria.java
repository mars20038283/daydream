package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrb03;

public class Sqrb03Criteria extends SqlCriteria<Sqrb03> {

	public static final String TABLE_NAME  = "sqrb03";

	public Sqrb03Criteria() {
		super(Sqrb03.class);
	}

	public Sqrb03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrb03.class);
	}

	public void save(Sqrb03 sqrb03) throws MarsException {
		super.save(sqrb03);
	}

	public void update(Sqrb03 sqrb03) throws MarsException {
		super.update(sqrb03);
	}

	public void delete(Sqrb03 sqrb03) throws MarsException {
		super.delete(sqrb03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqrb03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqrb03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqrb03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqrb03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqrb03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqrb03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqrb03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqrb03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqrb03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqrb03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqrb03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqrb03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqrb03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqrb03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqrb03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}