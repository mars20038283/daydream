package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlax01;

public class Dlax01Criteria extends SqlCriteria<Dlax01> {

	public static final String TABLE_NAME  = "dlax01";

	public Dlax01Criteria() {
		super(Dlax01.class);
	}

	public Dlax01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlax01.class);
	}

	public void save(Dlax01 dlax01) throws MarsException {
		super.save(dlax01);
	}

	public void update(Dlax01 dlax01) throws MarsException {
		super.update(dlax01);
	}

	public void delete(Dlax01 dlax01) throws MarsException {
		super.delete(dlax01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlax01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlax01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlax01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlax01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlax01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlax01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlax01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlax01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlax01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlax01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlax01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlax01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlax01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlax01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlax01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}