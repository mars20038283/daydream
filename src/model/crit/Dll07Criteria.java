package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll07;

public class Dll07Criteria extends SqlCriteria<Dll07> {

	public static final String TABLE_NAME  = "dll07";

	public Dll07Criteria() {
		super(Dll07.class);
	}

	public Dll07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll07.class);
	}

	public void save(Dll07 dll07) throws MarsException {
		super.save(dll07);
	}

	public void update(Dll07 dll07) throws MarsException {
		super.update(dll07);
	}

	public void delete(Dll07 dll07) throws MarsException {
		super.delete(dll07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}