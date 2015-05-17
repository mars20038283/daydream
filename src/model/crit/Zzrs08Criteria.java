package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrs08;

public class Zzrs08Criteria extends SqlCriteria<Zzrs08> {

	public static final String TABLE_NAME  = "zzrs08";

	public Zzrs08Criteria() {
		super(Zzrs08.class);
	}

	public Zzrs08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrs08.class);
	}

	public void save(Zzrs08 zzrs08) throws MarsException {
		super.save(zzrs08);
	}

	public void update(Zzrs08 zzrs08) throws MarsException {
		super.update(zzrs08);
	}

	public void delete(Zzrs08 zzrs08) throws MarsException {
		super.delete(zzrs08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzrs08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzrs08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzrs08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzrs08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzrs08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzrs08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzrs08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzrs08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzrs08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzrs08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzrs08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzrs08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzrs08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzrs08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzrs08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}