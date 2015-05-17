package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj03;

public class Dlj03Criteria extends SqlCriteria<Dlj03> {

	public static final String TABLE_NAME  = "dlj03";

	public Dlj03Criteria() {
		super(Dlj03.class);
	}

	public Dlj03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj03.class);
	}

	public void save(Dlj03 dlj03) throws MarsException {
		super.save(dlj03);
	}

	public void update(Dlj03 dlj03) throws MarsException {
		super.update(dlj03);
	}

	public void delete(Dlj03 dlj03) throws MarsException {
		super.delete(dlj03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}