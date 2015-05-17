package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoi05;

public class Zzoi05Criteria extends SqlCriteria<Zzoi05> {

	public static final String TABLE_NAME  = "zzoi05";

	public Zzoi05Criteria() {
		super(Zzoi05.class);
	}

	public Zzoi05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoi05.class);
	}

	public void save(Zzoi05 zzoi05) throws MarsException {
		super.save(zzoi05);
	}

	public void update(Zzoi05 zzoi05) throws MarsException {
		super.update(zzoi05);
	}

	public void delete(Zzoi05 zzoi05) throws MarsException {
		super.delete(zzoi05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzoi05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzoi05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzoi05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzoi05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzoi05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzoi05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzoi05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzoi05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzoi05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzoi05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzoi05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzoi05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzoi05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzoi05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzoi05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}