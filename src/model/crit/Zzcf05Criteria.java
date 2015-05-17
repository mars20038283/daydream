package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf05;

public class Zzcf05Criteria extends SqlCriteria<Zzcf05> {

	public static final String TABLE_NAME  = "zzcf05";

	public Zzcf05Criteria() {
		super(Zzcf05.class);
	}

	public Zzcf05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf05.class);
	}

	public void save(Zzcf05 zzcf05) throws MarsException {
		super.save(zzcf05);
	}

	public void update(Zzcf05 zzcf05) throws MarsException {
		super.update(zzcf05);
	}

	public void delete(Zzcf05 zzcf05) throws MarsException {
		super.delete(zzcf05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}