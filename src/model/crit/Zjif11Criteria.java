package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif11;

public class Zjif11Criteria extends SqlCriteria<Zjif11> {

	public static final String TABLE_NAME  = "zjif11";

	public Zjif11Criteria() {
		super(Zjif11.class);
	}

	public Zjif11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif11.class);
	}

	public void save(Zjif11 zjif11) throws MarsException {
		super.save(zjif11);
	}

	public void update(Zjif11 zjif11) throws MarsException {
		super.update(zjif11);
	}

	public void delete(Zjif11 zjif11) throws MarsException {
		super.delete(zjif11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}