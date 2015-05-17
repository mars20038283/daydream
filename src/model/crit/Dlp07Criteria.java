package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp07;

public class Dlp07Criteria extends SqlCriteria<Dlp07> {

	public static final String TABLE_NAME  = "dlp07";

	public Dlp07Criteria() {
		super(Dlp07.class);
	}

	public Dlp07Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp07.class);
	}

	public void save(Dlp07 dlp07) throws MarsException {
		super.save(dlp07);
	}

	public void update(Dlp07 dlp07) throws MarsException {
		super.update(dlp07);
	}

	public void delete(Dlp07 dlp07) throws MarsException {
		super.delete(dlp07);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp07Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp07Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp07Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp07Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp07Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp07Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp07Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp07Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp07Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp07Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp07Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp07Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp07Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp07Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp07Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}