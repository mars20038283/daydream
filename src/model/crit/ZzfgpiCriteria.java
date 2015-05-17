package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfgpi;

public class ZzfgpiCriteria extends SqlCriteria<Zzfgpi> {

	public static final String TABLE_NAME  = "zzfgpi";

	public ZzfgpiCriteria() {
		super(Zzfgpi.class);
	}

	public ZzfgpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfgpi.class);
	}

	public void save(Zzfgpi zzfgpi) throws MarsException {
		super.save(zzfgpi);
	}

	public void update(Zzfgpi zzfgpi) throws MarsException {
		super.update(zzfgpi);
	}

	public void delete(Zzfgpi zzfgpi) throws MarsException {
		super.delete(zzfgpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzfgpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzfgpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzfgpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzfgpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzfgpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzfgpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzfgpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzfgpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzfgpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzfgpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzfgpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzfgpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzfgpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzfgpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzfgpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}