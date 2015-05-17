package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv08;

public class Dlv08Criteria extends SqlCriteria<Dlv08> {

	public static final String TABLE_NAME  = "dlv08";

	public Dlv08Criteria() {
		super(Dlv08.class);
	}

	public Dlv08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv08.class);
	}

	public void save(Dlv08 dlv08) throws MarsException {
		super.save(dlv08);
	}

	public void update(Dlv08 dlv08) throws MarsException {
		super.update(dlv08);
	}

	public void delete(Dlv08 dlv08) throws MarsException {
		super.delete(dlv08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}