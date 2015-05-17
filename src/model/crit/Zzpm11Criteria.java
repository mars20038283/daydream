package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpm11;

public class Zzpm11Criteria extends SqlCriteria<Zzpm11> {

	public static final String TABLE_NAME  = "zzpm11";

	public Zzpm11Criteria() {
		super(Zzpm11.class);
	}

	public Zzpm11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpm11.class);
	}

	public void save(Zzpm11 zzpm11) throws MarsException {
		super.save(zzpm11);
	}

	public void update(Zzpm11 zzpm11) throws MarsException {
		super.update(zzpm11);
	}

	public void delete(Zzpm11 zzpm11) throws MarsException {
		super.delete(zzpm11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzpm11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzpm11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzpm11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzpm11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzpm11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzpm11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzpm11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzpm11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzpm11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzpm11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzpm11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzpm11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzpm11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzpm11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzpm11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}