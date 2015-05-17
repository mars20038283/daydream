package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqwr03;

public class Sqwr03Criteria extends SqlCriteria<Sqwr03> {

	public static final String TABLE_NAME  = "sqwr03";

	public Sqwr03Criteria() {
		super(Sqwr03.class);
	}

	public Sqwr03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Sqwr03.class);
	}

	public void save(Sqwr03 sqwr03) throws MarsException {
		super.save(sqwr03);
	}

	public void update(Sqwr03 sqwr03) throws MarsException {
		super.update(sqwr03);
	}

	public void delete(Sqwr03 sqwr03) throws MarsException {
		super.delete(sqwr03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Sqwr03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Sqwr03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Sqwr03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Sqwr03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Sqwr03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Sqwr03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Sqwr03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Sqwr03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Sqwr03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Sqwr03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Sqwr03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Sqwr03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Sqwr03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Sqwr03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Sqwr03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}