package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp10;

public class Dlp10Criteria extends SqlCriteria<Dlp10> {

	public static final String TABLE_NAME  = "dlp10";

	public Dlp10Criteria() {
		super(Dlp10.class);
	}

	public Dlp10Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp10.class);
	}

	public void save(Dlp10 dlp10) throws MarsException {
		super.save(dlp10);
	}

	public void update(Dlp10 dlp10) throws MarsException {
		super.update(dlp10);
	}

	public void delete(Dlp10 dlp10) throws MarsException {
		super.delete(dlp10);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp10Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp10Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp10Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp10Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp10Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp10Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp10Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp10Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp10Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp10Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp10Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp10Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp10Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp10Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp10Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}