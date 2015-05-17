package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqau03;

public class Sqau03Criteria extends SqlCriteria<Sqau03> {

	public static final String TABLE_NAME  = "sqau03";

	public Sqau03Criteria() {
		super(Sqau03.class);
	}

	public Sqau03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqau03.class);
	}

	public void save(Sqau03 sqau03) throws MarsException {
		super.save(sqau03);
	}

	public void update(Sqau03 sqau03) throws MarsException {
		super.update(sqau03);
	}

	public void delete(Sqau03 sqau03) throws MarsException {
		super.delete(sqau03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqau03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqau03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqau03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqau03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqau03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqau03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqau03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqau03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqau03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqau03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqau03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqau03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqau03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqau03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqau03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}