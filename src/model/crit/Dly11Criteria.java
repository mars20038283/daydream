package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dly11;

public class Dly11Criteria extends SqlCriteria<Dly11> {

	public static final String TABLE_NAME  = "dly11";

	public Dly11Criteria() {
		super(Dly11.class);
	}

	public Dly11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dly11.class);
	}

	public void save(Dly11 dly11) throws MarsException {
		super.save(dly11);
	}

	public void update(Dly11 dly11) throws MarsException {
		super.update(dly11);
	}

	public void delete(Dly11 dly11) throws MarsException {
		super.delete(dly11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dly11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dly11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dly11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dly11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dly11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dly11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dly11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dly11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dly11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dly11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dly11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dly11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dly11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dly11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dly11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}