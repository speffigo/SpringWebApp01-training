package com.springweb.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springweb.firstwebapp.services.AuthenticationService;

@Controller
public class LoginController {

	private AuthenticationService services;

	public LoginController(AuthenticationService services) {
		super();
		this.services = services;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (services.authenticate(name, password)) {
			model.put("Name", name);
			return "welcome";
		}
		model.put("error", "Oops!! Something went wrong");
		return "login";

	}
}
