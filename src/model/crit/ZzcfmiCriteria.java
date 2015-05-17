package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcfmi;

public class ZzcfmiCriteria extends SqlCriteria<Zzcfmi> {

	public static final String TABLE_NAME  = "zzcfmi";

	public ZzcfmiCriteria() {
		super(Zzcfmi.class);
	}

	public ZzcfmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcfmi.class);
	}

	public void save(Zzcfmi zzcfmi) throws MarsException {
		super.save(zzcfmi);
	}

	public void update(Zzcfmi zzcfmi) throws MarsException {
		super.update(zzcfmi);
	}

	public void delete(Zzcfmi zzcfmi) throws MarsException {
		super.delete(zzcfmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzcfmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzcfmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzcfmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzcfmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzcfmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzcfmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzcfmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzcfmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzcfmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzcfmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzcfmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzcfmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzcfmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzcfmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzcfmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}