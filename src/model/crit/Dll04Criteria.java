package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dll04;

public class Dll04Criteria extends SqlCriteria<Dll04> {

	public static final String TABLE_NAME  = "dll04";

	public Dll04Criteria() {
		super(Dll04.class);
	}

	public Dll04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dll04.class);
	}

	public void save(Dll04 dll04) throws MarsException {
		super.save(dll04);
	}

	public void update(Dll04 dll04) throws MarsException {
		super.update(dll04);
	}

	public void delete(Dll04 dll04) throws MarsException {
		super.delete(dll04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dll04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dll04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dll04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dll04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dll04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dll04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dll04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dll04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dll04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dll04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dll04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dll04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dll04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dll04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dll04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}