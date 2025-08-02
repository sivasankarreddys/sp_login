package com.jfs.ws.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jfs.ws.login.dto.LoginRequest;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
	
	
	
	@GetMapping("/name")
	public String getName(@RequestParam String name) {		
		return "Welcome to Login Page:"+name;
	}
	@PostMapping("/validate")
	public String login(@RequestBody LoginRequest loginRequest) {
		if("siva".equals(loginRequest.getUsername())&&"sankar".equals(loginRequest.getPassword())) {
			return "login successful!"; 
		}else if("admin".equals(loginRequest.getUsername())&& "admin".equals(loginRequest.getPassword())) {
			return "Admin login Successful!";
		}
		else {
		return "Invalid credentials";
		}
	}

}
