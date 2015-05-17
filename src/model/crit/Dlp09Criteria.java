package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp09;

public class Dlp09Criteria extends SqlCriteria<Dlp09> {

	public static final String TABLE_NAME  = "dlp09";

	public Dlp09Criteria() {
		super(Dlp09.class);
	}

	public Dlp09Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp09.class);
	}

	public void save(Dlp09 dlp09) throws MarsException {
		super.save(dlp09);
	}

	public void update(Dlp09 dlp09) throws MarsException {
		super.update(dlp09);
	}

	public void delete(Dlp09 dlp09) throws MarsException {
		super.delete(dlp09);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp09Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp09Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp09Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp09Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp09Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp09Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp09Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp09Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp09Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp09Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp09Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp09Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp09Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp09Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp09Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}