package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm03;

public class Dlm03Criteria extends SqlCriteria<Dlm03> {

	public static final String TABLE_NAME  = "dlm03";

	public Dlm03Criteria() {
		super(Dlm03.class);
	}

	public Dlm03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm03.class);
	}

	public void save(Dlm03 dlm03) throws MarsException {
		super.save(dlm03);
	}

	public void update(Dlm03 dlm03) throws MarsException {
		super.update(dlm03);
	}

	public void delete(Dlm03 dlm03) throws MarsException {
		super.delete(dlm03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}