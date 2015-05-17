package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zzrmpi;

public class ZzrmpiCriteria extends SqlCriteria<Zzrmpi> {

	public static final String TABLE_NAME  = "zzrmpi";

	public ZzrmpiCriteria() {
		super(Zzrmpi.class);
	}

	public ZzrmpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zzrmpi.class);
	}

	public void save(Zzrmpi zzrmpi) throws MarsException {
		super.save(zzrmpi);
	}

	public void update(Zzrmpi zzrmpi) throws MarsException {
		super.update(zzrmpi);
	}

	public void delete(Zzrmpi zzrmpi) throws MarsException {
		super.delete(zzrmpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZzrmpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZzrmpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZzrmpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZzrmpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZzrmpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZzrmpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZzrmpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZzrmpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZzrmpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZzrmpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZzrmpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZzrmpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZzrmpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZzrmpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZzrmpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}