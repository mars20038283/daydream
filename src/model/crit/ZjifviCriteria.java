package model.crit;

import com.marswork.core.exceptions.messaging.MarsException;
import com.marswork.dataaccess.basic.DriverInfo;
import com.marswork.dataaccess.criteria.SqlCriteria;
import model.pojo.Zjifvi;

public class ZjifviCriteria extends SqlCriteria<Zjifvi> {

	public static final String TABLE_NAME  = "zjifvi";

	public ZjifviCriteria() {
		super(Zjifvi.class);
	}

	public ZjifviCriteria(DriverInfo driverInfo) {
		super(driverInfo, Zjifvi.class);
	}

	public void save(Zjifvi zjifvi) throws MarsException {
		super.save(zjifvi);
	}

	public void update(Zjifvi zjifvi) throws MarsException {
		super.update(zjifvi);
	}

	public void delete(Zjifvi zjifvi) throws MarsException {
		super.delete(zjifvi);
	}

	public static final String DATA_ID = "DATA_ID";

	public ZjifviCriteria findByDataId(String dataId) {
		this.findByPropertyEq(ZjifviCriteria.DATA_ID, TABLE_NAME, dataId);
		return this;
	}

	public static final String DATE = "DATE";

	public static final String KAIPAN = "KAIPAN";

	public ZjifviCriteria findByKaipan(Double kaipan) {
		this.findByPropertyEq(ZjifviCriteria.KAIPAN, TABLE_NAME, kaipan);
		return this;
	}

	public static final String ZUIGAO = "ZUIGAO";

	public ZjifviCriteria findByZuigao(Double zuigao) {
		this.findByPropertyEq(ZjifviCriteria.ZUIGAO, TABLE_NAME, zuigao);
		return this;
	}

	public static final String ZUIDI = "ZUIDI";

	public ZjifviCriteria findByZuidi(Double zuidi) {
		this.findByPropertyEq(ZjifviCriteria.ZUIDI, TABLE_NAME, zuidi);
		return this;
	}

	public static final String SHOUPAN = "SHOUPAN";

	public ZjifviCriteria findByShoupan(Double shoupan) {
		this.findByPropertyEq(ZjifviCriteria.SHOUPAN, TABLE_NAME, shoupan);
		return this;
	}

	public static final String CHENGJIAO = "CHENGJIAO";

	public ZjifviCriteria findByChengjiao(Integer chengjiao) {
		this.findByPropertyEq(ZjifviCriteria.CHENGJIAO, TABLE_NAME, chengjiao);
		return this;
	}

	public static final String CHICANG = "CHICANG";

	public ZjifviCriteria findByChicang(Integer chicang) {
		this.findByPropertyEq(ZjifviCriteria.CHICANG, TABLE_NAME, chicang);
		return this;
	}

	public ZjifviCriteria findByPkId(String dataId) {
		this.findByPropertyEq("DATA_ID", dataId);
		return this;
	}


}