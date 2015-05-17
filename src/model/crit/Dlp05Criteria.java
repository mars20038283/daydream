package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp05;

public class Dlp05Criteria extends SqlCriteria<Dlp05> {

	public static final String TABLE_NAME  = "dlp05";

	public Dlp05Criteria() {
		super(Dlp05.class);
	}

	public Dlp05Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp05.class);
	}

	public void save(Dlp05 dlp05) throws MarsException {
		super.save(dlp05);
	}

	public void update(Dlp05 dlp05) throws MarsException {
		super.update(dlp05);
	}

	public void delete(Dlp05 dlp05) throws MarsException {
		super.delete(dlp05);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp05Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp05Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp05Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp05Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp05Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp05Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp05Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp05Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp05Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp05Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp05Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp05Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp05Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp05Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp05Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}