package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Sqaupi;

public class SqaupiCriteria extends SqlCriteria<Sqaupi> {

	public static final String TABLE_NAME  = "sqaupi";

	public SqaupiCriteria() {
		super(Sqaupi.class);
	}

	public SqaupiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Sqaupi.class);
	}

	public void save(Sqaupi sqaupi) throws MarsException {
		super.save(sqaupi);
	}

	public void update(Sqaupi sqaupi) throws MarsException {
		super.update(sqaupi);
	}

	public void delete(Sqaupi sqaupi) throws MarsException {
		super.delete(sqaupi);
	}

	public static final String DATA_ID = "DATA_ID";

	public SqaupiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(SqaupiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public SqaupiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(SqaupiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public SqaupiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(SqaupiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public SqaupiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(SqaupiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public SqaupiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(SqaupiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public SqaupiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(SqaupiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public SqaupiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(SqaupiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public SqaupiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}