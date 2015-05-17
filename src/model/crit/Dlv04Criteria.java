package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlv04;

public class Dlv04Criteria extends SqlCriteria<Dlv04> {

	public static final String TABLE_NAME  = "dlv04";

	public Dlv04Criteria() {
		super(Dlv04.class);
	}

	public Dlv04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlv04.class);
	}

	public void save(Dlv04 dlv04) throws MarsException {
		super.save(dlv04);
	}

	public void update(Dlv04 dlv04) throws MarsException {
		super.update(dlv04);
	}

	public void delete(Dlv04 dlv04) throws MarsException {
		super.delete(dlv04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlv04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlv04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlv04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlv04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlv04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlv04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlv04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlv04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlv04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlv04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlv04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlv04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlv04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlv04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlv04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}