package com.csi.boot.SpringSecurityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.csi.spring")
public class SecurityAppMySQL {

	public static void main(String[] args) {
		SpringApplication.run(SecurityAppMySQL.class, args);
	}

}
