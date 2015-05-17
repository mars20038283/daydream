package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf11;

public class Zzcf11Criteria extends SqlCriteria<Zzcf11> {

	public static final String TABLE_NAME  = "zzcf11";

	public Zzcf11Criteria() {
		super(Zzcf11.class);
	}

	public Zzcf11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf11.class);
	}

	public void save(Zzcf11 zzcf11) throws MarsException {
		super.save(zzcf11);
	}

	public void update(Zzcf11 zzcf11) throws MarsException {
		super.update(zzcf11);
	}

	public void delete(Zzcf11 zzcf11) throws MarsException {
		super.delete(zzcf11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}