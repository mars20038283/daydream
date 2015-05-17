package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqagmi;

public class SqagmiCriteria extends SqlCriteria<Sqagmi> {

	public static final String TABLE_NAME  = "sqagmi";

	public SqagmiCriteria() {
		super(Sqagmi.class);
	}

	public SqagmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqagmi.class);
	}

	public void save(Sqagmi sqagmi) throws MarsException {
		super.save(sqagmi);
	}

	public void update(Sqagmi sqagmi) throws MarsException {
		super.update(sqagmi);
	}

	public void delete(Sqagmi sqagmi) throws MarsException {
		super.delete(sqagmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqagmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqagmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqagmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqagmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqagmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqagmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqagmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqagmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqagmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqagmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqagmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqagmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqagmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqagmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqagmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}