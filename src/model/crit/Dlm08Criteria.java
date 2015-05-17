package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm08;

public class Dlm08Criteria extends SqlCriteria<Dlm08> {

	public static final String TABLE_NAME  = "dlm08";

	public Dlm08Criteria() {
		super(Dlm08.class);
	}

	public Dlm08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm08.class);
	}

	public void save(Dlm08 dlm08) throws MarsException {
		super.save(dlm08);
	}

	public void update(Dlm08 dlm08) throws MarsException {
		super.update(dlm08);
	}

	public void delete(Dlm08 dlm08) throws MarsException {
		super.delete(dlm08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}