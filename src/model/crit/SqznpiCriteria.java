package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqznpi;

public class SqznpiCriteria extends SqlCriteria<Sqznpi> {

	public static final String TABLE_NAME  = "sqznpi";

	public SqznpiCriteria() {
		super(Sqznpi.class);
	}

	public SqznpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqznpi.class);
	}

	public void save(Sqznpi sqznpi) throws MarsException {
		super.save(sqznpi);
	}

	public void update(Sqznpi sqznpi) throws MarsException {
		super.update(sqznpi);
	}

	public void delete(Sqznpi sqznpi) throws MarsException {
		super.delete(sqznpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqznpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqznpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqznpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqznpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqznpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqznpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqznpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqznpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqznpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqznpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqznpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqznpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqznpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqznpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqznpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}