package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dljmmi;

public class DljmmiCriteria extends SqlCriteria<Dljmmi> {

	public static final String TABLE_NAME  = "dljmmi";

	public DljmmiCriteria() {
		super(Dljmmi.class);
	}

	public DljmmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Dljmmi.class);
	}

	public void save(Dljmmi dljmmi) throws MarsException {
		super.save(dljmmi);
	}

	public void update(Dljmmi dljmmi) throws MarsException {
		super.update(dljmmi);
	}

	public void delete(Dljmmi dljmmi) throws MarsException {
		super.delete(dljmmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public DljmmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(DljmmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public DljmmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(DljmmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public DljmmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(DljmmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public DljmmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(DljmmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public DljmmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(DljmmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public DljmmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(DljmmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public DljmmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(DljmmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public DljmmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}