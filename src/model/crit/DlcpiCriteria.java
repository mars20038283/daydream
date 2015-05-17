package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlcpi;

public class DlcpiCriteria extends SqlCriteria<Dlcpi> {

	public static final String TABLE_NAME  = "dlcpi";

	public DlcpiCriteria() {
		super(Dlcpi.class);
	}

	public DlcpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlcpi.class);
	}

	public void save(Dlcpi dlcpi) throws MarsException {
		super.save(dlcpi);
	}

	public void update(Dlcpi dlcpi) throws MarsException {
		super.update(dlcpi);
	}

	public void delete(Dlcpi dlcpi) throws MarsException {
		super.delete(dlcpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlcpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlcpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlcpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlcpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlcpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlcpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlcpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlcpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlcpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlcpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlcpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlcpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlcpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlcpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlcpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}