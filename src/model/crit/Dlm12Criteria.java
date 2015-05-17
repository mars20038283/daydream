package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm12;

public class Dlm12Criteria extends SqlCriteria<Dlm12> {

	public static final String TABLE_NAME  = "dlm12";

	public Dlm12Criteria() {
		super(Dlm12.class);
	}

	public Dlm12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm12.class);
	}

	public void save(Dlm12 dlm12) throws MarsException {
		super.save(dlm12);
	}

	public void update(Dlm12 dlm12) throws MarsException {
		super.update(dlm12);
	}

	public void delete(Dlm12 dlm12) throws MarsException {
		super.delete(dlm12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}