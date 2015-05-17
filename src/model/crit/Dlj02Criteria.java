package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlj02;

public class Dlj02Criteria extends SqlCriteria<Dlj02> {

	public static final String TABLE_NAME  = "dlj02";

	public Dlj02Criteria() {
		super(Dlj02.class);
	}

	public Dlj02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlj02.class);
	}

	public void save(Dlj02 dlj02) throws MarsException {
		super.save(dlj02);
	}

	public void update(Dlj02 dlj02) throws MarsException {
		super.update(dlj02);
	}

	public void delete(Dlj02 dlj02) throws MarsException {
		super.delete(dlj02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlj02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlj02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlj02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlj02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlj02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlj02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlj02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlj02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlj02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlj02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlj02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlj02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlj02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlj02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlj02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}