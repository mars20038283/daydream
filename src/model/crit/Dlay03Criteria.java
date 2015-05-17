package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlay03;

public class Dlay03Criteria extends SqlCriteria<Dlay03> {

	public static final String TABLE_NAME  = "dlay03";

	public Dlay03Criteria() {
		super(Dlay03.class);
	}

	public Dlay03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlay03.class);
	}

	public void save(Dlay03 dlay03) throws MarsException {
		super.save(dlay03);
	}

	public void update(Dlay03 dlay03) throws MarsException {
		super.update(dlay03);
	}

	public void delete(Dlay03 dlay03) throws MarsException {
		super.delete(dlay03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlay03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlay03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlay03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlay03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlay03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlay03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlay03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlay03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlay03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlay03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlay03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlay03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlay03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlay03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlay03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}