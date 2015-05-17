package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhmi;

public class ZzwhmiCriteria extends SqlCriteria<Zzwhmi> {

	public static final String TABLE_NAME  = "zzwhmi";

	public ZzwhmiCriteria() {
		super(Zzwhmi.class);
	}

	public ZzwhmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhmi.class);
	}

	public void save(Zzwhmi zzwhmi) throws MarsException {
		super.save(zzwhmi);
	}

	public void update(Zzwhmi zzwhmi) throws MarsException {
		super.update(zzwhmi);
	}

	public void delete(Zzwhmi zzwhmi) throws MarsException {
		super.delete(zzwhmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzwhmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzwhmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzwhmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzwhmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzwhmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzwhmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzwhmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzwhmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzwhmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzwhmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzwhmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzwhmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzwhmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzwhmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzwhmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}