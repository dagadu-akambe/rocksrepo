package com.emp.execise;

import java.util.Map;
import java.util.logging.Logger;

import com.emp.execise.service.DataParser;
import com.emp.execise.service.FileParser;
import com.emp.execise.service.RegionDataProcessorService;
import com.emp.execise.service.RegionDataProcessorServiceImpl;

/**
 * ApplicationLauncher instantiate DataParser and DataProcessingService
 *
 */
public class ApplicationLauncher {
	private static Logger LOGGER = Logger.getLogger(ApplicationLauncher.class.getName());
	
	public static void main(String[] args) {
		
		DataParser dataParser = new FileParser();
		RegionDataProcessorService regionalDataProcSVC = new RegionDataProcessorServiceImpl(dataParser);
		Map<String, Double> netProfitByRegion = regionalDataProcSVC.getNetProfitByRegion();
		LOGGER.info("************** NET PROFIT BY REGION ******************");
		for(Map.Entry<String, Double> entry: netProfitByRegion.entrySet()) {
			System.out.println("Region:\t "+entry.getKey() + " Double Value:\t "+entry.getValue()+" LongValue:\t"+entry.getValue().longValue());
		}
		
		Map<String, Double> grossProfitByCountry = regionalDataProcSVC.getGrossProfitByCountry();
		LOGGER.info("************** GROSS PROFIT BY REGION ******************");
		//print result
		for(Map.Entry<String, Double> entry : grossProfitByCountry.entrySet()) {
			System.out.println("Country:\t "+entry.getKey() + " DoubleValue:\t "+entry.getValue()+" LongValue:\t"+entry.getValue().longValue());
		}

	}
}
