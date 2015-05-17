package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlbpi;

public class DlbpiCriteria extends SqlCriteria<Dlbpi> {

	public static final String TABLE_NAME  = "dlbpi";

	public DlbpiCriteria() {
		super(Dlbpi.class);
	}

	public DlbpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlbpi.class);
	}

	public void save(Dlbpi dlbpi) throws MarsException {
		super.save(dlbpi);
	}

	public void update(Dlbpi dlbpi) throws MarsException {
		super.update(dlbpi);
	}

	public void delete(Dlbpi dlbpi) throws MarsException {
		super.delete(dlbpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlbpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlbpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlbpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlbpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlbpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlbpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlbpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlbpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlbpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlbpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlbpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlbpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlbpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlbpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlbpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}