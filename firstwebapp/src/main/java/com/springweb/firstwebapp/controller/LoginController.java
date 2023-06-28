package com.springweb.firstwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springweb.firstwebapp.services.AuthenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	private AuthenticationService as;

	@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String login() {

		return "Loginpage";
	}

	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap m) {

		if (as.authenticate(name, password)) {

			m.put("name", name);

			return "Welcomepage";
		}

		m.put("errormessage", "Invalid credentials");
		return "Loginpage";
	}
}
