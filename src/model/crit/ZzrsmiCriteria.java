package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrsmi;

public class ZzrsmiCriteria extends SqlCriteria<Zzrsmi> {

	public static final String TABLE_NAME  = "zzrsmi";

	public ZzrsmiCriteria() {
		super(Zzrsmi.class);
	}

	public ZzrsmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrsmi.class);
	}

	public void save(Zzrsmi zzrsmi) throws MarsException {
		super.save(zzrsmi);
	}

	public void update(Zzrsmi zzrsmi) throws MarsException {
		super.update(zzrsmi);
	}

	public void delete(Zzrsmi zzrsmi) throws MarsException {
		super.delete(zzrsmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrsmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrsmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrsmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrsmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrsmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrsmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrsmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrsmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrsmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrsmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrsmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrsmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrsmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrsmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrsmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}