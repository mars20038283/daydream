package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj05;

public class Dlj05Criteria extends SqlCriteria<Dlj05> {

	public static final String TABLE_NAME  = "dlj05";

	public Dlj05Criteria() {
		super(Dlj05.class);
	}

	public Dlj05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj05.class);
	}

	public void save(Dlj05 dlj05) throws MarsException {
		super.save(dlj05);
	}

	public void update(Dlj05 dlj05) throws MarsException {
		super.update(dlj05);
	}

	public void delete(Dlj05 dlj05) throws MarsException {
		super.delete(dlj05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}