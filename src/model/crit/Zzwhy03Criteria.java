package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhy03;

public class Zzwhy03Criteria extends SqlCriteria<Zzwhy03> {

	public static final String TABLE_NAME  = "zzwhy03";

	public Zzwhy03Criteria() {
		super(Zzwhy03.class);
	}

	public Zzwhy03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhy03.class);
	}

	public void save(Zzwhy03 zzwhy03) throws MarsException {
		super.save(zzwhy03);
	}

	public void update(Zzwhy03 zzwhy03) throws MarsException {
		super.update(zzwhy03);
	}

	public void delete(Zzwhy03 zzwhy03) throws MarsException {
		super.delete(zzwhy03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhy03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhy03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhy03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhy03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhy03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhy03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhy03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhy03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhy03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhy03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhy03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhy03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhy03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhy03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhy03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}