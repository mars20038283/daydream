package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp12;

public class Dlp12Criteria extends SqlCriteria<Dlp12> {

	public static final String TABLE_NAME  = "dlp12";

	public Dlp12Criteria() {
		super(Dlp12.class);
	}

	public Dlp12Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp12.class);
	}

	public void save(Dlp12 dlp12) throws MarsException {
		super.save(dlp12);
	}

	public void update(Dlp12 dlp12) throws MarsException {
		super.update(dlp12);
	}

	public void delete(Dlp12 dlp12) throws MarsException {
		super.delete(dlp12);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp12Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp12Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp12Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp12Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp12Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp12Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp12Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp12Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp12Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp12Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp12Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp12Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp12Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp12Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp12Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}