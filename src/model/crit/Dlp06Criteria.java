package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp06;

public class Dlp06Criteria extends SqlCriteria<Dlp06> {

	public static final String TABLE_NAME  = "dlp06";

	public Dlp06Criteria() {
		super(Dlp06.class);
	}

	public Dlp06Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp06.class);
	}

	public void save(Dlp06 dlp06) throws MarsException {
		super.save(dlp06);
	}

	public void update(Dlp06 dlp06) throws MarsException {
		super.update(dlp06);
	}

	public void delete(Dlp06 dlp06) throws MarsException {
		super.delete(dlp06);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp06Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp06Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp06Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp06Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp06Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp06Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp06Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp06Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp06Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp06Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp06Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp06Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp06Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp06Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp06Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}