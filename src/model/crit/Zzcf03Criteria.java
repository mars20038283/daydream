package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzcf03;

public class Zzcf03Criteria extends SqlCriteria<Zzcf03> {

	public static final String TABLE_NAME  = "zzcf03";

	public Zzcf03Criteria() {
		super(Zzcf03.class);
	}

	public Zzcf03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Zzcf03.class);
	}

	public void save(Zzcf03 zzcf03) throws MarsException {
		super.save(zzcf03);
	}

	public void update(Zzcf03 zzcf03) throws MarsException {
		super.update(zzcf03);
	}

	public void delete(Zzcf03 zzcf03) throws MarsException {
		super.delete(zzcf03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Zzcf03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Zzcf03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Zzcf03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Zzcf03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Zzcf03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Zzcf03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Zzcf03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Zzcf03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Zzcf03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Zzcf03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Zzcf03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Zzcf03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Zzcf03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Zzcf03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Zzcf03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}