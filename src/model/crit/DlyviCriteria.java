package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlyvi;

public class DlyviCriteria extends SqlCriteria<Dlyvi> {

	public static final String TABLE_NAME  = "dlyvi";

	public DlyviCriteria() {
		super(Dlyvi.class);
	}

	public DlyviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlyvi.class);
	}

	public void save(Dlyvi dlyvi) throws MarsException {
		super.save(dlyvi);
	}

	public void update(Dlyvi dlyvi) throws MarsException {
		super.update(dlyvi);
	}

	public void delete(Dlyvi dlyvi) throws MarsException {
		super.delete(dlyvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlyviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlyviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlyviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlyviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlyviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlyviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlyviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlyviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlyviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlyviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlyviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlyviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlyviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlyviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlyviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}