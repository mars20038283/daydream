package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy11;

public class Zzwhy11Criteria extends SqlCriteria<Zzwhy11> {

	public static final String TABLE_NAME  = "zzwhy11";

	public Zzwhy11Criteria() {
		super(Zzwhy11.class);
	}

	public Zzwhy11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy11.class);
	}

	public void save(Zzwhy11 zzwhy11) throws MarsException {
		super.save(zzwhy11);
	}

	public void update(Zzwhy11 zzwhy11) throws MarsException {
		super.update(zzwhy11);
	}

	public void delete(Zzwhy11 zzwhy11) throws MarsException {
		super.delete(zzwhy11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}