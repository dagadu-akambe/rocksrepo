package com.emp.execise.service;

import java.util.Map;

public interface RegionDataProcessorService {
	
	Map<String, Double> getNetProfitByRegion();
	Map<String, Double> getGrossProfitByCountry();
	String findMostProfitableRegion();
	

}
