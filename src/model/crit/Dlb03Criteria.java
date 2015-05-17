package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlb03;

public class Dlb03Criteria extends SqlCriteria<Dlb03> {

	public static final String TABLE_NAME  = "dlb03";

	public Dlb03Criteria() {
		super(Dlb03.class);
	}

	public Dlb03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlb03.class);
	}

	public void save(Dlb03 dlb03) throws MarsException {
		super.save(dlb03);
	}

	public void update(Dlb03 dlb03) throws MarsException {
		super.update(dlb03);
	}

	public void delete(Dlb03 dlb03) throws MarsException {
		super.delete(dlb03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlb03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlb03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlb03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlb03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlb03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlb03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlb03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlb03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlb03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlb03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlb03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlb03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlb03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlb03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlb03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}