package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj12;

public class Dlj12Criteria extends SqlCriteria<Dlj12> {

	public static final String TABLE_NAME  = "dlj12";

	public Dlj12Criteria() {
		super(Dlj12.class);
	}

	public Dlj12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj12.class);
	}

	public void save(Dlj12 dlj12) throws MarsException {
		super.save(dlj12);
	}

	public void update(Dlj12 dlj12) throws MarsException {
		super.update(dlj12);
	}

	public void delete(Dlj12 dlj12) throws MarsException {
		super.delete(dlj12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}