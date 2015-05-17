package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjif02;

public class Zjif02Criteria extends SqlCriteria<Zjif02> {

	public static final String TABLE_NAME  = "zjif02";

	public Zjif02Criteria() {
		super(Zjif02.class);
	}

	public Zjif02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zjif02.class);
	}

	public void save(Zjif02 zjif02) throws MarsException {
		super.save(zjif02);
	}

	public void update(Zjif02 zjif02) throws MarsException {
		super.update(zjif02);
	}

	public void delete(Zjif02 zjif02) throws MarsException {
		super.delete(zjif02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zjif02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zjif02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zjif02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zjif02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zjif02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zjif02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zjif02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zjif02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zjif02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zjif02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zjif02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zjif02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zjif02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zjif02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zjif02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}