package com.ieas.aplatform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AplatformApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(AplatformApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AplatformApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
	
	
}
