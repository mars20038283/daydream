package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrs07;

public class Zzrs07Criteria extends SqlCriteria<Zzrs07> {

	public static final String TABLE_NAME  = "zzrs07";

	public Zzrs07Criteria() {
		super(Zzrs07.class);
	}

	public Zzrs07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrs07.class);
	}

	public void save(Zzrs07 zzrs07) throws MarsException {
		super.save(zzrs07);
	}

	public void update(Zzrs07 zzrs07) throws MarsException {
		super.update(zzrs07);
	}

	public void delete(Zzrs07 zzrs07) throws MarsException {
		super.delete(zzrs07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrs07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrs07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrs07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrs07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrs07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrs07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrs07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrs07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrs07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrs07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrs07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrs07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrs07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrs07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrs07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}