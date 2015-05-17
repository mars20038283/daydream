package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf09;

public class Zzcf09Criteria extends SqlCriteria<Zzcf09> {

	public static final String TABLE_NAME  = "zzcf09";

	public Zzcf09Criteria() {
		super(Zzcf09.class);
	}

	public Zzcf09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf09.class);
	}

	public void save(Zzcf09 zzcf09) throws MarsException {
		super.save(zzcf09);
	}

	public void update(Zzcf09 zzcf09) throws MarsException {
		super.update(zzcf09);
	}

	public void delete(Zzcf09 zzcf09) throws MarsException {
		super.delete(zzcf09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}