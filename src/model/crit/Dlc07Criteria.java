package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlc07;

public class Dlc07Criteria extends SqlCriteria<Dlc07> {

	public static final String TABLE_NAME  = "dlc07";

	public Dlc07Criteria() {
		super(Dlc07.class);
	}

	public Dlc07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlc07.class);
	}

	public void save(Dlc07 dlc07) throws MarsException {
		super.save(dlc07);
	}

	public void update(Dlc07 dlc07) throws MarsException {
		super.update(dlc07);
	}

	public void delete(Dlc07 dlc07) throws MarsException {
		super.delete(dlc07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlc07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlc07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlc07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlc07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlc07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlc07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlc07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlc07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlc07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlc07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlc07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlc07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlc07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlc07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlc07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}