package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqagvi;

public class SqagviCriteria extends SqlCriteria<Sqagvi> {

	public static final String TABLE_NAME  = "sqagvi";

	public SqagviCriteria() {
		super(Sqagvi.class);
	}

	public SqagviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqagvi.class);
	}

	public void save(Sqagvi sqagvi) throws MarsException {
		super.save(sqagvi);
	}

	public void update(Sqagvi sqagvi) throws MarsException {
		super.update(sqagvi);
	}

	public void delete(Sqagvi sqagvi) throws MarsException {
		super.delete(sqagvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqagviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqagviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqagviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqagviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqagviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqagviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqagviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqagviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqagviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqagviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqagviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqagviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqagviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqagviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqagviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}