package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlvpi;

public class DlvpiCriteria extends SqlCriteria<Dlvpi> {

	public static final String TABLE_NAME  = "dlvpi";

	public DlvpiCriteria() {
		super(Dlvpi.class);
	}

	public DlvpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlvpi.class);
	}

	public void save(Dlvpi dlvpi) throws MarsException {
		super.save(dlvpi);
	}

	public void update(Dlvpi dlvpi) throws MarsException {
		super.update(dlvpi);
	}

	public void delete(Dlvpi dlvpi) throws MarsException {
		super.delete(dlvpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlvpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlvpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlvpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlvpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlvpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlvpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlvpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlvpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlvpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlvpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlvpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlvpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlvpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlvpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlvpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}