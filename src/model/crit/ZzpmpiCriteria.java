package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzpmpi;

public class ZzpmpiCriteria extends SqlCriteria<Zzpmpi> {

	public static final String TABLE_NAME  = "zzpmpi";

	public ZzpmpiCriteria() {
		super(Zzpmpi.class);
	}

	public ZzpmpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzpmpi.class);
	}

	public void save(Zzpmpi zzpmpi) throws MarsException {
		super.save(zzpmpi);
	}

	public void update(Zzpmpi zzpmpi) throws MarsException {
		super.update(zzpmpi);
	}

	public void delete(Zzpmpi zzpmpi) throws MarsException {
		super.delete(zzpmpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzpmpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzpmpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzpmpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzpmpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzpmpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzpmpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzpmpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzpmpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzpmpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzpmpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzpmpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzpmpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzpmpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzpmpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzpmpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}