package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj07;

public class Dlj07Criteria extends SqlCriteria<Dlj07> {

	public static final String TABLE_NAME  = "dlj07";

	public Dlj07Criteria() {
		super(Dlj07.class);
	}

	public Dlj07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj07.class);
	}

	public void save(Dlj07 dlj07) throws MarsException {
		super.save(dlj07);
	}

	public void update(Dlj07 dlj07) throws MarsException {
		super.update(dlj07);
	}

	public void delete(Dlj07 dlj07) throws MarsException {
		super.delete(dlj07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}