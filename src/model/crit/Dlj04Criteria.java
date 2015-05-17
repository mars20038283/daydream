package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj04;

public class Dlj04Criteria extends SqlCriteria<Dlj04> {

	public static final String TABLE_NAME  = "dlj04";

	public Dlj04Criteria() {
		super(Dlj04.class);
	}

	public Dlj04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj04.class);
	}

	public void save(Dlj04 dlj04) throws MarsException {
		super.save(dlj04);
	}

	public void update(Dlj04 dlj04) throws MarsException {
		super.update(dlj04);
	}

	public void delete(Dlj04 dlj04) throws MarsException {
		super.delete(dlj04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}