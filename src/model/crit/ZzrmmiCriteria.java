package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrmmi;

public class ZzrmmiCriteria extends SqlCriteria<Zzrmmi> {

	public static final String TABLE_NAME  = "zzrmmi";

	public ZzrmmiCriteria() {
		super(Zzrmmi.class);
	}

	public ZzrmmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrmmi.class);
	}

	public void save(Zzrmmi zzrmmi) throws MarsException {
		super.save(zzrmmi);
	}

	public void update(Zzrmmi zzrmmi) throws MarsException {
		super.update(zzrmmi);
	}

	public void delete(Zzrmmi zzrmmi) throws MarsException {
		super.delete(zzrmmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrmmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrmmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrmmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrmmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrmmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrmmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrmmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrmmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrmmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrmmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrmmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrmmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrmmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrmmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrmmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}