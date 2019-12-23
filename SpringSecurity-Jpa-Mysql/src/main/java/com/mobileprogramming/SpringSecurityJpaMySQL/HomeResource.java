package com.mobileprogramming.SpringSecurityJpaMySQL;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeResource {
		
	
		@GetMapping("/")
		public String home()
		{
			return ("<h1>WELCOME</h1>");
		}
	
		@GetMapping("/user")
	   public String user()
		{
			return ("h1>WELCOME USER</h1>");
		}
		
	   @GetMapping("/admin")
		public String admin()
		{
			return ("<h1>WELCOME ADMIN</h1>");
		}
}
