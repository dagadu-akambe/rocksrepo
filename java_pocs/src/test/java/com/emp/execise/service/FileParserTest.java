package com.emp.execise.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;

import com.emp.execise.pojo.WorldStatsDO;

import org.junit.Test;

public class FileParserTest {
	
	private FileParser fileParser;
	private RegionDataProcessorServiceImpl serviceImpl;
	
	@Before
	public void init() {
		fileParser = new FileParser();
		serviceImpl = new RegionDataProcessorServiceImpl(fileParser);
	}
	
	@Test
	public void testGetStatsData() {
		List<WorldStatsDO> statData = fileParser.getWorldStatsData();
		Assert.assertEquals(33, statData.size());
	}

}
