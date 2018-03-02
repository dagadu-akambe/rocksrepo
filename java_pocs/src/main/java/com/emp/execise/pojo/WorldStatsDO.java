package com.emp.execise.pojo;

import com.emp.execise.utils.Currency;

public class WorldStatsDO {
	private String region;
	private String country;
	private long accountId;
	private Currency currency;
	private double grossProfit;
	private double netProfit;
	private double taxRate;

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public double getGrossProfit() {
		return grossProfit;
	}
	public void setGrossProfit(double grossProfit) {
		this.grossProfit = grossProfit;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double netProfit) {
		this.netProfit = netProfit;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Region:" + this.region + ",country:" + this.country
				+ ",accountId:" + this.accountId + ",currency:" + this.currency
				+ ",grossProfit:" + this.grossProfit +",NetProfit:"+this.netProfit+ ",taxRate:"
				+ this.taxRate;
	}
}
