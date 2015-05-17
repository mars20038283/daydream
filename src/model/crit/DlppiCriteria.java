package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlppi;

public class DlppiCriteria extends SqlCriteria<Dlppi> {

	public static final String TABLE_NAME  = "dlppi";

	public DlppiCriteria() {
		super(Dlppi.class);
	}

	public DlppiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlppi.class);
	}

	public void save(Dlppi dlppi) throws MarsException {
		super.save(dlppi);
	}

	public void update(Dlppi dlppi) throws MarsException {
		super.update(dlppi);
	}

	public void delete(Dlppi dlppi) throws MarsException {
		super.delete(dlppi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlppiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlppiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlppiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlppiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlppiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlppiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlppiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlppiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlppiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlppiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlppiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlppiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlppiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlppiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlppiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}