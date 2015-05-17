package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj08;

public class Dlj08Criteria extends SqlCriteria<Dlj08> {

	public static final String TABLE_NAME  = "dlj08";

	public Dlj08Criteria() {
		super(Dlj08.class);
	}

	public Dlj08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj08.class);
	}

	public void save(Dlj08 dlj08) throws MarsException {
		super.save(dlj08);
	}

	public void update(Dlj08 dlj08) throws MarsException {
		super.update(dlj08);
	}

	public void delete(Dlj08 dlj08) throws MarsException {
		super.delete(dlj08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}