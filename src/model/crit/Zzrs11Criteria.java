package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrs11;

public class Zzrs11Criteria extends SqlCriteria<Zzrs11> {

	public static final String TABLE_NAME  = "zzrs11";

	public Zzrs11Criteria() {
		super(Zzrs11.class);
	}

	public Zzrs11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrs11.class);
	}

	public void save(Zzrs11 zzrs11) throws MarsException {
		super.save(zzrs11);
	}

	public void update(Zzrs11 zzrs11) throws MarsException {
		super.update(zzrs11);
	}

	public void delete(Zzrs11 zzrs11) throws MarsException {
		super.delete(zzrs11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrs11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrs11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrs11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrs11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrs11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrs11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrs11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrs11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrs11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrs11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrs11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrs11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrs11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrs11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrs11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}