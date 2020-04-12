package com.vyb.coronatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CoronaTrackerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackerApplication.class, args);
	}

}
