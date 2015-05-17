package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly03;

public class Dly03Criteria extends SqlCriteria<Dly03> {

	public static final String TABLE_NAME  = "dly03";

	public Dly03Criteria() {
		super(Dly03.class);
	}

	public Dly03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly03.class);
	}

	public void save(Dly03 dly03) throws MarsException {
		super.save(dly03);
	}

	public void update(Dly03 dly03) throws MarsException {
		super.update(dly03);
	}

	public void delete(Dly03 dly03) throws MarsException {
		super.delete(dly03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}