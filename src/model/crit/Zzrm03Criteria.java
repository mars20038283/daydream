package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrm03;

public class Zzrm03Criteria extends SqlCriteria<Zzrm03> {

	public static final String TABLE_NAME  = "zzrm03";

	public Zzrm03Criteria() {
		super(Zzrm03.class);
	}

	public Zzrm03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrm03.class);
	}

	public void save(Zzrm03 zzrm03) throws MarsException {
		super.save(zzrm03);
	}

	public void update(Zzrm03 zzrm03) throws MarsException {
		super.update(zzrm03);
	}

	public void delete(Zzrm03 zzrm03) throws MarsException {
		super.delete(zzrm03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrm03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrm03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrm03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrm03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrm03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrm03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrm03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrm03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrm03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrm03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrm03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrm03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrm03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrm03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrm03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}