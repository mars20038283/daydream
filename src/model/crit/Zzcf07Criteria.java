package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf07;

public class Zzcf07Criteria extends SqlCriteria<Zzcf07> {

	public static final String TABLE_NAME  = "zzcf07";

	public Zzcf07Criteria() {
		super(Zzcf07.class);
	}

	public Zzcf07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf07.class);
	}

	public void save(Zzcf07 zzcf07) throws MarsException {
		super.save(zzcf07);
	}

	public void update(Zzcf07 zzcf07) throws MarsException {
		super.update(zzcf07);
	}

	public void delete(Zzcf07 zzcf07) throws MarsException {
		super.delete(zzcf07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}