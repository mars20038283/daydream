package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif12;

public class Zjif12Criteria extends SqlCriteria<Zjif12> {

	public static final String TABLE_NAME  = "zjif12";

	public Zjif12Criteria() {
		super(Zjif12.class);
	}

	public Zjif12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif12.class);
	}

	public void save(Zjif12 zjif12) throws MarsException {
		super.save(zjif12);
	}

	public void update(Zjif12 zjif12) throws MarsException {
		super.update(zjif12);
	}

	public void delete(Zjif12 zjif12) throws MarsException {
		super.delete(zjif12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}