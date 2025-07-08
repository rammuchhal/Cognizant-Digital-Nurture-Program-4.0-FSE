package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
	@Autowired
	private static CountryRepository countryRepository;


	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		countryRepository = context.getBean(CountryRepository.class);

		try {
			getCountryByCodeTest();
			testAddCountry();
		} catch (CountryNotFoundException e) {
			LOGGER.error("Exception: ", e);
		}
		testSearchCountriesBySubstring();
		testSearchCountriesBySubstringSorted();
		testCountriesByStartingLetter();

	}

	private static void getCountryByCodeTest() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country: {}", country);
		LOGGER.info("End");
	}

	private static void testAddCountry() throws CountryNotFoundException {
		LOGGER.info("Start");

		// Step 1: Create new country
		Country country = new Country();
		country.setCode("ZZ");
		country.setName("Zootopia");

		// Step 2: Add country
		countryService.addCountry(country);

		// Step 3: Fetch added country by code
		Country addedCountry = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Added Country: {}", addedCountry);

		LOGGER.info("End");
	}
	private static void testSearchCountriesBySubstring() {
		LOGGER.info("Start - testSearchCountriesBySubstring");
		List<Country> countries = countryRepository.findByNameContainingIgnoreCase("ou");
		countries.forEach(country -> LOGGER.debug("{}", country));
		LOGGER.info("End");
	}

	private static void testSearchCountriesBySubstringSorted() {
		LOGGER.info("Start - testSearchCountriesBySubstringSorted");
		List<Country> countries = countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou");
		countries.forEach(country -> LOGGER.debug("{}", country));
		LOGGER.info("End");
	}

	private static void testCountriesByStartingLetter() {
		LOGGER.info("Start - testCountriesByStartingLetter");
		List<Country> countries = countryRepository.findByNameStartingWithIgnoreCase("Z");
		countries.forEach(country -> LOGGER.debug("{}", country));
		LOGGER.info("End");
	}


}
