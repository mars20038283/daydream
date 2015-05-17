package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj09;

public class Dlj09Criteria extends SqlCriteria<Dlj09> {

	public static final String TABLE_NAME  = "dlj09";

	public Dlj09Criteria() {
		super(Dlj09.class);
	}

	public Dlj09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj09.class);
	}

	public void save(Dlj09 dlj09) throws MarsException {
		super.save(dlj09);
	}

	public void update(Dlj09 dlj09) throws MarsException {
		super.update(dlj09);
	}

	public void delete(Dlj09 dlj09) throws MarsException {
		super.delete(dlj09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}