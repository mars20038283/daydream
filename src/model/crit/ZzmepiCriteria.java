package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzmepi;

public class ZzmepiCriteria extends SqlCriteria<Zzmepi> {

	public static final String TABLE_NAME  = "zzmepi";

	public ZzmepiCriteria() {
		super(Zzmepi.class);
	}

	public ZzmepiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzmepi.class);
	}

	public void save(Zzmepi zzmepi) throws MarsException {
		super.save(zzmepi);
	}

	public void update(Zzmepi zzmepi) throws MarsException {
		super.update(zzmepi);
	}

	public void delete(Zzmepi zzmepi) throws MarsException {
		super.delete(zzmepi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzmepiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzmepiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzmepiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzmepiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzmepiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzmepiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzmepiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzmepiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzmepiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzmepiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzmepiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzmepiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzmepiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzmepiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzmepiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}