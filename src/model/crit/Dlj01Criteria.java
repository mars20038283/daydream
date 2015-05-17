package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj01;

public class Dlj01Criteria extends SqlCriteria<Dlj01> {

	public static final String TABLE_NAME  = "dlj01";

	public Dlj01Criteria() {
		super(Dlj01.class);
	}

	public Dlj01Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj01.class);
	}

	public void save(Dlj01 dlj01) throws MarsException {
		super.save(dlj01);
	}

	public void update(Dlj01 dlj01) throws MarsException {
		super.update(dlj01);
	}

	public void delete(Dlj01 dlj01) throws MarsException {
		super.delete(dlj01);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj01Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj01Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj01Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj01Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj01Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj01Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj01Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj01Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj01Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj01Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj01Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj01Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj01Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj01Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj01Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}