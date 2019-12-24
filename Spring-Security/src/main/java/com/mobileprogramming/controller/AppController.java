package com.mobileprogramming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/hello")
	public String welcome()
	{
		return ("<h1>WECOME</h1>");
	}
}
