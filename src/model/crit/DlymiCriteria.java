package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlymi;

public class DlymiCriteria extends SqlCriteria<Dlymi> {

	public static final String TABLE_NAME  = "dlymi";

	public DlymiCriteria() {
		super(Dlymi.class);
	}

	public DlymiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dlymi.class);
	}

	public void save(Dlymi dlymi) throws MarsException {
		super.save(dlymi);
	}

	public void update(Dlymi dlymi) throws MarsException {
		super.update(dlymi);
	}

	public void delete(Dlymi dlymi) throws MarsException {
		super.delete(dlymi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DlymiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DlymiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DlymiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DlymiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DlymiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DlymiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DlymiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DlymiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DlymiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DlymiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DlymiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DlymiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DlymiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DlymiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DlymiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}