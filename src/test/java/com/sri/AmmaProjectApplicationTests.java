package com.sri;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AmmaProjectApplicationTests {
	Logger logger= LoggerFactory.getLogger(AmmaProjectApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Welcome to AmmaProjectApplicationTests Test the application");
		assertEquals(true, true);
	}

}
