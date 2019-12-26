package com.mobileprogramming.SpringSecurityJWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.mobileprogramming.filter.JwtRequestFilter;
import com.mobileprogramming.service.MyUserDetailsService;

@SpringBootApplication(scanBasePackages = {"com.mobileprogramming.controller",
		                                                                   "com.mobileprogramming.filter",
		                                                                   "com.mobileprogramming.model",
		                                                                   "com.mobileprogramming.service",
		                                                                   "com.mobileprogramming.configuration"})
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}
	
	
	
}
