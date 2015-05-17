package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzripi;

public class ZzripiCriteria extends SqlCriteria<Zzripi> {

	public static final String TABLE_NAME  = "zzripi";

	public ZzripiCriteria() {
		super(Zzripi.class);
	}

	public ZzripiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzripi.class);
	}

	public void save(Zzripi zzripi) throws MarsException {
		super.save(zzripi);
	}

	public void update(Zzripi zzripi) throws MarsException {
		super.update(zzripi);
	}

	public void delete(Zzripi zzripi) throws MarsException {
		super.delete(zzripi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzripiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzripiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzripiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzripiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzripiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzripiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzripiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzripiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzripiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzripiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzripiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzripiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzripiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzripiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzripiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}