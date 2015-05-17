package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp08;

public class Dlp08Criteria extends SqlCriteria<Dlp08> {

	public static final String TABLE_NAME  = "dlp08";

	public Dlp08Criteria() {
		super(Dlp08.class);
	}

	public Dlp08Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp08.class);
	}

	public void save(Dlp08 dlp08) throws MarsException {
		super.save(dlp08);
	}

	public void update(Dlp08 dlp08) throws MarsException {
		super.update(dlp08);
	}

	public void delete(Dlp08 dlp08) throws MarsException {
		super.delete(dlp08);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp08Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp08Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp08Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp08Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp08Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp08Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp08Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp08Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp08Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp08Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp08Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp08Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp08Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp08Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp08Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}