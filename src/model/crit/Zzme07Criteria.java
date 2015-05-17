package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme07;

public class Zzme07Criteria extends SqlCriteria<Zzme07> {

	public static final String TABLE_NAME  = "zzme07";

	public Zzme07Criteria() {
		super(Zzme07.class);
	}

	public Zzme07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme07.class);
	}

	public void save(Zzme07 zzme07) throws MarsException {
		super.save(zzme07);
	}

	public void update(Zzme07 zzme07) throws MarsException {
		super.update(zzme07);
	}

	public void delete(Zzme07 zzme07) throws MarsException {
		super.delete(zzme07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}