package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme04;

public class Zzme04Criteria extends SqlCriteria<Zzme04> {

	public static final String TABLE_NAME  = "zzme04";

	public Zzme04Criteria() {
		super(Zzme04.class);
	}

	public Zzme04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme04.class);
	}

	public void save(Zzme04 zzme04) throws MarsException {
		super.save(zzme04);
	}

	public void update(Zzme04 zzme04) throws MarsException {
		super.update(zzme04);
	}

	public void delete(Zzme04 zzme04) throws MarsException {
		super.delete(zzme04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}