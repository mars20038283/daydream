package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj11;

public class Dlj11Criteria extends SqlCriteria<Dlj11> {

	public static final String TABLE_NAME  = "dlj11";

	public Dlj11Criteria() {
		super(Dlj11.class);
	}

	public Dlj11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj11.class);
	}

	public void save(Dlj11 dlj11) throws MarsException {
		super.save(dlj11);
	}

	public void update(Dlj11 dlj11) throws MarsException {
		super.update(dlj11);
	}

	public void delete(Dlj11 dlj11) throws MarsException {
		super.delete(dlj11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}