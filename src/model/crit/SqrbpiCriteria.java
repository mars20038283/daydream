package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqrbpi;

public class SqrbpiCriteria extends SqlCriteria<Sqrbpi> {

	public static final String TABLE_NAME  = "sqrbpi";

	public SqrbpiCriteria() {
		super(Sqrbpi.class);
	}

	public SqrbpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqrbpi.class);
	}

	public void save(Sqrbpi sqrbpi) throws MarsException {
		super.save(sqrbpi);
	}

	public void update(Sqrbpi sqrbpi) throws MarsException {
		super.update(sqrbpi);
	}

	public void delete(Sqrbpi sqrbpi) throws MarsException {
		super.delete(sqrbpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqrbpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqrbpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqrbpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqrbpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqrbpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqrbpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqrbpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqrbpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqrbpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqrbpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqrbpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqrbpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqrbpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqrbpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqrbpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}