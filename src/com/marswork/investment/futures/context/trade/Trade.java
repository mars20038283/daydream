package com.marswork.investment.futures.context.trade;

import java.util.Date;

import com.marswork.core.minitools.object.BasicUtils;
import com.marswork.investment.futures.context.account.VirtureAccount;
import com.marswork.investment.futures.context.goods.Goods;
import com.marswork.investment.futures.utils.DateUtils;
import com.marswork.investment.futures.utils.NumberUtils;

public class Trade {

	private VirtureAccount account;

	private Date date;

	private boolean isIn;

	private boolean isOpen;

	private Goods goods;

	private int price;

	private double shouXuFei;

	private int shou;

	private String signal;

	private Double semaphore;

	private double baozhengjin;

	private double huiluo;

	public double getZongJine() {
		return zongJine;
	}

	private double sum;

	private double zongJine;

	public Trade(VirtureAccount account, Date date, boolean isOpen,
			boolean isIn, Goods goods, double price, int shou) {
		this.account = account;
		this.date = date;
		this.isOpen = isOpen;
		this.isIn = isIn;
		this.goods = goods;
		this.shou = shou;

		this.price = isIn ? (int) Math.ceil(price) : (int) Math.floor(price);
		this.sum = goods.getFutures().getShou() * shou * this.price;

		//计算手续费
		if (goods.getFutures().isRiNeiJianBan() && !isOpen) {
			Trade lastTrade = account.getLastTrade();
			if (lastTrade.isOpen()
					&& lastTrade.getGoods().getFutures()
							.equals(goods.getFutures())
					&& DateUtils.isTheSameDay(lastTrade.getDate(), date)) {
				this.shouXuFei = 0;
			}
		} else if (goods.getFutures().isShouXuFeiBili()) {
			this.shouXuFei = this.sum * goods.getFutures().getShouXuFei()
					/ 10000;
		} else {
			this.shouXuFei = goods.getFutures().getShouXuFei();
		}
		//计算总金额
		this.zongJine = sum + (isIn ? shouXuFei : -shouXuFei);

		//计算保证金
		this.baozhengjin = NumberUtils.formatNumber(this.zongJine
				* this.goods.getFutures().getBaoZhengJin() / 100);
	}

	public boolean isIn() {
		return isIn;
	}

	public Goods getGoods() {
		return goods;
	}

	public int getPrice() {
		return price;
	}

	public double getShouXuFei() {
		return shouXuFei;
	}

	public int getShou() {
		return shou;
	}

	public double getSum() {
		return sum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Double getSemaphore() {
		return semaphore == null ? 0 : semaphore;
	}

	public void setSemaphore(Double semaphore) {
		this.semaphore = semaphore;
	}

	public VirtureAccount getAccount() {
		return account;
	}

	public double getBaozhengjin() {
		return baozhengjin;
	}

	public double getHuiluo() {
		return huiluo;
	}

	public void setHuiluo(double huiluo) {
		this.huiluo = huiluo;
	}
}
