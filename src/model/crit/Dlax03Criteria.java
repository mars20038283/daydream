package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax03;

public class Dlax03Criteria extends SqlCriteria<Dlax03> {

	public static final String TABLE_NAME  = "dlax03";

	public Dlax03Criteria() {
		super(Dlax03.class);
	}

	public Dlax03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax03.class);
	}

	public void save(Dlax03 dlax03) throws MarsException {
		super.save(dlax03);
	}

	public void update(Dlax03 dlax03) throws MarsException {
		super.update(dlax03);
	}

	public void delete(Dlax03 dlax03) throws MarsException {
		super.delete(dlax03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}