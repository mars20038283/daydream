package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpmmi;

public class ZzpmmiCriteria extends SqlCriteria<Zzpmmi> {

	public static final String TABLE_NAME  = "zzpmmi";

	public ZzpmmiCriteria() {
		super(Zzpmmi.class);
	}

	public ZzpmmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpmmi.class);
	}

	public void save(Zzpmmi zzpmmi) throws MarsException {
		super.save(zzpmmi);
	}

	public void update(Zzpmmi zzpmmi) throws MarsException {
		super.update(zzpmmi);
	}

	public void delete(Zzpmmi zzpmmi) throws MarsException {
		super.delete(zzpmmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzpmmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzpmmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzpmmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzpmmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzpmmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzpmmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzpmmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzpmmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzpmmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzpmmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzpmmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzpmmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzpmmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzpmmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzpmmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}