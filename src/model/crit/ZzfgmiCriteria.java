package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzfgmi;

public class ZzfgmiCriteria extends SqlCriteria<Zzfgmi> {

	public static final String TABLE_NAME  = "zzfgmi";

	public ZzfgmiCriteria() {
		super(Zzfgmi.class);
	}

	public ZzfgmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzfgmi.class);
	}

	public void save(Zzfgmi zzfgmi) throws MarsException {
		super.save(zzfgmi);
	}

	public void update(Zzfgmi zzfgmi) throws MarsException {
		super.update(zzfgmi);
	}

	public void delete(Zzfgmi zzfgmi) throws MarsException {
		super.delete(zzfgmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzfgmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzfgmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzfgmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzfgmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzfgmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzfgmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzfgmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzfgmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzfgmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzfgmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzfgmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzfgmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzfgmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzfgmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzfgmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}