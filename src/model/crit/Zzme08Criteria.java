package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme08;

public class Zzme08Criteria extends SqlCriteria<Zzme08> {

	public static final String TABLE_NAME  = "zzme08";

	public Zzme08Criteria() {
		super(Zzme08.class);
	}

	public Zzme08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme08.class);
	}

	public void save(Zzme08 zzme08) throws MarsException {
		super.save(zzme08);
	}

	public void update(Zzme08 zzme08) throws MarsException {
		super.update(zzme08);
	}

	public void delete(Zzme08 zzme08) throws MarsException {
		super.delete(zzme08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}