package com.springweb.firstwebapp.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String user, String password) {
		boolean authenticatename = user.equalsIgnoreCase("Saurabh");
		boolean authenticatepassword = password.equalsIgnoreCase("pathak");

		return authenticatename && authenticatepassword;
	}

}
