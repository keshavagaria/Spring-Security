package com.csi.boot.SecurityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "com.csi.controller")
public class SecurityAppConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(SecurityAppConfiguration.class, args);
	}

}
