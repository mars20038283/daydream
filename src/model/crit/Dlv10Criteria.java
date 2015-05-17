package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv10;

public class Dlv10Criteria extends SqlCriteria<Dlv10> {

	public static final String TABLE_NAME  = "dlv10";

	public Dlv10Criteria() {
		super(Dlv10.class);
	}

	public Dlv10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv10.class);
	}

	public void save(Dlv10 dlv10) throws MarsException {
		super.save(dlv10);
	}

	public void update(Dlv10 dlv10) throws MarsException {
		super.update(dlv10);
	}

	public void delete(Dlv10 dlv10) throws MarsException {
		super.delete(dlv10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}