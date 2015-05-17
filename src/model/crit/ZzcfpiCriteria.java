package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcfpi;

public class ZzcfpiCriteria extends SqlCriteria<Zzcfpi> {

	public static final String TABLE_NAME  = "zzcfpi";

	public ZzcfpiCriteria() {
		super(Zzcfpi.class);
	}

	public ZzcfpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcfpi.class);
	}

	public void save(Zzcfpi zzcfpi) throws MarsException {
		super.save(zzcfpi);
	}

	public void update(Zzcfpi zzcfpi) throws MarsException {
		super.update(zzcfpi);
	}

	public void delete(Zzcfpi zzcfpi) throws MarsException {
		super.delete(zzcfpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzcfpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzcfpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzcfpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzcfpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzcfpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzcfpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzcfpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzcfpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzcfpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzcfpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzcfpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzcfpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzcfpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzcfpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzcfpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}