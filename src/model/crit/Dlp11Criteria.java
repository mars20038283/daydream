package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp11;

public class Dlp11Criteria extends SqlCriteria<Dlp11> {

	public static final String TABLE_NAME  = "dlp11";

	public Dlp11Criteria() {
		super(Dlp11.class);
	}

	public Dlp11Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp11.class);
	}

	public void save(Dlp11 dlp11) throws MarsException {
		super.save(dlp11);
	}

	public void update(Dlp11 dlp11) throws MarsException {
		super.update(dlp11);
	}

	public void delete(Dlp11 dlp11) throws MarsException {
		super.delete(dlp11);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp11Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp11Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp11Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp11Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp11Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp11Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp11Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp11Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp11Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp11Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp11Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp11Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp11Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp11Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp11Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}