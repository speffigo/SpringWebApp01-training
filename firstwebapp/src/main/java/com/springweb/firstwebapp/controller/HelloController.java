package com.springweb.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hii")
	@ResponseBody
	public String myhello() {
		return "hello from here";
	}

	@RequestMapping("/Hello")
	public String sayhello() {
		return "hello";
	}
}
