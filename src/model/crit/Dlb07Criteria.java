package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb07;

public class Dlb07Criteria extends SqlCriteria<Dlb07> {

	public static final String TABLE_NAME  = "dlb07";

	public Dlb07Criteria() {
		super(Dlb07.class);
	}

	public Dlb07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb07.class);
	}

	public void save(Dlb07 dlb07) throws MarsException {
		super.save(dlb07);
	}

	public void update(Dlb07 dlb07) throws MarsException {
		super.update(dlb07);
	}

	public void delete(Dlb07 dlb07) throws MarsException {
		super.delete(dlb07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}