package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv03;

public class Dlv03Criteria extends SqlCriteria<Dlv03> {

	public static final String TABLE_NAME  = "dlv03";

	public Dlv03Criteria() {
		super(Dlv03.class);
	}

	public Dlv03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv03.class);
	}

	public void save(Dlv03 dlv03) throws MarsException {
		super.save(dlv03);
	}

	public void update(Dlv03 dlv03) throws MarsException {
		super.update(dlv03);
	}

	public void delete(Dlv03 dlv03) throws MarsException {
		super.delete(dlv03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}