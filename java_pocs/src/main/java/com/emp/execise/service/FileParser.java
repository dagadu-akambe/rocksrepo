package com.emp.execise.service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import com.emp.execise.pojo.WorldStatsDO;
import com.emp.execise.utils.Currency;

public class FileParser implements DataParser {

	private static final Logger LOGGER = Logger.getLogger(FileParser.class.getName());
	/**
	 * Reads file from resource directory
	 * @return File
	 * @throws IOException
	 */
	private File loadDataFile() throws IOException {
		ClassLoader loader = getClass().getClassLoader();
		return new File(loader.getResource("TestData.csv").getFile());
	}
	
	/**
	 * Parse CSV file and return List of Data Object.
	 * File should not contain empty lines in middle of the file otherwise 
	 * CSVParser throws IllegalArgumentException.
	 * @return
	 */
	@Override
	public List<WorldStatsDO> getWorldStatsData() {
		List<WorldStatsDO> worldStats = new ArrayList<>();	
		try {
			CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
			CSVParser parser = new CSVParser(new FileReader(loadDataFile()), format);
			parser.forEach(csvRecord->{
				WorldStatsDO worldStat = new WorldStatsDO();
				worldStat.setRegion(csvRecord.get("REGION").trim());
				worldStat.setCountry(csvRecord.get("COUNTRY").trim());
				worldStat.setAccountId(Long.parseLong(csvRecord.get("ACCOUNT_ID").trim()));
				worldStat.setCurrency(Currency.valueOf(csvRecord.get("CURRENCY").trim()));
				worldStat.setGrossProfit(Double.parseDouble(csvRecord.get("GROSS_PROFIT").trim()));
				worldStat.setTaxRate(Double.parseDouble(csvRecord.get("TAX_RATE").trim()));
				//calculate net profit and set
				worldStat.setNetProfit(worldStat.getGrossProfit()-(worldStat.getGrossProfit()*worldStat.getTaxRate()/100));
				//TODO isDebugEnabled needs to be added
				//LOGGER.info(worldStat.toString());
				worldStats.add(worldStat);
			});
		} catch(IOException | IllegalArgumentException ie) {
				ie.printStackTrace();
		}
		return worldStats;
	}
}
