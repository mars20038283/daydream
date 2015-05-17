package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlypi;

public class DlypiCriteria extends SqlCriteria<Dlypi> {

	public static final String TABLE_NAME  = "dlypi";

	public DlypiCriteria() {
		super(Dlypi.class);
	}

	public DlypiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlypi.class);
	}

	public void save(Dlypi dlypi) throws MarsException {
		super.save(dlypi);
	}

	public void update(Dlypi dlypi) throws MarsException {
		super.update(dlypi);
	}

	public void delete(Dlypi dlypi) throws MarsException {
		super.delete(dlypi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlypiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlypiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlypiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlypiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlypiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlypiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlypiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlypiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlypiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlypiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlypiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlypiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlypiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlypiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlypiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}