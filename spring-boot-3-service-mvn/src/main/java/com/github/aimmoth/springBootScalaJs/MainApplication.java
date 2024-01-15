package com.github.aimmoth.springBootScalaJs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class MainApplication {

	private static Logger logger = Logger.getLogger(MainApplication.class.getName());

	public static void main(String[] args) {
		logger.info("Staring application ...");
		SpringApplication.run(MainApplication.class, args);

	}

}
