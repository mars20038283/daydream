package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzme11;

public class Zzme11Criteria extends SqlCriteria<Zzme11> {

	public static final String TABLE_NAME  = "zzme11";

	public Zzme11Criteria() {
		super(Zzme11.class);
	}

	public Zzme11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzme11.class);
	}

	public void save(Zzme11 zzme11) throws MarsException {
		super.save(zzme11);
	}

	public void update(Zzme11 zzme11) throws MarsException {
		super.update(zzme11);
	}

	public void delete(Zzme11 zzme11) throws MarsException {
		super.delete(zzme11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzme11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzme11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzme11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzme11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzme11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzme11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzme11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzme11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzme11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzme11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzme11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzme11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzme11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzme11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzme11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}