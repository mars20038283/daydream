package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljmpi;

public class DljmpiCriteria extends SqlCriteria<Dljmpi> {

	public static final String TABLE_NAME  = "dljmpi";

	public DljmpiCriteria() {
		super(Dljmpi.class);
	}

	public DljmpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljmpi.class);
	}

	public void save(Dljmpi dljmpi) throws MarsException {
		super.save(dljmpi);
	}

	public void update(Dljmpi dljmpi) throws MarsException {
		super.update(dljmpi);
	}

	public void delete(Dljmpi dljmpi) throws MarsException {
		super.delete(dljmpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljmpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljmpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljmpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljmpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljmpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljmpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljmpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljmpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljmpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljmpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljmpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljmpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljmpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljmpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljmpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}