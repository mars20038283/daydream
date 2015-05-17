package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjifmi;

public class ZjifmiCriteria extends SqlCriteria<Zjifmi> {

	public static final String TABLE_NAME  = "zjifmi";

	public ZjifmiCriteria() {
		super(Zjifmi.class);
	}

	public ZjifmiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zjifmi.class);
	}

	public void save(Zjifmi zjifmi) throws MarsException {
		super.save(zjifmi);
	}

	public void update(Zjifmi zjifmi) throws MarsException {
		super.update(zjifmi);
	}

	public void delete(Zjifmi zjifmi) throws MarsException {
		super.delete(zjifmi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZjifmiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZjifmiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZjifmiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZjifmiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZjifmiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZjifmiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZjifmiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZjifmiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZjifmiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZjifmiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZjifmiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZjifmiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZjifmiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZjifmiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZjifmiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}