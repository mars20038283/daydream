package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzri11;

public class Zzri11Criteria extends SqlCriteria<Zzri11> {

	public static final String TABLE_NAME  = "zzri11";

	public Zzri11Criteria() {
		super(Zzri11.class);
	}

	public Zzri11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzri11.class);
	}

	public void save(Zzri11 zzri11) throws MarsException {
		super.save(zzri11);
	}

	public void update(Zzri11 zzri11) throws MarsException {
		super.update(zzri11);
	}

	public void delete(Zzri11 zzri11) throws MarsException {
		super.delete(zzri11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzri11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzri11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzri11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzri11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzri11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzri11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzri11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzri11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzri11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzri11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzri11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzri11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzri11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzri11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzri11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}