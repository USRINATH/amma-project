package com.sri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmmaProjectApplication {


    Logger logger= LoggerFactory.getLogger(AmmaProjectApplication.class);


    public void init(){

        logger.info("Jenkins Application is Up");
    }

	public static void main(String[] args) {
		SpringApplication.run(AmmaProjectApplication.class, args);
		//System.out.println("Welcome");
	}

}
