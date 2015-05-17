package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll05;

public class Dll05Criteria extends SqlCriteria<Dll05> {

	public static final String TABLE_NAME  = "dll05";

	public Dll05Criteria() {
		super(Dll05.class);
	}

	public Dll05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll05.class);
	}

	public void save(Dll05 dll05) throws MarsException {
		super.save(dll05);
	}

	public void update(Dll05 dll05) throws MarsException {
		super.update(dll05);
	}

	public void delete(Dll05 dll05) throws MarsException {
		super.delete(dll05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}