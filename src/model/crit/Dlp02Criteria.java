package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp02;

public class Dlp02Criteria extends SqlCriteria<Dlp02> {

	public static final String TABLE_NAME  = "dlp02";

	public Dlp02Criteria() {
		super(Dlp02.class);
	}

	public Dlp02Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp02.class);
	}

	public void save(Dlp02 dlp02) throws MarsException {
		super.save(dlp02);
	}

	public void update(Dlp02 dlp02) throws MarsException {
		super.update(dlp02);
	}

	public void delete(Dlp02 dlp02) throws MarsException {
		super.delete(dlp02);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp02Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp02Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp02Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp02Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp02Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp02Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp02Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp02Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp02Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp02Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp02Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp02Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp02Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp02Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp02Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}