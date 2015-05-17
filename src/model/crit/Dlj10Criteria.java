package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj10;

public class Dlj10Criteria extends SqlCriteria<Dlj10> {

	public static final String TABLE_NAME  = "dlj10";

	public Dlj10Criteria() {
		super(Dlj10.class);
	}

	public Dlj10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj10.class);
	}

	public void save(Dlj10 dlj10) throws MarsException {
		super.save(dlj10);
	}

	public void update(Dlj10 dlj10) throws MarsException {
		super.update(dlj10);
	}

	public void delete(Dlj10 dlj10) throws MarsException {
		super.delete(dlj10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}