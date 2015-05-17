package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Dlp03;

public class Dlp03Criteria extends SqlCriteria<Dlp03> {

	public static final String TABLE_NAME  = "dlp03";

	public Dlp03Criteria() {
		super(Dlp03.class);
	}

	public Dlp03Criteria(DriverInfo driverInfo) {
		super(driverInfo, Dlp03.class);
	}

	public void save(Dlp03 dlp03) throws MarsException {
		super.save(dlp03);
	}

	public void update(Dlp03 dlp03) throws MarsException {
		super.update(dlp03);
	}

	public void delete(Dlp03 dlp03) throws MarsException {
		super.delete(dlp03);
	}

	public static final String DATA_ID = "DATA_ID";

	public Dlp03Criteria findByDataId(String dataId) {
		this.findByPropertyEq(Dlp03Criteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public Dlp03Criteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(Dlp03Criteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public Dlp03Criteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(Dlp03Criteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public Dlp03Criteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(Dlp03Criteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public Dlp03Criteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(Dlp03Criteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public Dlp03Criteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(Dlp03Criteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public Dlp03Criteria findByChicang(Integer chicang) {
		this.findByPropertyEq(Dlp03Criteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public Dlp03Criteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}