package com.mobileprogramming.SpringSecurityJWT;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@RequestMapping("/hello")
	public String  hello()
	{
		return "<h1>Hello World</h1>";
	}
}
