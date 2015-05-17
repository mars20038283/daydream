package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlmpi;

public class DlmpiCriteria extends SqlCriteria<Dlmpi> {

	public static final String TABLE_NAME  = "dlmpi";

	public DlmpiCriteria() {
		super(Dlmpi.class);
	}

	public DlmpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlmpi.class);
	}

	public void save(Dlmpi dlmpi) throws MarsException {
		super.save(dlmpi);
	}

	public void update(Dlmpi dlmpi) throws MarsException {
		super.update(dlmpi);
	}

	public void delete(Dlmpi dlmpi) throws MarsException {
		super.delete(dlmpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlmpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlmpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlmpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlmpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlmpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlmpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlmpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlmpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlmpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlmpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlmpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlmpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlmpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlmpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlmpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}