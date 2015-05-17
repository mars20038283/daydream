package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzoimi;

public class ZzoimiCriteria extends SqlCriteria<Zzoimi> {

	public static final String TABLE_NAME  = "zzoimi";

	public ZzoimiCriteria() {
		super(Zzoimi.class);
	}

	public ZzoimiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzoimi.class);
	}

	public void save(Zzoimi zzoimi) throws MarsException {
		super.save(zzoimi);
	}

	public void update(Zzoimi zzoimi) throws MarsException {
		super.update(zzoimi);
	}

	public void delete(Zzoimi zzoimi) throws MarsException {
		super.delete(zzoimi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzoimiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzoimiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzoimiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzoimiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzoimiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzoimiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzoimiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzoimiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzoimiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzoimiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzoimiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzoimiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzoimiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzoimiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzoimiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}