package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb09;

public class Dlb09Criteria extends SqlCriteria<Dlb09> {

	public static final String TABLE_NAME  = "dlb09";

	public Dlb09Criteria() {
		super(Dlb09.class);
	}

	public Dlb09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb09.class);
	}

	public void save(Dlb09 dlb09) throws MarsException {
		super.save(dlb09);
	}

	public void update(Dlb09 dlb09) throws MarsException {
		super.update(dlb09);
	}

	public void delete(Dlb09 dlb09) throws MarsException {
		super.delete(dlb09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}