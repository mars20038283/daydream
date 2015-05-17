package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif08;

public class Zjif08Criteria extends SqlCriteria<Zjif08> {

	public static final String TABLE_NAME  = "zjif08";

	public Zjif08Criteria() {
		super(Zjif08.class);
	}

	public Zjif08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif08.class);
	}

	public void save(Zjif08 zjif08) throws MarsException {
		super.save(zjif08);
	}

	public void update(Zjif08 zjif08) throws MarsException {
		super.update(zjif08);
	}

	public void delete(Zjif08 zjif08) throws MarsException {
		super.delete(zjif08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}