package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqznmi;

public class SqznmiCriteria extends SqlCriteria<Sqznmi> {

	public static final String TABLE_NAME  = "sqznmi";

	public SqznmiCriteria() {
		super(Sqznmi.class);
	}

	public SqznmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqznmi.class);
	}

	public void save(Sqznmi sqznmi) throws MarsException {
		super.save(sqznmi);
	}

	public void update(Sqznmi sqznmi) throws MarsException {
		super.update(sqznmi);
	}

	public void delete(Sqznmi sqznmi) throws MarsException {
		super.delete(sqznmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqznmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqznmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqznmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqznmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqznmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqznmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqznmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqznmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqznmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqznmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqznmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqznmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqznmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqznmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqznmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}