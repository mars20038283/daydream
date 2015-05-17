package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif07;

public class Zjif07Criteria extends SqlCriteria<Zjif07> {

	public static final String TABLE_NAME  = "zjif07";

	public Zjif07Criteria() {
		super(Zjif07.class);
	}

	public Zjif07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif07.class);
	}

	public void save(Zjif07 zjif07) throws MarsException {
		super.save(zjif07);
	}

	public void update(Zjif07 zjif07) throws MarsException {
		super.update(zjif07);
	}

	public void delete(Zjif07 zjif07) throws MarsException {
		super.delete(zjif07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}