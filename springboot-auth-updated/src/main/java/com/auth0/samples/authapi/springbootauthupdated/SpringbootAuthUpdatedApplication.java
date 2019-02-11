package com.auth0.samples.authapi.springbootauthupdated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		/** For enabling IPV4 Address*/
		//System.setProperty("java.net.preferIPv4Stack" , "true");
		//System.setProperty("java.net.preferIPv6Addresses" , "false");
		SpringApplication.run(SpringbootAuthUpdatedApplication.class, args);
	}
}
