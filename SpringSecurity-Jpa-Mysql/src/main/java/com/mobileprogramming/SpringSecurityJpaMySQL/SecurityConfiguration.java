package com.mobileprogramming.SpringSecurityJpaMySQL;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

		UserDetailsService userDetailsService;
		protected void congfigure(AuthenticationManagerBuilder auth) throws Exception
		{
			auth.userDetailsService(userDetailsService);
		}
		
		protected void configure(HttpSecurity http) throws Exception
		{
			http.authorizeRequests()
				.antMatchers("/admin").hasRole("ADMIN")
				.antMatchers("/user").hasAnyRole("ADMIN","USER")
				.antMatchers("/").permitAll()
				.and().formLogin();
		}
}
