package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv07;

public class Dlv07Criteria extends SqlCriteria<Dlv07> {

	public static final String TABLE_NAME  = "dlv07";

	public Dlv07Criteria() {
		super(Dlv07.class);
	}

	public Dlv07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv07.class);
	}

	public void save(Dlv07 dlv07) throws MarsException {
		super.save(dlv07);
	}

	public void update(Dlv07 dlv07) throws MarsException {
		super.update(dlv07);
	}

	public void delete(Dlv07 dlv07) throws MarsException {
		super.delete(dlv07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}