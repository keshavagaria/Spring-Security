package com.mobileprogramming.SpringSecurityJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin :-)</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>Hello User :-)</h1>");
	}

	@GetMapping("/")
	public String welcome() {
		return ("<h1>Welcome :-)</h1>");
	}
}
