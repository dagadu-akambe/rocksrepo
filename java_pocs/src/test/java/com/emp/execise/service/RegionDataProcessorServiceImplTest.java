package com.emp.execise.service;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegionDataProcessorServiceImplTest {

	private FileParser fileParser;
	private RegionDataProcessorServiceImpl serviceImpl;
	
	@Before
	public void init() {
		fileParser = new FileParser();
		serviceImpl = new RegionDataProcessorServiceImpl(fileParser);
	}
	
	@Test
	public void tesGeNetProfitRegion() {
		Map<String, Double> netByRegion = serviceImpl.getNetProfitByRegion();
		Assert.assertEquals(4, netByRegion.entrySet().size());
	}
	
	@Test
	public void tesGeGrossProfitByCountry() {
		Map<String, Double> netByRegion = serviceImpl.getGrossProfitByCountry();
		Assert.assertEquals(20, netByRegion.entrySet().size());
	}
}
