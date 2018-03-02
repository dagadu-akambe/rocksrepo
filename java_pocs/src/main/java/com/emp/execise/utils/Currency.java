package com.emp.execise.utils;

public enum Currency {
	USD("USD"),CAN("CAN"),HKD("HKD"),SAR("SAR"),GBP("GBP"),EUR("EUR")
	,INR("INR"),AUD("AUD"),NZD("NZD"),MXN("MXN");
	
	private String value;
	private Currency(String value) {
		this.value=value;
	}
}
