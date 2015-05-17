package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly08;

public class Dly08Criteria extends SqlCriteria<Dly08> {

	public static final String TABLE_NAME  = "dly08";

	public Dly08Criteria() {
		super(Dly08.class);
	}

	public Dly08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly08.class);
	}

	public void save(Dly08 dly08) throws MarsException {
		super.save(dly08);
	}

	public void update(Dly08 dly08) throws MarsException {
		super.update(dly08);
	}

	public void delete(Dly08 dly08) throws MarsException {
		super.delete(dly08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}