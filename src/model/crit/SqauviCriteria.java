package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqauvi;

public class SqauviCriteria extends SqlCriteria<Sqauvi> {

	public static final String TABLE_NAME  = "sqauvi";

	public SqauviCriteria() {
		super(Sqauvi.class);
	}

	public SqauviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqauvi.class);
	}

	public void save(Sqauvi sqauvi) throws MarsException {
		super.save(sqauvi);
	}

	public void update(Sqauvi sqauvi) throws MarsException {
		super.update(sqauvi);
	}

	public void delete(Sqauvi sqauvi) throws MarsException {
		super.delete(sqauvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqauviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqauviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqauviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqauviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqauviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqauviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqauviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqauviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqauviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqauviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqauviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqauviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqauviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqauviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqauviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}