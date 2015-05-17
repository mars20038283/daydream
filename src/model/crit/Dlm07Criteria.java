package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlm07;

public class Dlm07Criteria extends SqlCriteria<Dlm07> {

	public static final String TABLE_NAME  = "dlm07";

	public Dlm07Criteria() {
		super(Dlm07.class);
	}

	public Dlm07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlm07.class);
	}

	public void save(Dlm07 dlm07) throws MarsException {
		super.save(dlm07);
	}

	public void update(Dlm07 dlm07) throws MarsException {
		super.update(dlm07);
	}

	public void delete(Dlm07 dlm07) throws MarsException {
		super.delete(dlm07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlm07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlm07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlm07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlm07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlm07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlm07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlm07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlm07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlm07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlm07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlm07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlm07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlm07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlm07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlm07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}