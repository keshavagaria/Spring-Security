package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/api")
public class Demo {
	@RequestMapping("/get")
	public String hello()
	{
		return "home.jsp";
	}
}
