package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjifpi;

public class ZjifpiCriteria extends SqlCriteria<Zjifpi> {

	public static final String TABLE_NAME  = "zjifpi";

	public ZjifpiCriteria() {
		super(Zjifpi.class);
	}

	public ZjifpiCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zjifpi.class);
	}

	public void save(Zjifpi zjifpi) throws MarsException {
		super.save(zjifpi);
	}

	public void update(Zjifpi zjifpi) throws MarsException {
		super.update(zjifpi);
	}

	public void delete(Zjifpi zjifpi) throws MarsException {
		super.delete(zjifpi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZjifpiCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZjifpiCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZjifpiCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZjifpiCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZjifpiCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZjifpiCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZjifpiCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZjifpiCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZjifpiCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZjifpiCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZjifpiCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZjifpiCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZjifpiCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZjifpiCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZjifpiCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}