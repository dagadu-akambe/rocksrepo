package com.emp.execise.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.Region;

import com.emp.execise.pojo.WorldStatsDO;
import com.emp.execise.utils.Utils;

public class RegionDataProcessorServiceImpl implements
		RegionDataProcessorService {

	private static final Logger LOGGER = LogManager.getLogManager().getLogger(RegionDataProcessorServiceImpl.class.getName());
	private DataParser dataParser;

	public RegionDataProcessorServiceImpl(DataParser dParser) {
		this.dataParser = dParser;
	}

	/**
	 * Get net profit by region in USD
	 * TODO Lambda can be used to groupBy region and find net profit.
	 */
	public Map<String, Double> getNetProfitByRegion() {
		Map<String, Double> netProfitByRegion = new HashMap<>();
		if (null != dataParser) {
			List<WorldStatsDO> statsData = dataParser.getWorldStatsData();
			try {
				if (!statsData.isEmpty()) {
					Set<String> allRegions = statsData.stream().map(WorldStatsDO::getRegion).collect(Collectors.toSet());
					allRegions.forEach(region->{
						for(WorldStatsDO data: statsData) {
							if(data.getRegion().equalsIgnoreCase(region)) {
								Double toUSD=0.0;
								if(null != netProfitByRegion.get(region)) {
									if(!data.getCurrency().toString().equalsIgnoreCase("USD")) {
										toUSD = Utils.getExchangeRate(data.getCurrency().toString())* data.getNetProfit();
										netProfitByRegion.put(region, netProfitByRegion.get(region)+toUSD);
									} else {
										netProfitByRegion.put(region, netProfitByRegion.get(region)+data.getNetProfit());
									}
									
								} else {
									if(!data.getCurrency().toString().equalsIgnoreCase("USD")) {
										toUSD = Utils.getExchangeRate(data.getCurrency().toString())* data.getNetProfit();
										netProfitByRegion.put(region, toUSD);
									} else {
										netProfitByRegion.put(region, data.getNetProfit());
									}
								}
							}
						}
					});
				}
			} catch(Exception e) {
				e.printStackTrace();
				LOGGER.info("Exception finding net progit by region "+e.getMessage());
			}
							
		}
		return netProfitByRegion;
	}

	/**
	 * Finds gross profits for all the countries
	 */
	public Map<String, Double> getGrossProfitByCountry() {
		// TODO Auto-generated method stub
		Map<String, Double> grossProfitByCntry = new HashMap<>();
		if(null != dataParser) {
			List<WorldStatsDO> dataSet = dataParser.getWorldStatsData();
			dataSet.forEach(worldStatDO ->{
				Double toUSD=0.0;
				if(null != grossProfitByCntry.get(worldStatDO.getCountry())) {
					if(!worldStatDO.getCurrency().toString().equalsIgnoreCase("USD")) {
						toUSD = Utils.getExchangeRate(worldStatDO.getCurrency().toString())* worldStatDO.getGrossProfit();
						//add to existing value
						grossProfitByCntry.put(worldStatDO.getCountry(), grossProfitByCntry.get(worldStatDO.getCountry())+toUSD);
					} else {
						grossProfitByCntry.put(worldStatDO.getCountry(), 
								grossProfitByCntry.get(worldStatDO.getCountry())+worldStatDO.getGrossProfit());
					}
				} else {
					if(!worldStatDO.getCurrency().toString().equalsIgnoreCase("USD")) {
						toUSD = Utils.getExchangeRate(worldStatDO.getCurrency().toString())* worldStatDO.getGrossProfit();
						grossProfitByCntry.put(worldStatDO.getCountry(), toUSD);
					} else {
						grossProfitByCntry.put(worldStatDO.getCountry(), worldStatDO.getNetProfit());
					}
				}
			});
		}

		return grossProfitByCntry;
	}

	public String findMostProfitableRegion() {
		// TODO Auto-generated method stub
		return null;
	}

}

@FunctionalInterface
interface TaxCalculatorInterface {
	Double deductTax(Double grossProfit, Double taxRate);
}
