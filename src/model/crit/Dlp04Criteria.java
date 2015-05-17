package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp04;

public class Dlp04Criteria extends SqlCriteria<Dlp04> {

	public static final String TABLE_NAME  = "dlp04";

	public Dlp04Criteria() {
		super(Dlp04.class);
	}

	public Dlp04Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp04.class);
	}

	public void save(Dlp04 dlp04) throws MarsException {
		super.save(dlp04);
	}

	public void update(Dlp04 dlp04) throws MarsException {
		super.update(dlp04);
	}

	public void delete(Dlp04 dlp04) throws MarsException {
		super.delete(dlp04);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp04Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp04Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp04Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp04Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp04Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp04Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp04Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp04Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp04Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp04Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp04Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp04Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp04Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp04Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp04Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}