package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrspi;

public class ZzrspiCriteria extends SqlCriteria<Zzrspi> {

	public static final String TABLE_NAME  = "zzrspi";

	public ZzrspiCriteria() {
		super(Zzrspi.class);
	}

	public ZzrspiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrspi.class);
	}

	public void save(Zzrspi zzrspi) throws MarsException {
		super.save(zzrspi);
	}

	public void update(Zzrspi zzrspi) throws MarsException {
		super.update(zzrspi);
	}

	public void delete(Zzrspi zzrspi) throws MarsException {
		super.delete(zzrspi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrspiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrspiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrspiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrspiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrspiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrspiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrspiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrspiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrspiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrspiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrspiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrspiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrspiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrspiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrspiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}