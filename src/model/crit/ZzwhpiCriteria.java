package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzwhpi;

public class ZzwhpiCriteria extends SqlCriteria<Zzwhpi> {

	public static final String TABLE_NAME  = "zzwhpi";

	public ZzwhpiCriteria() {
		super(Zzwhpi.class);
	}

	public ZzwhpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzwhpi.class);
	}

	public void save(Zzwhpi zzwhpi) throws MarsException {
		super.save(zzwhpi);
	}

	public void update(Zzwhpi zzwhpi) throws MarsException {
		super.update(zzwhpi);
	}

	public void delete(Zzwhpi zzwhpi) throws MarsException {
		super.delete(zzwhpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzwhpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzwhpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzwhpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzwhpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzwhpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzwhpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzwhpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzwhpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzwhpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzwhpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzwhpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzwhpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzwhpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzwhpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzwhpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}