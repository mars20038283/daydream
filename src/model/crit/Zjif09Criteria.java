package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif09;

public class Zjif09Criteria extends SqlCriteria<Zjif09> {

	public static final String TABLE_NAME  = "zjif09";

	public Zjif09Criteria() {
		super(Zjif09.class);
	}

	public Zjif09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif09.class);
	}

	public void save(Zjif09 zjif09) throws MarsException {
		super.save(zjif09);
	}

	public void update(Zjif09 zjif09) throws MarsException {
		super.update(zjif09);
	}

	public void delete(Zjif09 zjif09) throws MarsException {
		super.delete(zjif09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}