package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqagpi;

public class SqagpiCriteria extends SqlCriteria<Sqagpi> {

	public static final String TABLE_NAME  = "sqagpi";

	public SqagpiCriteria() {
		super(Sqagpi.class);
	}

	public SqagpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqagpi.class);
	}

	public void save(Sqagpi sqagpi) throws MarsException {
		super.save(sqagpi);
	}

	public void update(Sqagpi sqagpi) throws MarsException {
		super.update(sqagpi);
	}

	public void delete(Sqagpi sqagpi) throws MarsException {
		super.delete(sqagpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqagpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqagpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqagpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqagpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqagpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqagpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqagpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqagpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqagpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqagpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqagpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqagpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqagpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqagpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqagpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}