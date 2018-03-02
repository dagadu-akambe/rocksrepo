package com.emp.execise.utils;

import java.util.HashMap;
import java.util.Map;

public class Utils {
	
	private static Map<String, Double> exchangeRates = new HashMap<>();
	/**
	 * Currency exchange rate for 1 USD.
	 */
	
	static {
		exchangeRates.put("CAN", 0.81080);
		exchangeRates.put("HKD", 0.128983);
		exchangeRates.put("SAR", 0.266645);
		exchangeRates.put("GBP", 1.57217);
		exchangeRates.put("EUR", 1.11598);
		exchangeRates.put("INR", 0.0157311);
		exchangeRates.put("AUD", 0.772744);
		exchangeRates.put("NZD", 0.684621);
		exchangeRates.put("MXN", 0.0648290);
	}
	
	public static double getExchangeRate(String currencyCode){
		return exchangeRates.get(currencyCode);	
	}
	
}
