package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhx03;

public class Zzwhx03Criteria extends SqlCriteria<Zzwhx03> {

	public static final String TABLE_NAME  = "zzwhx03";

	public Zzwhx03Criteria() {
		super(Zzwhx03.class);
	}

	public Zzwhx03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhx03.class);
	}

	public void save(Zzwhx03 zzwhx03) throws MarsException {
		super.save(zzwhx03);
	}

	public void update(Zzwhx03 zzwhx03) throws MarsException {
		super.update(zzwhx03);
	}

	public void delete(Zzwhx03 zzwhx03) throws MarsException {
		super.delete(zzwhx03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzwhx03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzwhx03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzwhx03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzwhx03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzwhx03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzwhx03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzwhx03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzwhx03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzwhx03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzwhx03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzwhx03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzwhx03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzwhx03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzwhx03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzwhx03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}